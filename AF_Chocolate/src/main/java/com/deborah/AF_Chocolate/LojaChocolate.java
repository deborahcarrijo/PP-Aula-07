package com.deborah.AF_Chocolate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.deborah.AF_Chocolate.Produtos.Chocolate;
import com.deborah.AF_Chocolate.Fabricas.*;

@SpringBootApplication
public class LojaChocolate {

	public static void main(String[] args) {
		FabricaChocolate fabricaNestle = new FabricaNestle();
        Chocolate c1 = fabricaNestle.criarBarraChocolate();
        Chocolate c2 = fabricaNestle.criarCaixaChocolate();
        Chocolate c5 = fabricaNestle.criarBombomChocolate();

        FabricaChocolate fabricaLacta = new FabricaLacta();
        Chocolate c3 = fabricaLacta.criarBarraChocolate();
        Chocolate c4 = fabricaLacta.criarCaixaChocolate();
        Chocolate c6 = fabricaLacta.criarBombomChocolate();

        System.out.println("Chocolates da Nestlé:");
        c1.exibirDetalhes();
        c2.exibirDetalhes();
        c5.exibirDetalhes();

        System.out.println("\nChocolates da Lacta:");
        c3.exibirDetalhes();
        c4.exibirDetalhes();
        c6.exibirDetalhes();
    }
}
