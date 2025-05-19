package com.deborah.AF_Chocolate.Fabricas;
import com.deborah.AF_Chocolate.Produtos.Chocolate;

public interface FabricaChocolate {
	Chocolate criarBarraChocolate();
    Chocolate criarCaixaChocolate();
    Chocolate criarBombomChocolate();
}
