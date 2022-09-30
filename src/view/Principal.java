package view;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import controller.pessoa;

public class Principal {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		pessoa p = new pessoa();
		ParqueController pc = new ParqueController(); 
		
		for (int i = 0; i < 30; i++) {
			p.nome = "pessoa" + (i + 1);
			fila.insert(p.nome);
			p.idade = (int) ((Math.random() * 31) + 10);
			fila.insert(p.idade);
			p.altura = (float) ((Math.random() * 0.66) + 1.35);
			fila.insert(p.altura);
		}
		pc.
	}
}
