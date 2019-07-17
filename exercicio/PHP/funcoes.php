


<?php

//questão 1
function redirecionar($site){

	Switch($site){
		case "globo":
		header("Location: http://www.globo.com.br");
		break;
		case "gmail":
		Header ("location: http://www.gmail.com.br");
		break;
		default:
		echo "Site Desconhecido"; 
		break;	
	}
	
	
}

//questão 2
function ordenar($dados){
	
	$array_nomes = explode(" ",$dados);
	natcasesort($array_nomes);
	
	return $array_nomes;
	
	
}

//questão 3
function arrumar_data($dados){
	
$array_data = explode("-",$dados);

$numero_do_mes = $array_data[1];

  $mes = array('', 'Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro');
	
	$data_arrumada = "Sapucaia do Sul, $array_data[2] de $mes[$numero_do_mes] de $array_data[0]";
	
	return $data_arrumada;
	
}

//questão 4
function primo($n){
	
      $i= 1;
      if ($n == 2 || $n == 3)
    return 1;
      if ($n % 2 == 0)
    return 0;
      for ($i= 3 ; $i*$i < $n && $n % $i != 0; $i+= 2);
      return $n % $i != 0;
    
	
}


//questão 5
function arrumar_nome($dados){
	
$array_nome = explode(" ",$dados);

for($i=0;$i<count($array_nome);$i++){
	
	if(strlen($array_nome[$i])>2){
        $array_palavra = str_split($array_nome[$i]);
		$array_palavra[0] = Strtoupper($array_palavra[0]);
		$array_nome[$i] = implode("", $array_palavra);
		}
	
}

   /* 
	foreach($array_nome as $nome){
		if(strlen($nome)>2){
        $array_palavra = str_split($nome);
		$array_palavra[0] = Strtoupper($array_palavra[0]);
		$nome = implode("", $array_palavra);
		}
	}
	print_r($array_nome);*/
	echo implode(" ",$array_nome);
	
}




?>