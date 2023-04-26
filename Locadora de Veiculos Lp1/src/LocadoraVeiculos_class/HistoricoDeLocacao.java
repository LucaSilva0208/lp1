package LocadoraVeiculos_class;

import java.util.ArrayList;

public class HistoricoDeLocacao {
	private ArrayList<Locacao> historico = new ArrayList<Locacao>();

	public boolean Verificar(Locacao loc) {
		return historico.contains(loc);
	}
public void Adicionar(Locacao loc) {
	if (!Verificar(loc)) {
		historico.add(loc);
	}
	}
public void Remover(Locacao loc) {
	historico.remove(loc);
}
}
		
	
	

		
}
