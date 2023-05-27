package lista2;

public class Pilha {
	private int n;
	private int[] vetor;
	private int topo;
	
	public Pilha() {
		n = 10;
		vetor = new int[n];
		topo = -1;
	}
	
	public Pilha(int tamanho) {
		n = tamanho;
		vetor = new int[tamanho];
		topo = -1;
	}
	
	public boolean vazia() {
		return topo == -1;
	}
	
	public boolean cheia() {
		return topo == n - 1;
	}
	
	public int pop()
	{
		int c = 0;
		
		if (!this.vazia()) {
			c = vetor[topo];
			
			//Decrementando o topo, o elemento � "removido"
			topo--;
		} else {
			//Impress�o para fins did�ticos
			System.out.println("Pilha vazia: pop n�o funcionou.");
		}
		return c;
	}
	
	public boolean push(int n)
	{
		if (!this.cheia()) {
			vetor[++topo] = n;
			return true;
		} else {
			//Impress�o para fins did�ticos
			System.out.println("Pilha cheia: push n�o funcionou.\n");
			return false;
		}
	}
	
	public int retornaTopo()
	{
		int i = 0;

		if(!this.vazia()) {
			i = vetor[topo];
		} else {
			System.out.println("Pilha vazia.");
		}

		return i;
	}
}