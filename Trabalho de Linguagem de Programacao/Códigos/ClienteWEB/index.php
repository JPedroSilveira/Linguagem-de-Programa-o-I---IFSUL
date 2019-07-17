<!DOCTYPE HTML>

<HTML>
	<HEAD>
		<TITLE>Cliente</TITLE>
		<META name="author" content="Grupo WEBSERVICE">
		<META http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	</HEAD>
	<BODY>
			<FORM ACTION = "" METHOD="POST" >
			<CENTER><LEGEND>Pesquisa de livro</LEGEND>
				<BR>
				<LABEL>Digite o nome do livro:</LABEL>
				<INPUT TYPE="text"  id="livro" name="livro"/><BR>
				<INPUT TYPE="submit" Name="submit"/>
			</FORM></CENTER>	
			<?php	
			if(isset($_POST['submit'])){ //Verifica se foi informado um livro
				$name = $_POST['livro']; //Pega o valor digitado      
				$url = "http://localhost/ServidorWEB/index.php?name=$name"; //Define o local do servidor  
				$client = curl_init($url); //Define a variavel de inicialização da requisiçãoo para o servidor
				curl_setopt($client,CURLOPT_RETURNTRANSFER,1);//Envia a requisiçãoo com o nome encontrado para servidor, 
				//1 ou TRUE servem para que o resultado retorne durante o curl_exec
				$response = curl_exec($client); //Pega a resposta do servidor   
				$result = json_decode($response); //Pega os dados do arquivo JSON passado pelo servidor
				echo "<CENTER><TEXTAREA cols='40' readonly> Produto: $name | Status: $result->status_message | Preço: $result->data </TEXTAREA><CENTER>"; 
				//Insere as informaões para o usuário
			}else{
				echo "<CENTER><TEXTAREA cols='40' readonly>  </TEXTAREA><CENTER>";
			}
			?>
	</BODY>
</HTML>


