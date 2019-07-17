<?php
header("Content-Type:application/json");
include ("function.php");
    if(!empty($_GET['name'])){ //Verifica se a url possui um nome informado
        $nome = $_GET['name']; //Pega as informações do nome da url. 
		//Ex: http://localhost/Servidor/index.php?name=java 
        $preco = get_price($nome); //Consegue o preço do produto requisitado usando a função
        if(empty($preco)){ //Verifica se houve o retorno de um preço
            resposta(200, "Livro nao encontrado", NULL);   //Avisa que o livro não foi encontrado
        }else{
            resposta(200, "Livro encontrado", $preco); //Avisa que o livro foi encontrado e passa o preço dele
		}
    }else{
        resposta(400, "Pesquisa inválida", NULL);
    }

    function resposta($status, $status_message, $data){ //Cria o JSON de resposta
        header("HTTP/1.1 $status $status_message"); 
        //Dados da resposta
        $resposta['status'] = $status; 
        $resposta['status_message'] = $status_message;
        $resposta['data'] = $data;
        
        $json_response = json_encode($resposta); //Forma o JSON com os dados de $resposta
        echo $json_response; //Cria a página do JSON
    }
?>