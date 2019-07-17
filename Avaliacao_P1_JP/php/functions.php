<?php
/* Atividade 1*/
	function redirecionamento($site){
		if($site == 'globo'){
			Header("location: http://www.globo.com.br");
			return 'Redirecionando para globo.com';
		}else if($site == 'gmail'){
			Header("location: http://www.gmail.com");
			return 'Redirecionando para gmail.com';
		}else{
			return 'Site desconhecido';
		}
	}
/* Atividade 2*/
	function ordenando($nomes){
	    sort($nomes);
		return $nomes;
	}
/* Atividade 3*/
	function texto_data($data){
		$mes = substr($data,5,2);
		switch ($mes){
			case '01':
				$mes = 'Janeiro';
				break;
			case '02':
				$mes = 'Fevereiro';
				break;
			case '03':
				$mes = 'Março';
				break;
			case '04':
				$mes = 'Abril';
				break;
			case '05':
				$mes = 'Maio';
				break;
			case '06':
				$mes = 'Junho';
				break;
			case '07':
				$mes = 'Julho';
				break;
			case '08':
				$mes = 'Agosto';
				break;
			case '09':
				$mes = 'Setembro';
				break;
			case '10':
				$mes = 'Outubro';
				break;
			case '11':
				$mes = 'Novembro';
				break;
			case '12':
				$mes = 'Dezembro';
				break;
		}
		$data_n = 'Sapucaia do Sul, '.substr($data,8,2).' de '.$mes.' de '.substr($data,0,4);
		return $data_n;
	}
/* Atividade 4*/
	function primo($numero, $devolver){ 
	/* primo($numero, $devolver) onde $numero é o valor que se saber se é primo ou não e 
	$devolver é a opção se quer o retorno da resposta "sim ou não" ou os números que dividem o valor
	(0 para retorno de: true = é primo ou false = não é primo. E qualquer outro valor para retorno de todos os números ao qual $numero é divisivel com resto 0)*/
		
		if($devolver == 1){ //Devolve todos os números que dividem $numero, modo completo
			$resposta = array();
			$cont=0;
			for($i=1; $i<=$numero; $i++){
				if($numero%$i==0){
					$resposta[$cont] = $i;
					$cont++;
				}
			}
			
		}else{ //Apenas diz se é primo(true) ou se não é (false), modo 
			if($numero==1||$numero==0){ //0 e 1 não são primos
				$resposta=false;
			}else if($numero==2){ //Retiramos o 2 da equação, para depois tirar todos os números pares, o 1 vai de bônus
				$resposta=true;
			}else{	
				if($numero%2==0){ 
				$resposta=false;
				}else{ //Só entrará caso não for divisivel por 2, ou seja por todos os números pares
					$resposta=true; //É primo até que digam o contrário
					$condicao=round(sqrt($numero),0)+1; //Tiro a raiz,arredondo e adiciono +1(arredondamento para o maior valor sempre)
					for($condicao2=3; $condicao2<$condicao; $condicao2++,$condicao2++){ //Só testará com os numeros impares entre a raiz do número escolhido e 3;
						if($numero%$condicao2==0){
								$resposta=false;
								break;
						}
					}
				}
			}
		}
		return $resposta;
			
	}
/* Atividade 5*/	
	function arruma_nome($nome){
		$nomes = explode(" ", $nome);
		$numero_nomes=count($nomes);
		for($i=0;$i<$numero_nomes;$i++){
			$comparacao = strtolower($nomes[$i]);
			if($comparacao=="e" || $comparacao=="de" || $comparacao=="da" ||$comparacao=="dos" ||$comparacao=="das" ||$comparacao=="do" ){
				$nomes[$i] = strtolower($nomes[$i]);
			}else{
				$nomes[$i]= strtoupper($nomes[$i]);
				$nomes[$i]= ucfirst(strtolower($nomes[$i]));
			}
		}
		$nome = implode(" ", $nomes);
		return $nome;
	}
	
?>