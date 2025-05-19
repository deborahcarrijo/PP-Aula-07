package com.deborah.AF_FastFood.Fabricas;

import com.deborah.AF_FastFood.Bebidas.*;
import com.deborah.AF_FastFood.Lanches.*;

public class FabricaMcDonalds implements FabricaFastFood {

	@Override
	public Lanche criarLanche() {
		return new BigMac();
	}

	@Override
	public Bebida criarBebida() {
		return new CocaCola();
	}
}
