<!DOCTYPE html>
<html>
<head>

		<TITLE>Avaliação</TITLE>
		<META name="author" content="Gabriel William Schneider">
		<META http-equiv="Content-Type" content="text/html; charset=utf-8">	
		<link href="Estilos/Stylesheet.css" rel="stylesheet" type="text/css">
		
</head>
<body>


<BR><BR>
        <!--Questão 1-->
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>1) Redirecionamento</LEGEND>
			
				<LABEL>Digite Globo ou Gmail:</LABEL><BR>
				
				<INPUT TYPE="text"  Name="dados"><BR>
				<INPUT TYPE="submit" Name="quest_1" value="Enviar">
				
			</FORM>	
			
			<DIV class = "area_de_resposta">	
			
			<?php

include 'PHP/funcoes.php';

//questão 1:
if(isset($_POST['quest_1'])){
	
	$dados = $_POST['dados'];

	redirecionar($dados);
	
}

			?>
			
			</DIV>
<BR><BR>		
		
        <!--Questão 2-->
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>2) Array de nomes</LEGEND>
			
				<LABEL>digite um array de nomes os separando com espaço(" "):</LABEL><BR>
				
				<INPUT TYPE="text"  Name="dados"><BR>
				<INPUT TYPE="submit" Name="quest_2" value="Enviar">
				
			</FORM>	
			
			<DIV class = "area_de_resposta" id="quest_2" />	
			
						<?php

//questão 2:
if(isset($_POST['quest_2'])){
	
	$dados = $_POST['dados'];
	print_r(ordenar($dados));
	
}
			?>
			
<BR><BR>		
			
        <!--Questão 3-->
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>3) Arrumar data</LEGEND>
			
				<LABEL>digite uma data no formato YYYY-MM-DD</LABEL><BR>
				
				<INPUT TYPE="text"  Name="dados"><BR>
				<INPUT TYPE="submit" Name="quest_3" value="Enviar">
				
			</FORM>	
			
			<DIV class = "area_de_resposta" id="quest_3" />

			<?php

//questão 3:
if(isset($_POST['quest_3'])){
	
	$dados = $_POST['dados'];
	
	$data_arrumada = arrumar_data($dados);
	
	echo $data_arrumada;
	
}

			?>
			
<BR><BR>	
		
        <!--Questão 4-->
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>4) Ver se é primo</LEGEND>
			
				<LABEL>Digite um número</LABEL><BR>
				
				<INPUT TYPE="text"  Name="dados"><BR>
				<INPUT TYPE="submit" Name="quest_4" value="Enviar">
				
			</FORM>	
			
			<DIV class = "area_de_resposta" id="quest_4" />

			<?php

//questão 4:
if(isset($_POST['quest_4'])){
	
    $dados = $_POST['dados'];
	
	$resultado = primo($dados);
	
	if($resultado==0){
		echo "$dados não é primo";
	}else{
		echo "$dados é primo";
	}
	
}

			?>
			
<BR><BR>
			
        <!--Questão 5-->
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>5) Primeira letra do nome maiúscula</LEGEND>
			
				<LABEL>Digite um nome completo</LABEL><BR>
				
				<INPUT TYPE="text"  Name="dados"><BR>
				<INPUT TYPE="submit" Name="quest_5" value="Enviar">
				
			</FORM>	
			
			<DIV class = "area_de_resposta" id="quest_5" />	
			
			<?php

//questão 5:
if(isset($_POST['quest_5'])){
	
	$dados = $_POST['dados'];
	
	arrumar_nome($dados);
	
}

			?>






<script type="text/javascript" src="Scripts/Main.js"/>
</body>
</html>