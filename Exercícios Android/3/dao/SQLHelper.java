package dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alunoinfo on 02/05/17.
 */

public class SQLHelper extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "bd_contatos";
    private static final int VERSAO = 1;
    private static SQLHelper instance;

//    public SQLHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }

    //É necessário passar um contexto para definir as dependencias ao banco
    private SQLHelper(Context ctx){
        super(ctx, NOME_BANCO, null, VERSAO);
    }

    public static SQLHelper getInstance(Context ctx){
        if(instance.equals(null)){
            instance = new SQLHelper(ctx);
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ContatoDAO.createContato);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
