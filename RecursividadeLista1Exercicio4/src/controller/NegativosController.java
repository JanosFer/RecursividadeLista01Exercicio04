package controller;

public class NegativosController {
	
	public NegativosController() {
		super();
	}
	
	public int contar(int[] vet, int tamanho) {
		//Condição de Parada: Se não há mais elementos a serem somados, a recursiva é encerrada.
		if(tamanho == 0) {
			return 0;
		}else {
			
			//Chamada dos Passos: Se o valor da posição atual do vetor for negativa, soma se 1 com a função recursiva, caso contrário não há soma, diminui-se o tamanho do vetor em 1.
			
			int n;
			if(vet[tamanho-1] < 0) {
				n = 1;
			}else {
				n = 0;
			}
			
			return n + contar(vet, tamanho-1);
		}
	}
}
