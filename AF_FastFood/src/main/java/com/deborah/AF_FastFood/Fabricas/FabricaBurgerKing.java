package com.deborah.AF_FastFood.Fabricas;

import com.deborah.AF_FastFood.Bebidas.*;
import com.deborah.AF_FastFood.Lanches.*;

public class FabricaBurgerKing implements FabricaFastFood {

	@Override
	public Lanche criarLanche() {
		return new Whopper();
	}

	@Override
	public Bebida criarBebida() {
		return new Pepsi();
	}
}
