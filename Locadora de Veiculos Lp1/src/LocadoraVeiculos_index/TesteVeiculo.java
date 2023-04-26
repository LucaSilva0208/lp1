package LocadoraVeiculos_index;

import LocadoraVeiculos_class.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		Veiculo v1 = new Veiculo("Uno", "Fiat", "PPAH660", 220, true);
		System.out.println(v1.Descricao());
	}
}
