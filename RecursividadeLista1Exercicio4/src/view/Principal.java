package view;

import controller.NegativosController;

public class Principal {
	
	public static void main(String[] args) {
		NegativosController nc = new NegativosController();
		
		int[] vet = {4, -5, 9, -2, 8, -4, -77};
		int tamanho = 7;
		
		System.out.println(nc.contar(vet, tamanho));
	}
}