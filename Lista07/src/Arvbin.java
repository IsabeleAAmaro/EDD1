import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Arvbin<T extends Comparable<T>> {
	private T val;   /* Valor armazenado na raiz. */

	/* Refer�ncias para sub�rvores. */
	private Arvbin<T> esq, dir;

	/* Construtor de �rvore sem sub-�vores (dir = esq = null). � fornecido apenas o valor da raiz. */
	public Arvbin(T valor)
	{
		val = valor;
		esq = null;
		dir = null;
	}

	/* Construtor de �rvore com sub-�vores. S�o fornecidos
	o valor da raiz e as sub�rvores, que devem ter sido 
	constru�das previamente.*/
	public Arvbin(T valor, Arvbin<T> arvEsq, Arvbin<T> arvDir)
	{
		val = valor;
		esq = arvEsq;
		dir = arvDir;
	}

	/* Retorna o valor armazenado na raiz. */
	public T retornaVal()
	{
		return val;
	}

	/* Retorna a sub�rvore esquerda 
	   (ou null se n�o houver). */
	public Arvbin<T> retornaEsq()
	{
		return esq;
	}

	/* Retorna a sub�rvore direita 
    (ou null se n�o houver). */
	public Arvbin<T> retornaDir()
	{
		return dir;
	}

	/* Modifica o valor armazenado na raiz. */
	public void defineVal(T valor)
	{
		val = valor;
	}

	/* Redefine a sub�rvore esquerda, apagando a antiga se houver. */
	public void defineEsq(Arvbin<T> filho)
	{
		esq = filho;
	} 

	/* Redefine a sub�rvore direita, apagando a antiga se houver. */
	public void defineDir(Arvbin<T> filho)
	{
		dir = filho;
	}

	/* Imprime o conte�do da �rvore em pr�-ordem */
	public void mostra()
	{
		System.out.print("(" + val);
		if (esq != null)
			esq.mostra();
		if (dir != null)
			dir.mostra();
		System.out.print(")");
	}
	
	/* Verifica se um valor est� na �rvore. Se estiver, retorna um ponteiro para o
	   o n� que tem esse valor. Caso contr�rio, retorna null. */
	public Arvbin<T> busca(T valor)
	{
		Arvbin<T> ret;

		/* Se � igual ao valor armazenado, n�o precisa procurar mais. O n� � a raiz. */
		if (valor.compareTo(val) == 0)
		{
			return this;
		}

		/* Sen�o, come�a procurando na sub�rvore esquerda. */
		if (esq != null)
		{
			ret = esq.busca(valor);
			
			if (ret != null)
				return ret;
		}

		/* Se chega a esse ponto, estar� na �rvore se, e somente se, 
	     estiver na sub�rvore direita */
		if (dir != null) 
			return dir.busca(valor);
		
		return null;
	}
	
	/* Calcula e retorna o n�mero de n�s na �rvore. */
	public int contaNos()
	{
		if((esq == null) && (dir == null))
			return 1;
		
		int nosEsq = 0, nosDir = 0;
		
		if(esq != null)
			nosEsq = esq.contaNos();
		
		if(dir != null)
			nosDir = dir.contaNos();
		
		return 1 + nosEsq + nosDir;
	}
	
	/* Calcula e retorna a altura da �rvore. */
	public int calculaAltura()
	{
		if((esq == null) && (dir == null))
			return 0;
		
		int altEsq = 0, altDir = 0;
		
		if(esq != null)
			altEsq = esq.calculaAltura();
		
		if(dir != null)
			altDir = dir.calculaAltura();
		
		return 1 + Math.max(altEsq, altDir);
	}
	
	/* Calcula e retorna o maior valor contido na �rvore. */
	public T calculaMaximo()
	{
		if((esq == null) && (dir == null))
			return val;
		
		T maiorFilhos, maiorEsq, maiorDir; 
		
		if((esq != null) && (dir == null))
		{
			maiorFilhos = esq.calculaMaximo();
		}
		else if((esq == null) && (dir != null))
		{
			maiorFilhos = dir.calculaMaximo();
		}
		else
		{
			maiorEsq = esq.calculaMaximo();
			maiorDir = dir.calculaMaximo();
			
			if(maiorEsq.compareTo(maiorDir) > 0)
				maiorFilhos = maiorEsq;
			else
				maiorFilhos = maiorDir;
		}
		
		if(maiorFilhos.compareTo(val) > 0)
			return maiorFilhos;
		
		return val;
	}
	
	/* Calcula a soma dos valores dos n�s de uma �rvore de inteiros. */
	public static int calculaSoma(Arvbin<Integer> no)
	{
		if(no == null)
			return 0;

		int acumulado = 0;
						
		acumulado += calculaSoma(no.esq);
		
		acumulado += calculaSoma(no.dir);
		
		acumulado += no.val;
		
		return acumulado;
	}

	// -------------------------------------------------------------------------------

	//Questão 01:
	public void imprimePreOrdem() {
		System.out.print("(" + val); // Mostra o valor antes dos filhos
		if (esq != null) {
			esq.imprimePreOrdem();
		}
		if (dir != null) {
			dir.imprimePreOrdem();
		}
		System.out.print(")");

	}

	public void imprimePosOrdem() {
		System.out.print("(");
		if (esq != null) {
			esq.imprimePosOrdem();
		}
		if (dir != null) {
			dir.imprimePosOrdem();
		}
		System.out.print(val + ")"); // Mostra o valor depois dos filhos

	}

	public void imprimeEmOrdem() {
		System.out.print("(");
		if (esq != null)
			esq.imprimeEmOrdem();
		System.out.print(val); // Mostra o valor no meio dos filhos
		if (dir != null)
			dir.imprimeEmOrdem();
		System.out.print(")");

	}

	// Questão 02:
	public static Integer retornaSomaSubArvore(Arvbin<Integer> no) {

		Integer soma = 0; // soma durante a recursao
		soma += no.val;

		if (no.esq != null) {
			soma += retornaSomaSubArvore(no.esq); // Soma No da esquerda

		}
		if (no.dir != null) {
			soma += retornaSomaSubArvore(no.dir); // Soma No da Direita

		}
		return soma;
	}

	// Questão 03:
	public boolean eSimilar(Arvbin<T> arvore) {
		Boolean teste = true;

		if (!teste) {
			//System.out.println("Não é similar");  -> Mensagem fica repetindo
			return false;
		}

		if (arvore.dir == null && arvore.esq == null && this.dir == null && this.esq == null) {	// Se for similar - toda vazia
			//System.out.println("É similar");
			return true;
		}
		else if (arvore.dir != null && arvore.esq != null && this.dir != null && this.esq != null) {	// COndição: não são nulos
			teste = this.dir.eSimilar(arvore.dir);
			teste = this.esq.eSimilar(arvore.esq);
		}
		else {
			//System.out.println("Não é similar");	// Não é similar se chegar aqui!!
			return false;
		}

		// Imprime aviso
		if (teste){
			System.out.println("É similar");
		}
		else{
			System.out.println("Não é similar");
		}
		return teste;	// Se nada do loop entrar - trava

	}

	//Questão 4:
	public Arvbin<T> tornaRaiz(T valor) {
		Arvbin<T> no = busca(valor);
		Arvbin<T> aux = new Arvbin<T>(valor);
		Queue<Arvbin<T>> novaFila = new LinkedList<>();

		novaFila.add(this);
		aux.defineVal(this.retornaVal());
		this.defineVal(no.retornaVal());

		Arvbin<T> temp = null;

		while (!novaFila.isEmpty()) {
			temp = novaFila.peek(); // pego sem remover o valor
			novaFila.remove();

			if (temp.retornaEsq() == no) {
				temp.defineEsq(new Arvbin<T>(aux.retornaVal()));
			}
			if (temp.retornaDir() == no) {
				temp.defineDir(new Arvbin<T>(aux.retornaVal()));
			}

			if (temp.retornaEsq() != null) {
				novaFila.add(temp.retornaEsq());
			}

			if (temp.retornaDir() != null) {
				novaFila.add(temp.retornaDir());
			}
		}

		return this;
	}

	//Questão 5:
	public Arvbin<T> delete(T valor) {
		if (this.val == null)
			return this;

		if (this.esq == null && this.dir == null) { // Caso nao tenha filhos
			if (this.val.equals(valor)) {
				this.val = null;
			}
			return this;
		}

		Queue<Arvbin<T>> fila = new LinkedList<>();
		fila.add(this);
		Arvbin<T> temp = null, chave = null;

		while (!fila.isEmpty()) {
			temp = fila.peek();
			fila.remove();

			if (temp.val.equals(valor))
				chave = temp;

			if (temp.esq != null)
				fila.add(temp.esq);

			if (temp.dir != null)
				fila.add(temp.dir);
		}

		if (chave != null) {
			T x = temp.val;
			deletaAux(temp);
			chave.val = x;
		}

		return this;
	}

	//Questão 6: TESTAR MAIS
	public boolean eBalanceada() {
		return verificaBalanceamento(this) != -1;
	}

	private int verificaBalanceamento(Arvbin<T> no) {
		if (no == null) {
			return 0;
		}

		int alturaEsq = verificaBalanceamento(no.retornaEsq());
		if (alturaEsq == -1) {
			return -1;
		}

		int alturaDir = verificaBalanceamento(no.retornaDir());
		if (alturaDir == -1) {
			return -1;
		}

		int diferencaAltura = Math.abs(alturaEsq - alturaDir);
		if (diferencaAltura > 1) {
			return -1;
		}

		return Math.max(alturaEsq, alturaDir) + 1;
	}


	private void deletaAux(Arvbin<T> paraDeletar) {
		Queue<Arvbin<T>> novaFila = new LinkedList<>();
		novaFila.add(this);

		Arvbin<T> temp = null;

		while (!novaFila.isEmpty()) {
			temp = novaFila.peek();
			novaFila.remove();

			if (temp == paraDeletar) {
				temp = null;
				return;
			}

			if (temp.dir != null) {
				if (temp.dir == paraDeletar) {
					temp.dir = null;
					return;
				} else {
					novaFila.add(temp.dir);
				}
			}

			if (temp.esq != null) {
				if (temp.esq == paraDeletar) {
					temp.esq = null;
					return;
				} else {
					novaFila.add(temp.esq);
				}
			}
		}
	}

	/* Resolu��o da quest�o 1 dispon�vel no moodle. */
	public int contaNosIntervalo(T min, T max)
	{
		if((esq == null) && (dir == null))
		{
			if((val.compareTo(min)) >= 0 && (val.compareTo(max) <= 0))
				return 1;
			else
				return 0;
		}
		
		int nosEsq = 0, nosDir = 0, noCont = 0;
		
		if(esq != null)
			nosEsq = esq.contaNosIntervalo(min, max);
		
		if(dir != null)
			nosDir = dir.contaNosIntervalo(min, max);
		
		if((val.compareTo(min) >= 0) && (val.compareTo(max) <= 0))
			noCont = 1;
		
		return noCont + nosEsq + nosDir;
	}
	
	/* Resolu��o da quest�o 2 dispon�vel no moodle. */
	public static int verificaArvoreSoma(Arvbin<Integer> arvore)
	{
		/* Caso base: se � uma sub�rvore vazia, deve retornar 0. */
		if(arvore == null)
			return 0;
		
		/* Caso base: se � uma folha, retorna o valor contido no n�. */
		if((arvore.esq == null) && (arvore.dir == null))
			return arvore.val;
		
		/* Caso geral: deve chamar para a esquerda e para a direita, verificando
		 * a soma. */
		int somaEsquerda = 0, somaDireita = 0;
		
		if(arvore.esq != null)
			somaEsquerda = verificaArvoreSoma(arvore.esq);
		
		if(arvore.dir != null)
			somaDireita = verificaArvoreSoma(arvore.dir);
			
		/* Agora devemos verificar se o valor do n� corresponde � soma dos valores
		 * contidos nas sub�rvores esquerda e direita. */
		if((somaEsquerda != Integer.MIN_VALUE) && (somaDireita != Integer.MIN_VALUE)
				&& (arvore.val == somaEsquerda + somaDireita))
			return arvore.val + somaEsquerda + somaDireita;
		
		return Integer.MIN_VALUE;
	}
	
	/* Resolu��o da quest�o 3 dispon�vel no moodle. */
	public boolean eIgual(Arvbin<T> outra)
	{
		if(this.esq == null && this.dir == null)
		{
			if(outra.esq == null && outra.dir == null)
			{
				if(this.val.compareTo(outra.val) == 0)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		
		boolean esqIgual = true, dirIgual = true;
		
		if(this.esq != null)
		{
			if(outra.esq == null)
				return false;
			else
				esqIgual = this.esq.eIgual(outra.esq);
		}
		else
		{
			if(outra.esq != null)
				return false;
		}
		
		if(this.dir != null)
		{
			if(outra.dir == null)
				return false;
			else
				dirIgual = this.dir.eIgual(outra.dir);
		}
		else
		{
			if(outra.dir != null)
				return false;
		}
		
		if(this.val.compareTo(outra.val) == 0)
			return esqIgual && dirIgual;
		else
			return false;
	}
	
	/* Calcula e retorna o di�metro da �rvore, isto �, o n�mero
	 * de n�s contido no maior caminho de um n� para outro n� da
	 * �rvore. */
	public int calculaDiametro()
	{
		/* Caso base, quando � uma folha. */
		if((esq == null) && (dir == null))
		{
			return 1;
		}
		
		/* Calcula a altura das sub�rvores esquerda e direita do n�. */
		int alturaEsq = 0, alturaDir = 0;
		
		if(esq != null)
			alturaEsq = esq.calculaAltura();
		
		if(dir != null)
			alturaDir = dir.calculaAltura();
		
		int maxDistanciaNo = alturaEsq + alturaDir + 1;
		
		/* Nesse ponto, temos a maior dist�ncia entre dois n�s da �rvore
		 * que passa pelo n� corrente (this). Agora devemos calcular esse
		 * valor para as sub�rvores esquerda e direita, comparando depois. */		
		
		int maxDistanciaEsq = 0, maxDistanciaDir = 0;
		
		if(esq != null)
			maxDistanciaEsq = esq.calculaDiametro();
		
		if(dir != null)
			maxDistanciaDir = dir.calculaDiametro();
		
		int maxDistanciaFilhos = Math.max(maxDistanciaEsq,  maxDistanciaDir);
		
		if(maxDistanciaNo > maxDistanciaFilhos)
			return maxDistanciaNo;
		else
			return maxDistanciaFilhos;
	}
	
	/* M�todo que realiza a impress�o de todos os caminhos da raiz para uma folha. */
	public void imprimeTodosCaminhos(Deque<T> caminhos)
	{
		/* Adiciona o n� no caminho. */
		caminhos.addLast(val);

		/* Caso base: quando � uma folha. */
		if((esq == null) && (dir == null))
		{
			/* Chegou-se ao fim do caminho, portanto deve-se imprimi-lo. */
			imprimeCaminho(caminhos);
		}

		/* Caso geral: deve-se fazer a recurs�o para os n�s esquerdo (se houver) e 
		 * para o direito (se houver). */
		
		if(esq != null)
			esq.imprimeTodosCaminhos(caminhos);

		if(dir != null)
			dir.imprimeTodosCaminhos(caminhos);
		
		/* Remove o n� corrente do caminho ap�s as chamadas recursivas para os
		 * n�s esquerdo e direito. */ 
		caminhos.removeLast();
	}

	/* M�todo privado auxiliar que imprime os n�s contidos na estrutura caminhos. */
	private void imprimeCaminho(Deque<T> caminhos)
	{
		Iterator<T> iterator = caminhos.iterator();

		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " -> ");
		}

		System.out.println();
	}
}