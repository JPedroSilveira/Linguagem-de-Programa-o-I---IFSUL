<?php
    function get_price($procurar){ //Fun��o para pesquisar e retornar o pre�o do produto
        $livros = array(  //Lista de produtos
            "java" => 299,
            "c" => 343,
            "php" => 223
        );
        $price=NULL;
        foreach($livros as $livro=>$preco){ //Passa pelo array at� encontrar o livro pesquisado
            if($livro == $procurar)
            {
                $price=$preco;
                break;
            }
        }
		return $price; //Retorna o $preco que caso n�o tenha sido modificado ficar� como Null
    }
?>