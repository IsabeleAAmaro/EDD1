package lista2;

public class FilaDupla extends Fila {
	public FilaDupla(int tam) {
		super(tam);
	}

	public boolean insereInicio(int elemento) {
		int prec;

		if (!cheia()) {
			/* Insere na posi��o precedente ao in�cio */
			prec = (ini - 1 + tamanho) % tamanho;
			vetor[prec] = elemento;
			ini = prec; /* Atualiza �ndice para in�cio */
			n++;
			return true;
		} else {
			System.out.println("Fila cheia, não foi possivel adicionar");
			return false;
		}
	}

	public int removeFim() {
		int elemento = Integer.MIN_VALUE;
		int ult;

		if (!this.vazia()) {
			/* Retira o �ltimo elemento */
			ult = (ini + n - 1) % tamanho;
			elemento = vetor[ult];
			n--;
		}

		return elemento;
	}

	public void imprime() {
		int i, j;

		if(vazia()) {
			System.out.println("Fila está vazia");
		}else{
			for (i = ini, j = 1; j <= n; j = j + 1, i = (i + 1) % tamanho)
				System.out.println(vetor[i]);
		}

	}
}
