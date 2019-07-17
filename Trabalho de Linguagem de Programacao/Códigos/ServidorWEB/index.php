<?php
header("Content-Type:application/json");
include ("function.php");
    if(!empty($_GET['name'])){ //Verifica se a url possui um nome informado
        $nome = $_GET['name']; //Pega as informa��es do nome da url. 
		//Ex: http://localhost/Servidor/index.php?name=java 
        $preco = get_price($nome); //Consegue o pre�o do produto requisitado usando a fun��o
        if(empty($preco)){ //Verifica se houve o retorno de um pre�o
            resposta(200, "Livro nao encontrado", NULL);   //Avisa que o livro n�o foi encontrado
        }else{
            resposta(200, "Livro encontrado", $preco); //Avisa que o livro foi encontrado e passa o pre�o dele
		}
    }else{
        resposta(400, "Pesquisa inv�lida", NULL);
    }

    function resposta($status, $status_message, $data){ //Cria o JSON de resposta
        header("HTTP/1.1 $status $status_message"); 
        //Dados da resposta
        $resposta['status'] = $status; 
        $resposta['status_message'] = $status_message;
        $resposta['data'] = $data;
        
        $json_response = json_encode($resposta); //Forma o JSON com os dados de $resposta
        echo $json_response; //Cria a p�gina do JSON
    }
?>