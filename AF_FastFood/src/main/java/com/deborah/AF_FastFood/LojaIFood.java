package com.deborah.AF_FastFood;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.deborah.AF_FastFood.Bebidas.*;
import com.deborah.AF_FastFood.Lanches.*;
import com.deborah.AF_FastFood.Fabricas.*;

@SpringBootApplication
public class LojaIFood {

	public static void main(String[] args) {
		FabricaFastFood fabricaMc = new FabricaMcDonalds();
        Lanche lancheMc = fabricaMc.criarLanche();
        Bebida bebidaMc = fabricaMc.criarBebida();

        System.out.println("Pedido McDonald's:");
        lancheMc.exibirInfo();
        bebidaMc.exibirInfo();

        System.out.println();

        FabricaFastFood fabricaBk = new FabricaBurgerKing();
        Lanche lancheBk = fabricaBk.criarLanche();
        Bebida bebidaBk = fabricaBk.criarBebida();

        System.out.println("Pedido Burger King:");
        lancheBk.exibirInfo();
        bebidaBk.exibirInfo();
        
        System.out.println();
        
        FabricaFastFood fabricaHabibs = new FabricaHabibs();
        Lanche lancheHabibs = fabricaHabibs.criarLanche();
        Bebida bebidaHabibs = fabricaHabibs.criarBebida();

        System.out.println("Pedido Habib's:");
        lancheHabibs.exibirInfo();
        bebidaHabibs.exibirInfo();
    }
}
