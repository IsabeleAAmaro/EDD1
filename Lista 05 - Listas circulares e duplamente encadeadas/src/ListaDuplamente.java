public class ListaDuplamente
{
	/* Refer�ncia para primeiro elemento */
	protected Elo prim;
	
	protected class Elo
	{
		protected int dado;
		protected Elo ant;
		protected Elo prox;
		
		public Elo()
		{
			ant = null;
			prox = null;
		}
		
		public Elo(int elem)
		{
			dado = elem;
			ant = null;
			prox = null;
		}
		
		public Elo(int elem, Elo antElem, Elo proxElem)
		{
			dado = elem;
			ant = antElem;
			prox = proxElem;
		}
	}
	
	public ListaDuplamente()
	{
		prim = null;
	}
	
	/* Testa se a lista est� vazia. */
	public boolean vazia()
	{
		return prim == null;
	}
	
	/* Insere elemento no in�cio da lista. */
	public void insere(int novo) {
		Elo p;
		
		p = new Elo(novo);
		
		p.prox = prim;
		
		p.ant = null;
		
		if (prim != null)
			prim.ant = p;
		
		prim = p;
	}
	
	/* M�todo auxiliar para busca. */
	private Elo busca(int elem)
	{
		Elo p = null;
		
		for( p = prim; ((p != null) && (p.dado != elem)); p = p.prox);

		return p;      
	}
	
	/* Remove da lista o primeiro elemento com valor igual a "elem". Retorna true se removeu. */
	public boolean remove(int elem)
	{
		Elo p = null;
		p = busca(elem);

		if (p == null) return false;

		/* Retira primeiro elemento */
		if (p == prim) 
			prim = prim.prox;
		else 
			/* Retira elemento do meio */
			p.ant.prox = p.prox;

		/* Testa se � ultimo elemento */  
		if (p.prox != null)
			p.prox.ant = p.ant;

		p = null;

		return true;
	}
	
	/* Imprime todos os elementos da lista. */
	public void imprime()
	{
		Elo p;
		
		//System.out.println("Elementos da lista:");
		
		for(p = prim; p != null; p = p.prox)
		{
			System.out.print(p.dado + " ");
		}
		
		System.out.println();
	}
	
	/* Imprime todos os elementos da lista em ordem reversa. */
	public void imprimeReversa() {
		Elo p;
		Elo ult = null;
		
		System.out.println("Elementos da lista em ordem reversa:");
		
		p = prim;
		
		while(p != null)
		{
			ult = p;
			p = p.prox;
		}
		
		for(p = ult; p != null; p = p.ant)
		{
			System.out.print(p.dado + " ");
		}
		
		System.out.println();
	}

	public void intersecao(Elo prim1, Elo prim2) {
		Elo p, q;

		for(p = prim1; (p != null); p = p.prox) {
			for(q = prim2; (q != null); q = q.prox) {
				if(p.dado == q.dado) {
					insere(p.dado);
				}
			}
		}
	}

	public void trocarElos(int indiceElo1, int indiceElo2) {
		Elo A = prim;
		Elo B = prim;

		Elo trocar1 = null;
		Elo trocar2 = null;

		for (int i = 0; i <= indiceElo2; i++) {
			if (i == indiceElo1) {
				trocar1 = A;
			}

			if (i == indiceElo2) {
				trocar2 = B;
				break;
			}

			A = A.prox;
			B = B.prox;
		}

		Elo p, q;

		if (trocar1 != null && trocar2 != null) {
			int temp = trocar1.dado;
			trocar1.dado = trocar2.dado;
			trocar2.dado = temp;

			if(trocar1.prox == null) {
				//troca 1 é o último
				trocar2.prox = null;
				trocar2.ant = trocar1.ant;
			}else if(trocar1.ant == null) {
				//se ele for o primeiro
				trocar2.ant = null;
				trocar2.prox = trocar1.prox;
			} else {
				p = trocar1.prox;
				trocar1.prox = trocar2.prox;
				trocar2.prox = p;

				q = trocar1.ant;
				trocar1.ant = trocar2.ant;
				trocar2.ant = q;
			}

			if(trocar2.prox == null) {
				//se for o ultimo?
				trocar1.prox = null;
				trocar1.ant = trocar2.ant;
				}else if(trocar2.ant == null) {
					trocar1.ant = null;
					trocar1.prox = trocar2.prox;
				} else {
					p = trocar2.prox;
					trocar2.prox = trocar1.prox;
					trocar1.prox = p;

					q = trocar2.ant;
					trocar2.ant = trocar1.ant;
					trocar1.ant = q;
				}
			}
			}

	public boolean verificaElos (Elo p, Elo q) {
		if (p == null && q == null) {
			return true;
		}

		if (p == null || q == null) {
			return false;
		}

		if (p.dado == q.dado) {
			return verificaElos(p.prox, q.prox);
		}
		return false;
    }

	public boolean verificaIgualdade (ListaDuplamente Lista2) {
		if (verificaElos(this.prim, Lista2.prim)){
			System.out.println("Listas Iguais");
			return true;
		}
		System.out.println("Listas Diferentes");
		return false;
	}

	// ---------------------------------------------------------------------------------------------------
	
	/* Resolu��o da quest�o 4 da lista auxiliar de Lista Encadeada. */
	public static ListaDuplamente concatena(ListaDuplamente l1, ListaDuplamente l2)
	{
		Elo p;
		
		/* Verifica se a lista l1 � vazia. */
		if(l1.prim == null)
		{
			l1.prim = l2.prim;
		}
		else
		{
			/* Primeiramente, precisamos obter o �ltimo elo da lista l1. */
			for(p = l1.prim; p.prox != null; p = p.prox);

			/* Faz o "prox" do �ltimo elemento da lista l1, apontado por "p",
			 * apontar para o "prim" da lista l2. */
			p.prox = l2.prim;
			
			/* Faz o "ant" do "prim" da lista l2 apontar para o �ltimo elemento da
			 * lista l1, apontado por "p". */
			l2.prim.ant = p;
		}
		
		/* Nesse ponto, os elementos de l2 j� est�o encadeados ao final de l1,
		 * como desejado. Assim, vamos deixar a lista l2 vazia. */
		l2.prim = null;
		
		return l1;
	}
}