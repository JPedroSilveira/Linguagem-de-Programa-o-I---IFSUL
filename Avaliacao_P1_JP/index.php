<!DOCTYPE HTML>
<HTML>
	<HEAD>
		<TITLE>Avaliação P1</TITLE>
		<META name="author" content="João Pedro S. Silva">
		<META http-equiv="Content-Type" content="text/html; charset=utf-8">	
		<STYLE type='text/css'>
		<?php include 'css/main.css'; ?>
		</STYLE>
	</HEAD>
	<BODY>
	<?php include 'php/functions.php'; /*set_time_limit(0);*/?>
	<!--Atividade 1-->
	<DIV id="container">
		<DIV class="areapreenchimento">	
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>1) Redirecionamento</LEGEND>
				<BR>
				<LABEL>Digite gmail ou globo:</LABEL>
				<INPUT TYPE="text"  Name="site"/><BR>
				<INPUT TYPE="submit" value="Ok" Name="ok"/>
			</FORM>	
			<?php
			if (isset($_POST['ok'])) {
				$site = $_POST['site'];
				$resposta1 =  redirecionamento($site);
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly> $resposta1 </TEXTAREA><CENTER>";
			}else{
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly>  </TEXTAREA><CENTER>";
			}
			?>
		</DIV>	
		
		
		<!--Atividade 2-->
		<DIV class="areapreenchimento">	
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>2) Nomes</LEGEND>
				<BR>
				<LABEL>Digite nomes separando-os com vírgula(,) e espaço( ):</LABEL>
				<INPUT TYPE="text"  Name="nomes"/><BR>
				<INPUT TYPE="submit" value="Enviar" Name="ok_nomes"/>
			</FORM>	
			<?php
			if (isset($_POST['ok_nomes'])) {
				$nome = $_POST['nomes'];
				$nomes = explode(", ", $nome);
				$nomes=ordenando($nomes);
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly>"; 
				$max = count($nomes);
				if($max==0){
					echo "Por favor, digite nomes válido e lembre de separa-los vírgula(,) e espaço( ).";
				}else{
					echo "Nomes ordenados por ordem alfabetica: ";
					for ($i = 0; $i < $max; $i++){	
						if($i==0){
							echo " ".$nomes[$i];
						}else if($max-$i==1){
							echo " e ".$nomes[$i].". ";
						}else{
							echo ", ".$nomes[$i];
						}
					}
				}	
				echo "</TEXTAREA><CENTER>";
			}else{
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly>  </TEXTAREA><CENTER>";
			}
			?>
		</DIV>
		<!--Atividade 3-->
		<DIV class="areapreenchimento">	
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>3) Ajuste do formato de dada</LEGEND>
				<BR>
				<LABEL>Digite uma data no formato aaaa-mm-dd: </LABEL>
				<INPUT TYPE="text"  Name="data"/><BR>
				<INPUT TYPE="submit" value="Enviar" Name="ok_data"/>
			</FORM>	
			<?php
			if (isset($_POST['ok_data'])) {
				$data = $_POST['data'];
				$resposta3 = texto_data($data);
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly> $resposta3 </TEXTAREA><CENTER>";
			}else{
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly>  </TEXTAREA><CENTER>";
			}
			?>
		</DIV>	
		
		<!--Atividade 4-->
		<DIV class="areapreenchimento">	
			<FORM NAME="form_primo" METHOD="POST" ACTION="index.php">
			<LEGEND>4) Verificação de número primo</LEGEND>
				<BR>
				<LABEL>Digite o número:</LABEL>
				<INPUT TYPE="text"  Name="numero"/><BR>
				<INPUT TYPE="submit" value="Básico" Name="basico"/>
				<INPUT TYPE="submit" value="Completo" Name="completo"/>
			</FORM>
			<?php 
				if (isset($_POST['basico'])) {
					$numero = $_POST['numero'];
					$resposta3 = primo($numero,0);
					if($resposta3==false){
						$exibir = "O número ".$numero." não é primo";
					}else{
						$exibir = "O número ".$numero." é primo";
					}
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly> $exibir </TEXTAREA><CENTER>";
				}else if(isset($_POST['completo'])){
					$numero = $_POST['numero'];
					$resposta4 = primo($numero,1);
					echo "<CENTER><TEXTAREA rows='2' cols='40' readonly>"; 
					$max = count($resposta4);
					if($max==0){ /*Se o número for 0 não irá retornar valor algum*/
						echo "O número não é primo";
					}else{
						if($max==2){
							echo "O número é primo e só é divisivel por: ";
						}else{
							echo "O número ".$numero." não é primo e é divisivel por: ";
						}
						for ($i = 0; $i < $max; $i++){	
							if($i==0){
								echo " ".$resposta4[$i];
							}else if($max-$i==1){
								echo " e ".$resposta4[$i].". ";
							}else{
								echo ", ".$resposta4[$i];
							}
						}
					}	
					echo "</TEXTAREA><CENTER>";
				}else{
					echo "<CENTER><TEXTAREA rows='2' cols='40' readonly>  </TEXTAREA><CENTER>";
				}
			?>	
			
		</DIV>
		<!--Atividade 5-->
		<DIV class="areapreenchimento">	
			<FORM NAME="form_redireciona" METHOD="POST" ACTION="index.php">
			<LEGEND>5) Ajustando nomes</LEGEND>
				<BR>
				<LABEL>Digite um nome completo:</LABEL>
				<INPUT TYPE="text"  Name="nome_completo"/><BR>
				<INPUT TYPE="submit" value="Enviar" Name="ok_nome_completo"/>
			</FORM>	
			<?php
			if (isset($_POST['ok_nome_completo'])) {
				$nome_completo = $_POST['nome_completo'];
				$resposta5 =  arruma_nome($nome_completo);
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly> $resposta5 </TEXTAREA><CENTER>";
			}else{
				echo "<CENTER><TEXTAREA rows='2' cols='40' readonly>  </TEXTAREA><CENTER>";
			}
			?>
		</DIV>
		
		<DIV class="areapreenchimento">	
		<CENTER><A href="http://joaopedro.tk/"><IMG src="img/logo.png" alt="joaopedro.tk"/></A></CENTER>
		</DIV>
	</DIV>
	</BODY>
</HTML>