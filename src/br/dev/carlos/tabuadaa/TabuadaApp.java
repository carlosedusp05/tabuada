package br.dev.carlos.tabuadaa;

import br.dev.carlos.tabuadaa.model.Tabuada;

public class TabuadaApp {

	public static void main(String[] args) {
		
	Tabuada t1 = new Tabuada();
	t1.setMultipilicando(8);
    t1.setMinimoMultiplicador(4);
    t1.setMaximoMultiplicador(6);
    t1.mostrarTabuada();
    
    Tabuada t2 = new Tabuada();
    t2.setMultipilicando(459);
    t2.setMinimoMultiplicador(687);
    t2.setMaximoMultiplicador(714);
    t2.mostrarTabuada();
      
	}

}
