package com.deborah.AF_FastFood.Fabricas;

import com.deborah.AF_FastFood.Bebidas.*;
import com.deborah.AF_FastFood.Lanches.*;

public class FabricaHabibs implements FabricaFastFood {

	@Override
	public Lanche criarLanche() {
		return new Bibsfiha();
	}

	@Override
	public Bebida criarBebida() {
		return new Guarana();
	}
}
