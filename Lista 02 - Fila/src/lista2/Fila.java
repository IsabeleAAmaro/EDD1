package lista2;

import java.util.Arrays;

public class Fila {
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;    /* Tamanho do vetor */
	protected int[] vetor;    /* Vetor de elementos */
	protected int ini;    /* Posicao do proximo elemento a ser retirado */
	protected int n;    /* Numero de elementos na fila */
	protected int[] aux;
	public int getN() {
		return n;
	}

	public Fila(int tam) {
		tamanho = tam;
		vetor = new int[tamanho];
		ini = 0;
		n = 0;
	}

	public boolean vazia() {
		return (n == 0);
	}

	public boolean cheia() {
		return (n == tamanho);
	}

	//Retiramos o elemento do in�cio da fila
	public int remove() {
		int elemento = Integer.MIN_VALUE;

		if (!this.vazia()) {
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		}

		return elemento;
	}

	//Inserimos o elemento no final da fila
	public boolean insere(int elemento) {
		int fim;

		if ( !cheia() ) {
			fim = (ini + n) % tamanho;
			vetor[fim] = elemento;
			n++;
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Fila{" +
				"vetor=" + Arrays.toString(vetor) +
				'}';
	}

	public void combinaFilas(Fila f1, Fila f2) {
		tamanho = f1.tamanho + f2.tamanho;
		Fila filaMista =  new Fila(tamanho);

		for(int i = 0; i < filaMista.tamanho; i++) {
			int varAux = f1.remove();
			filaMista.insere(varAux);
			varAux = f2.remove();
			filaMista.insere(varAux);
		}

		System.out.println(filaMista);
	}

	//EX 04

	public static FilaDupla implementaCircularDupla(Fila f) {
		FilaDupla FD = new FilaDupla(f.tamanho);

		while (!f.vazia()) {
			FD.insere(f.remove());
		}
		return FD;
	}

	//EX 05
	public void ordena(int[] aux) {
		for (int i = 0; i < aux.length - 1; i++) {
			//boolean ordenado = true;
			for (int j = 0; j < aux.length - i - 1; j++) {
				if (aux[j] > aux[(j + 1) % tamanho]) {
					int temp = aux[j];
					aux[j] = aux[(j + 1) % tamanho];
					aux[(j + 1) % tamanho] = temp;
				}
			}
		}
	}

	public void prioridade(Fila fila) {
		aux = new int[tamanho];
		for (int i = 0; i < fila.tamanho; i++) {
			aux[i] = fila.remove();
		}
		ordena(aux);

		for (int i = 0; i < fila.tamanho; i++) {
			fila.insere(aux[i]);
		}

		System.out.println("Fila de clientes ordenada por prioridade: "+fila);
	}
}