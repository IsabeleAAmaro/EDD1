public class ListaOrdenada extends Lista {
    public void insere(int novo) {
        Elo p, q;
        Elo ant = null;

        q = new Elo(novo);

        for (p = prim; ((p != null) && (p.dado < novo)); p = p.prox) {
            ant = p;
        }

        if (ant == null) {
            prim = q;
        } else {
            ant.prox = q;
        }

        q.prox = p;
    }

    /* Remove da lista o primeiro elemento com valor igual a “elem". Ret. true se removeu. */
    public boolean remove(int elem) {
        Elo p;
        Elo ant = null; /* referência para anterior */

        for(p = prim; ((p != null) && (p.dado < elem)); p = p.prox)
            ant = p;

        /* Se p é null ou p.dado != elem, então não encontrou elemento. */
        if ((p == null) || (p.dado != elem))
            return false;

        if (p == prim)
            prim = prim.prox; /* Remove elemento do início. */
        else
            ant.prox = p.prox;  /* Remove elemento do meio. */

        /* Remove a última referência para o elo a ser removido. Dessa forma,
         * o Garbage Collector irá liberar essa memória. */
        p = null;

        return true;
    }
    public Elo intercalaOrdenada(Elo prim1, Elo prim2) {
        Elo elo_aux = new Elo(0);
        Elo tail = elo_aux;

        while (true) {
            if (prim1 == null) {
                tail.prox = prim2;
                break;
            }else {
                if (prim2 == null) {
                    tail.prox = prim1;
                    break;
                }
            }

            if (prim1.dado <= prim2.dado) {
                tail.prox = prim1;
                prim1 = prim1.prox;
            } else {
                tail.prox = prim2;
                prim2 = prim2.prox;
            }

            tail = tail.prox;
        }
        return elo_aux.prox;
    }
}
