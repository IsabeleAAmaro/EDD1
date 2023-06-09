public class ListaGenerica<T> {

    protected Elo prim;
    protected Elo tail;
    private int tam;

    protected class Elo {
        protected T dado;
        protected Elo prox;

        public Elo() {
            prox = null;
        }

        public Elo(T elem) {
            dado = elem;
            prox = null;
        }

        public Elo(T elem, Elo proxElem) {
            dado = elem;
            prox = proxElem;
        }
    }

    public ListaGenerica() {
        prim = null;
        this.tam = 0;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    /* Testa se a lista está vazia. */
    public boolean vazia() {
        return prim == null;
    }

    /* Insere elemento no início da lista. */
    public void insere(T novo) {
        Elo p = new Elo(novo);
        p.prox = prim;
        prim = p;
        setTam(tam + 1);
    }

    /* Verifica se um determinado elemento está na lista. */
    public boolean busca(T elem) {
        Elo p;

        for (p = prim; p != null; p = p.prox) {
            if (p.dado == elem)
                return true;
        }

        return false;
    }

    /* Implementação recursiva do método de busca. */
    public boolean buscaRecursiva(T elem) {
        if (this.vazia())
            return false;

        return buscaRecursiva(elem, prim);
    }

    private boolean buscaRecursiva(T elem, Elo p) {
        if (p == null)
            return false;

        if (p.dado == elem)
            return true;

        return buscaRecursiva(elem, p.prox);
    }

    /* Remove da lista o primeiro elemento com valor igual a “elem". Ret. true se removeu. */
    public boolean remove(T elem) {
        Elo p;
        Elo ant = null; /* Referência para anterior. */

        for (p = prim; ((p != null) && (p.dado != elem)); p = p.prox)
            ant = p;

        /* Se p é null, então não encontrou elemento. */
        if (p == null)
            return false;

        if (p == prim)
            prim = prim.prox; /* Remove elemento do início. */
        else
            ant.prox = p.prox;  /* Remove elemento do meio. */

        /* Remove a última referência para o elo a ser removido. Dessa forma,
         * o Garbage Collector irá liberar essa memória. */
        p = null;
        setTam(tam - 1);
        return true;
    }

    /* Imprime todos os elementos da lista. */
    public void imprime() {
        Elo p;

        for (p = prim; p != null; p = p.prox) {
            System.out.print(p.dado + " ");
        }

        System.out.println();
    }

    /* Implementação recursiva da função de impressão. */
    public void imprimeRecursivo() {
        System.out.println("Elementos da lista:");

        if (this.vazia())
            return;

        imprimeRecursivo(prim);

        System.out.println();
    }

    private void imprimeRecursivo(Elo p) {
        if (p == null)
            return;

        System.out.print(p.dado + " ");

        imprimeRecursivo(p.prox);
    }

    public int tamanho() {
        return tam;
    }

    public int tamanhoRecursivo() {
        if(this.vazia())
            return 0;
        return tamanhoRecursivo(prim);
    }

    private int tamanhoRecursivo(Elo p) {
        if(p == null)
            return 0;
        return 1 + tamanhoRecursivo(p.prox);
    }

    // Questão 4
    public String retornaFrase() {
        Elo p = prim;
        StringBuilder sb = new StringBuilder();

        while (p != null) {
            sb.insert(0, p.dado);
            p = p.prox;
        }
        return sb.toString();
    }

    //Questão 5
    public String invertePalavra(String palavra) {
        String s = "";
        for (int i = 0; i < palavra.length(); i++) {
            s = palavra.charAt(i) + s;
        }
        return s;
    }

    public void inverteLetras() {
        Elo inv = prim;

        while (inv != null) {
            String dadoString = inv.dado.toString(); // Converte inv.dado para String
            String invertedDado = invertePalavra(dadoString);
            inv.dado = (T) invertedDado; // Converte a String de volta para o tipo genérico
            inv = inv.prox;
        }
    }
}
