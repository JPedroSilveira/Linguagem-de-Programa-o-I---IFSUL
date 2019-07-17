package dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import pojo.Contato;

/**
 * Created by alunoinfo on 09/05/17.
 */

public class ContatoDAO {
    private static final String nomeTable = "Contato";

    private static final String colunaId = "Id";
    private static final String colunaNome = "Nome";
    private static final String colunaEmail = "Email";
    private static final String colunaTelefone = "Telefone";

    public static final String createContato = "CREATE TABLE "+ nomeTable + "("+ colunaId + " INTEGER PRIMARY KEY  AUTOINCREMENT NOT NULL UNIQUE," + colunaNome + " TEXT NOT NULL," + colunaEmail + " TEXT NOT NULL," + colunaTelefone + " TEXT NOT NULL)";

    private SQLiteDatabase db;

    public ContatoDAO(Context ctx){
        this.db = SQLHelper.getInstance(ctx).getWritableDatabase();
    }

    //Converte a tabela para um tipo reconhecido pelo SQLite
    private ContentValues contatoToValues(Contato contato){
        ContentValues values = new ContentValues();
        values.put(colunaNome, contato.getNome());
        values.put(colunaEmail, contato.getEmail());
        values.put(colunaTelefone, contato.getTelefone());

        return values;
    }

    public boolean salvar(Contato contato){
        long id = this.db.insert(this.nomeTable, null, this.contatoToValues(contato));
        return id != -1 ? true : false;
    }

    public void editar(Contato contato){
        String where = "WHERE Id = ?";
        String whereArgs[] = {String.valueOf(contato.getId())};
        this.db.update(this.nomeTable, this.contatoToValues(contato), where, whereArgs);
    }

    public void excluir(int id) {
        String where = "where id=?";
        String whereArgs[] = {String.valueOf(id)};
        this.db.delete(this.nomeTable, where, whereArgs);
    }

    //Invez de ser um ArrayList poderia ser um cursor. Mas ai iria quebrar a hierarquia de classes
    //Pojos | Activity -> DAO <-> BD
    public ArrayList<Contato> listar(){
        String sqlBusca = "SELECT * FROM " + this.nomeTable;
        //O rawQuery faz a busca nas tabelas e retorna um cursor
        Cursor cursor = this.db.rawQuery(sqlBusca, null);

        ArrayList<Contato> listaContato = new ArrayList<Contato>();
        Contato contato;

        //Converter nome das colunas em indices
        int indiceColunaId = cursor.getColumnIndex(colunaId);
        int indiceColunaNome = cursor.getColumnIndex(colunaNome);
        int indiceColunaEmail = cursor.getColumnIndex(colunaEmail);
        int indiceColunaTelefone = cursor.getColumnIndex(colunaTelefone);

        //verifica se o objeto existe e passa para o próximo
        while(cursor.moveToNext()) {

            //Converter uma linha em um comando
            contato = new Contato();

            contato.setId(cursor.getInt(indiceColunaId));
            contato.setNome(cursor.getString(indiceColunaNome));
            contato.setEmail(cursor.getString(indiceColunaEmail));
            contato.setTelefone(cursor.getString(indiceColunaTelefone));

            //Adicionar o contato no arrayList
            listaContato.add(contato);
        }
        return listaContato;
    }

}
