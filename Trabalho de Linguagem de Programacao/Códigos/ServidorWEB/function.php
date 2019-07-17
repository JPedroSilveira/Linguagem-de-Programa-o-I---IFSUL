<?php
    function get_price($procurar){ //Funзгo para pesquisar e retornar o preзo do produto
        $livros = array(  //Lista de produtos
            "java" => 299,
            "c" => 343,
            "php" => 223
        );
        $price=NULL;
        foreach($livros as $livro=>$preco){ //Passa pelo array atй encontrar o livro pesquisado
            if($livro == $procurar)
            {
                $price=$preco;
                break;
            }
        }
		return $price; //Retorna o $preco que caso nгo tenha sido modificado ficarб como Null
    }
?>