package com.example.alunoinfo.exemplo_bd_interno;

//Adicionar libs

public class TelaListar extends Listar{
  private ContatoDAO contatoDAO;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    this.inicializaComponentes();

    ArrayList<Contato> listaContatos = this.contatoDAO.listar();
    ArrayAdapter<Contato> adapterContato = new ArrayAdapter<Contato>(this, android.R.layout.simple_list_item_1, listaContatos);

    super.setListAdapter(adapterContato);
  }

  private void inicializaComponentes(){
    this.contatoDAO = new ContatoDAO(this);
  }
}
