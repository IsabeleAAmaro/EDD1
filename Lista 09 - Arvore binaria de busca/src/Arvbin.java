public class Arvbin<T extends Comparable<T>> {
    private T val; /* Valor armazenado na raiz. */

    /* Referencias para sub-arvores. */
    private Arvbin<T> esq, dir;

    /* Construtor de arvore sem sub-avores (dir = esq = null). e fornecido apenas o valor da raiz. */
    public Arvbin(T valor) {
        val = valor;
        esq = null;
        dir = null;
    }

    /* Construtor de arvore com sub-avores. Sao fornecidos
    o valor da raiz e as sub-arvores, que devem ter sido
    construidas previamente.*/
    public Arvbin(T valor, Arvbin<T> arvEsq, Arvbin<T> arvDir) {
        val = valor;
        esq = arvEsq;
        dir = arvDir;
    }

    /* Retorna o valor armazenado na raiz. */
    public T retornaVal() {
        return val;
    }

    /* Retorna a sub-arvore esquerda (ou null se nao houver). */
    public Arvbin<T> retornaEsq() {
        return esq;
    }

    /* Retorna a sub-arvore direita (ou null se nao houver). */
    public Arvbin<T> retornaDir() {
        return dir;
    }

    /* Modifica o valor armazenado na raiz. */
    public void defineVal(T valor) {
        val = valor;
    }

    /* Redefine a sub-arvore esquerda, apagando a antiga se houver. */
    public void defineEsq(Arvbin<T> filho) {
        esq = filho;
    }

    /* Redefine a sub-arvore direita, apagando a antiga se houver. */
    public void defineDir(Arvbin<T> filho) {
        dir = filho;
    }

    /* Imprime o conteudo da arvore em pre-ordem */
    public void mostra() {
        System.out.print("(" + val);
        if (esq != null)
            esq.mostra();
        if (dir != null)
            dir.mostra();
        System.out.print(")");
    }

    /* Calcula e retorna o numero de nos na arvore. */
    public int contaNos() {
        if((esq == null) && (dir == null))
            return 1;

        int nosEsq = 0, nosDir = 0;

        if(esq != null)
            nosEsq = esq.contaNos();

        if(dir != null)
            nosDir = dir.contaNos();

        return 1 + nosEsq + nosDir;
    }

    /* Calcula e retorna a altura da arvore. */
    public int calculaAltura() {
        if((esq == null) && (dir == null))
            return 0;

        int altEsq = 0, altDir = 0;

        if(esq != null)
            altEsq = esq.calculaAltura();

        if(dir != null)
            altDir = dir.calculaAltura();

        return 1 + Math.max(altEsq, altDir);
    }

    /* Calcula e retorna o maior valor contido na arvore. */
    public T calculaMaximo() {
        if((esq == null) && (dir == null))
            return val;

        T maiorFilhos, maiorEsq, maiorDir;

        if((esq != null) && (dir == null)) {
            maiorFilhos = esq.calculaMaximo();
        }
        else if((esq == null) && (dir != null)) {
            maiorFilhos = dir.calculaMaximo();
        }
        else {
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

    /* Calcula a soma dos valores dos nos de uma arvore de inteiros. */
    public static int calculaSoma(Arvbin<Integer> no) {
        if(no == null)
            return 0;

        int acumulado = 0;

        acumulado += calculaSoma(no.esq);

        acumulado += calculaSoma(no.dir);

        acumulado += no.val;

        return acumulado;
    }





    /* Resolucao da questao 1 disponivel no moodle. */
    public int contaNosIntervalo(T min, T max) {
        if((esq == null) && (dir == null)) {
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

    /* Resolucao da questao 2 disponivel no moodle. */
    public boolean eIgual(Arvbin<T> outra) {
        if(this.esq == null && this.dir == null) {
            if(outra.esq == null && outra.dir == null) {
                if(this.val.compareTo(outra.val) == 0)
                    return true;
                else
                    return false;
            }
            else
                return false;
        }

        if(this.esq != null) {
            if(outra.esq == null)
                return false;
            else
                this.esq.eIgual(outra.esq);
        }
        else {
            if(outra.esq != null)
                return false;
        }

        if(this.dir != null) {
            if(outra.dir == null)
                return false;
            else
                this.dir.eIgual(outra.dir);
        }
        else {
            if(outra.dir != null)
                return false;
        }

        if(this.val.compareTo(outra.val) == 0)
            return true;
        else
            return false;
    }

    /* Resolucao da questao 3 disponivel no moodle. */
    public static boolean arvoreSoma(Arvbin<Integer> arvore) {
        if(arvore == null)
            return true;

        Integer somaFilhos = 0;

        boolean verificaEsq = false, verificaDir = false;

        if(arvore.esq != null) {
            verificaEsq = arvoreSoma(arvore.esq);
            somaFilhos += arvore.esq.val;
        }

        if(arvore.dir != null) {
            verificaDir = arvoreSoma(arvore.dir);
            somaFilhos += arvore.dir.val;
        }

        if(!verificaEsq || !verificaDir)
            return false;

        if(arvore.val != somaFilhos)
            return false;

        return true;
    }

    /* Calcula e retorna o diametro da arvore, isto e, o numero
     * de nos contido no maior caminho de um no para outro no da
     * arvore. */
    public int calculaDiametro() {
        /* Caso base, quando e uma folha. */
        if((esq == null) && (dir == null)) {
            return 1;
        }

        /* Calcula a altura das sub-�rvores esquerda e direita do n�. */
        int alturaEsq = 0, alturaDir = 0;

        if(esq != null)
            alturaEsq = esq.calculaAltura();

        if(dir != null)
            alturaDir = dir.calculaAltura();

        int maxDistanciaNo = alturaEsq + alturaDir + 1;

        /* Nesse ponto, temos a maior distancia entre dois nos da arvore
         * que passa pelo no corrente (this). Agora devemos calcular esse
         * valor para as sub-arvores esquerda e direita, comparando depois. */

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

    /* Verifica se um valor esta na arvore. Se estiver, retorna um ponteiro para o no que tem esse valor. Caso contrario, retorna null. */
    public Arvbin<T> busca(T valor) {
        Arvbin<T> ret;

        /* Se e igual ao valor armazenado, nao precisa procurar mais. O na e a raiz. */
        if (valor.compareTo(val) == 0) {
            return this;
        }

        /* Senao, comeca procurando na sub-arvore esquerda. */
        if (esq != null) {
            ret = esq.busca(valor);
            if (ret != null)
                return ret;
        }

        /* Se chega a esse ponto, estara na arvore se, e somente se, estiver na sub-arvore direita */
        if (dir != null)
            return dir.busca(valor);
        return null;
    }
}
