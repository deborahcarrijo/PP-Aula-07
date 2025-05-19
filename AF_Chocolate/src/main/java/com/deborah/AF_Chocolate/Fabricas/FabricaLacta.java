package com.deborah.AF_Chocolate.Fabricas;

import com.deborah.AF_Chocolate.Produtos.Bis;
import com.deborah.AF_Chocolate.Produtos.Chocolate;
import com.deborah.AF_Chocolate.Produtos.Laka;
import com.deborah.AF_Chocolate.Produtos.SonhoDeValsa;

public class FabricaLacta implements FabricaChocolate {

	@Override
	public Chocolate criarBarraChocolate() {
		return new Laka();
	}

	@Override
	public Chocolate criarCaixaChocolate() {
		return new Bis();
	}

	@Override
	public Chocolate criarBombomChocolate() {
		return new SonhoDeValsa();
	}
}
