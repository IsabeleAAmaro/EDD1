public class ListaCircular extends Lista {
    /* Imprime todos os elementos da lista */
    public void imprime() {
        Elo p;

        p = prim;

        System.out.println("Elementos da lista:");

        if (p != null) {
            do {
                System.out.print(p.dado + " ");
                p = p.prox;

            } while (p != prim);
        }

        System.out.println();
    }

    public void imprimeRecursivo() {
        if (this.vazia())
            return;

        imprimeRecursivo(prim);

        System.out.println();
    }

    private void imprimeRecursivo(Elo p) {
        System.out.print(p.dado + " ");

        if (p.prox == prim)
            return;

        imprimeRecursivo(p.prox);
    }

    public int tamanho() {
        int tamanho = 0;
        Elo p;
        p = prim;

        if (p != null) {
            do {
                p = p.prox;
                tamanho++;
            } while (p != prim);
        }
        return tamanho;
    }

    /* Insere elemento no fim da lista. */
    public void insere(int novo) {
        Elo p, q;
        q = new Elo(novo);
        p = prim;

        if (p != null) {
            /* Percorre até alcancar o início. */
            while (p.prox != prim) {
                p = p.prox;
            }

            p.prox = q;
            q.prox = prim;
        } else {
            prim = q;
            prim.prox = q;
        }
    }

    public boolean remove(int elem) {
        Elo p = null;
        Elo ant = null;

        if (prim == null) return false;

        for (p = prim; ((p.prox != prim) && (p.dado != elem)); p = p.prox)
            ant = p;

        /* Achou */
        if (p.dado == elem) {
            /* É o primeiro */
            if (p == prim) {
                /* É o único */
                if (prim == prim.prox) {
                    prim = null;
                } else {
                    /* Guarda o anterior ao primeiro */
                    for (ant = prim; (ant.prox != prim); ant = ant.prox) ;

                    ant.prox = prim.prox;
                    prim = prim.prox;
                }
            } else {
                /* No meio */
                ant.prox = p.prox;
            }

            /* Remove a última referência para o elo a ser removido. Dessa forma,
             * o Garbage Collector irá liberar essa memória. */
            p = null;

            return true;
        } else
            return false;
    }

    // Questão 2 da lista 5
    public ListaCircular merge(ListaCircular lista2) {
        ListaCircular l3 = new ListaCircular();
        int i = 0, j = 0;
        Elo p = prim;
        Elo q = lista2.prim;
        int tam = this.tamanho() + lista2.tamanho();

        do {
            if (p != null && i < tamanho()) {
                l3.insere(p.dado);
                p = p.prox;
                i++;
            }
            if (q != null && j < lista2.tamanho()) {
                l3.insere(q.dado);
                q = q.prox;
                j++;
            }
        } while ((i + j) < tam);
        return l3;
    }

    public ListaCircular inverteLista() {
        if (prim == null) {
            return null;
        }

        Elo anterior = null;
        Elo atual = prim;
        Elo proximo;

        do {
            proximo = atual.prox;
            atual.prox = anterior;
            anterior = atual;
            atual = proximo;
        } while (atual != prim);

        prim.prox = anterior;
        prim = anterior;

        return this;
    }


}

