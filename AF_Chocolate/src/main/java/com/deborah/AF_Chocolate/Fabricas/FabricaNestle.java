package com.deborah.AF_Chocolate.Fabricas;

import com.deborah.AF_Chocolate.Produtos.Alpino;
import com.deborah.AF_Chocolate.Produtos.Chocolate;
import com.deborah.AF_Chocolate.Produtos.Prestigio;
import com.deborah.AF_Chocolate.Produtos.Sensacao;

public class FabricaNestle implements FabricaChocolate {

	@Override
	public Chocolate criarBarraChocolate() {
		return new Alpino();
	}

	@Override
	public Chocolate criarCaixaChocolate() {
		return new Prestigio();
	}

	@Override
	public Chocolate criarBombomChocolate() {
		return new Sensacao();
	}
}
