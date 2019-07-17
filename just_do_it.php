<html>
<head>
<title>just do it!!!</title>

<style>
input{
	
	width:95%;
	
}
</style>

</head>
<body style="background-color:grey;">
<font color="white">
<br><br>
<center>
<form method="POST" action="just_do_it.php">

<label>Digite a Query</label><br><br><input type="text" name="here">


</form>
</font>
<br><br>


<?php

$servername = "localhost";
$username = "root";
$password = "";

$lines = 0;

try {
    $conn = new PDO('mysql:host=localhost;dbname=compubras', $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch(PDOException $e) {
    echo 'ERROR: ' . $e->getMessage();
}

  //$sql = "SELECT * FROM cliente Where cliente.nome LIKE \"A%\"";
  $sql = $_POST["here"];
	//$sql = "Select Cliente.*, Pedido.PrazoEntrega From Cliente INNER JOIN Pedido ON Pedido.CodCliente = Cliente.CodCliente Order by Pedido.PrazoEntrega DESC";
   // $resultado = $conn->query($sql);
   
   $stmt = $conn->query($sql);
   
while($row = $stmt->fetch()) {
	
$lines++;

}

	?>
	<font size="70px">
    <?php
    echo $lines."<br><br>";
    ?>
    </font>
	</center>
	<?php
	
	
  $stmt = $conn->query($sql);

while($row = $stmt->fetch()) {
	
print_r($row);

?>
<hr align="center" width="100%" size="10" color=black>
<?php	
}
?>


</body>
</html>