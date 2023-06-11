public class ConjGenerico<T extends Comparable<T>>
{
	private Elo prim;  /* Refer?ncia para primeiro elemento. */
	private T maior;

	/* Classe auxiliar para guardar cada elemento do conjunto. */
	private class Elo
	{
		T dado;
		Elo prox;

		public Elo()
		{
			prox = null;
		}

		public Elo(T elem)
		{
			dado = elem;
			prox = null;
		}

		public Elo(T elem, Elo proxElem)
		{
			dado = elem;
			prox = proxElem;
		}
	}

	/* Construtor que cria um conjunto vazio. */
	public ConjGenerico()
	{
		prim = null;
	}

	/* M?todo privado para realizar uma c?pia de um outro conjunto. */
	private void copia(ConjGenerico<T> conj2)
	{
		Elo ult = null, q;

		prim = null;

		for (Elo p = conj2.prim; p != null; p = p.prox)
		{
			q = new Elo(p.dado);

			if (ult == null)
				prim = q;
			else
				ult.prox = q;

			ult = q;
		}
	}

	/* M?todo privado para realizar uma c?pia de um outro conjunto. */
	public void apaga()
	{
		for (Elo p = prim; p != null; p = prim)
		{
			prim = prim.prox;
			p.prox = null;
		}
	}

	/* Simula uma sobrecarga do operador de atribui??o. */
	public ConjGenerico<T> atribui(ConjGenerico<T> conj2){
		if (this != conj2)
		{
			apaga();
			copia(conj2);
		}

		return this;
	}

	/* Testa se o conjunto est? vazio. */
	public boolean vazio()
	{
		return prim == null;
	}

	/* Teste de pertin?ncia. Usa fato de estar ordenado. */
	public boolean pertence(T valor)
	{
		Elo p;

		for (p = prim; ((p != null) && (p.dado.compareTo(valor) < 0)); p = p.prox);

		if ((p == null) || (p.dado.compareTo(valor) > 0)) return false;

		return true;
	}

	/* Inser??o de elemento no conjunto. Usa fato de estar ordenado.
	   Retorna false se elemento j? estava l?. */
	public boolean insere(T valor)
	{
		Elo p = prim, ant = null;

		for (p = prim; (p != null); p = p.prox)
		{
			if (p.dado.compareTo(valor) == 0) return false;
			if (p.dado.compareTo(valor) > 0) break;

			ant = p;
		}

		Elo q = new Elo(valor);

		if (p == prim)
			prim = q;
		else
			ant.prox = q;

		q.prox = p;

		//Método adicionado depois da questão 1
		if (maior == null || valor.compareTo(maior) > 0) {
			maior = valor;
		}

		return true;
	}

	/* Remo??o de elemento do conjunto. Usa fato de estar ordenado.
	   Retorna false se elemento n?o estava l?. */
	public boolean remove(T valor)
	{
		Elo p = prim, ant = null;

		for (p = prim; (p != null); p = p.prox)
		{
			if (p.dado.compareTo(valor) > 0) return false;
			if (p.dado.compareTo(valor) == 0) break;

			ant = p;
		}

		if (p == null)
			return false;

		if (p == prim)
			prim = prim.prox;
		else
			ant.prox = p.prox;

		p = null;

		return true;
	}

	/* M?todo para uni?o de conjuntos. Une conjunto com cj2 e retorna novo conjunto com a uni?o.
	 * Usa fato de conjuntos estarem ordenados e percorre as listas em paralelo. */
	public ConjGenerico<T> uniao(ConjGenerico<T> conj2)
	{
		Elo q, p1 = prim, p2 = conj2.prim, ult = null;
		ConjGenerico<T> uniao = new ConjGenerico<T>();

		while ( (p1 != null) || (p2 != null) )
		{
			if ( (p1 != null) && ( (p2 == null) || (p1.dado.compareTo(p2.dado) < 0)))
			{
				q = new Elo(p1.dado);
				p1 = p1.prox;
			}
			else
			{
				q = new Elo(p2.dado);
				if ((p1 != null) && (p1.dado.compareTo(p2.dado) == 0))
					p1 = p1.prox;
				p2 = p2.prox;
			}

			if (ult == null)
				uniao.prim = q;
			else
				ult.prox = q;

			ult = q;
		}

		return uniao;
	}

	/* M?todo para intersecao de conjuntos. Calcula intersecao do conjunto com cj2 e retorna novo conjunto com a intersecao.
	 * Usa fato de conjuntos estarem ordenados e percorre as listas em paralelo. */
	public ConjGenerico<T> intersecao(ConjGenerico<T> conj2)
	{
		Elo q, p1 = prim, p2 = conj2.prim, ult = null;
		ConjGenerico<T> inter = new ConjGenerico<T>();

		while ( (p1 != null) && (p2 != null) )
		{
			if (p1.dado.compareTo(p2.dado) < 0)
			{
				p1 = p1.prox;
			}
			else if(p2.dado.compareTo(p1.dado) < 0)
			{
				p2 = p2.prox;
			}
			else
			{
				q = new Elo(p1.dado);

				p1 = p1.prox;
				p2 = p2.prox;

				if (ult == null)
					inter.prim = q;
				else
					ult.prox = q;

				ult = q;
			}
		}

		return inter;
	}

	/* Retorna cardinalidade do conjunto */
	public int tamanho()
	{
		int tam = 0;
		Elo p;

		for(p = prim; p != null; p = p.prox)
			tam++;

		return tam;
	}

	/* Imprime todos os elementos do conjunto */
	public void imprime()
	{
		Elo p;

		for(p = prim; p != null; p = p.prox)
			System.out.print(p.dado + " ");

		System.out.println();
	}

	//Ex 02

	//Ex 03
	ConjGenerico<T> complementar(ConjGenerico<T> universo) {

		Elo prim1 = this.prim;
		Elo prim2 = universo.prim;

		ConjGenerico<T> comp = new ConjGenerico<>(); // para guardar o conjunto complementar

		// loop que itera at? o final do conjunto universo
		while (prim2 != null) {
			// se o elemento do conjunto universo for igual ao do conjunto 1...
			if (prim2.dado.compareTo(prim1.dado) == 0) {
				//...as heads de cada conjunto recebem o proximo elemento, caso o proximo elemento do conjunto 1 n?o seja nulo
				if (prim1.prox != null) {
					prim2 = prim2.prox;
					prim1 = prim1.prox;

				} else { // ...a head do conjunto universo recebe o proximo elemento
					prim2 = prim2.prox;
				}
			} else if (prim2.dado.compareTo(prim1.dado) != 0) { // especificar isso aqui ? redundante
				// se o elemento do conjunto universo for diferente do elemento do conjunto 1, ele ? inserido
				// no conjunto complementar.
				// a head do conjunto universo recebe o proximo elemento desse mesmo conjunto
				comp.insere(prim2.dado);
				prim2 = prim2.prox;
			}
		}
		return comp;
	}

	//Ex 04
	public boolean eSubconjunto(ConjGenerico<T> conj2) {
		Elo p = this.prim;
		Elo q = conj2.prim;

		while (q != null) {
			if (p.dado.compareTo(q.dado) == 0) {
				if (p.prox != null) {
					q = q.prox;
					p = p.prox;
				} else {
					return true;
				}
			} else if (q.dado.compareTo(p.dado) != 0) {
				q = q.prox;
			}
		}
		return false;
	}

	//Ex 01
	public T getMenor() {
		if(prim == null) {
			System.out.println("Conjunto vazio!");
		}

		return prim.dado;
	}

	public T getMaior() {
		return maior;
	}

	//Ex 05
	public ConjGenerico<T> diferenca(ConjGenerico<T> conj2) {
		ConjGenerico<T> diferenca = new ConjGenerico<>();
			Elo p = this.prim;
			Elo q = conj2.prim;
			Elo ult = null;
			Elo e1;

			while (p != null && q != null) {
				if (p.dado.compareTo(q.dado) == 0) {
					//s?o iguais
					p = p.prox;
					q = q.prox;
				} else if (p.dado.compareTo(q.dado) < 0) {
					//ser? incluso na diferen?a
					e1 = new Elo(p.dado);
					p = p.prox;

					if (ult == null) {
						diferenca.prim = e1;
					} else {
						//o prim j? est? ocupado
						ult.prox = e1;
					}
					ult = e1;
				} else {
					q = q.prox;
				}
			}
			return diferenca;
	}

	public boolean eIgualRecursiva(ConjGenerico<T> conj2) {
		return eIgualRecursiva(this.prim, conj2.prim);

	}

	private boolean eIgualRecursiva(Elo p1, Elo p2) {
		if(p1 == null && p2 == null) {
			return true;
		}

		if(p1 != null && p2 != null) {
			return (p1.dado == p2.dado) && eIgualRecursiva(p1.prox, p2.prox);
		}

		return false;
	}

	public static ConjGenerico<Integer> calculaDeMorgan(ConjGenerico<Integer> A, ConjGenerico<Integer> B, ConjGenerico<Integer> universo) {
		ConjGenerico<Integer> compA = new ConjGenerico<>();
		ConjGenerico<Integer> compB = new ConjGenerico<>();
		ConjGenerico<Integer> intersec = new ConjGenerico<>();

		//Elo prim1 = A.prim;
		//Elo prim2 = universo.prim;

		// complemento de A
		compA = A.complementar(universo);

		System.out.println("Complementar de A:");
		compA.imprime();

		// complemento de B
		compB = B.complementar(universo);

		System.out.println("Complementar de B:");
		compB.imprime();

		// interse??o dos complementos de A e B
		intersec = compA.intersecao(compB);

		return intersec;
	}
}