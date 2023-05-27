package lista2;

public class PilhaDeFilas {
    private int n;
    private Fila vetor[];
    //private Fila filaTopo;
    private int topo;

    public PilhaDeFilas()
    {
        n = 10;
        vetor = new Fila[n];
        topo = -1;
    }

    public PilhaDeFilas(int tamanho)
    {
        n = tamanho;
        vetor = new Fila[tamanho];
        topo = -1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == n - 1;
    }

    public Fila pop() {
        Fila f = new Fila(vetor[topo].getN());

        if (!this.vazia()) {
            for(int i = 0; i < f.tamanho; i++) {
                int aux = vetor[topo].remove();
                f.insere(aux);
            }
            //esse topo vai decremenar aqui msm?
            topo--;

        } else {
            //Impress�o para fins did�ticos
            System.out.println("Pilha vazia: pop n�o funcionou.");
        }
        return f;
    }

    public boolean push(Fila f) {
        if (!this.cheia()) {
            vetor[++topo] = f;
            return true;
        }
        else {
            //Impress�o para fins did�ticos
            System.out.println("Pilha cheia: push n�o funcionou.\n");
            return false;
        }
    }

    public Fila retornaTopo() {
        //char elemento = '\0';
        Fila f = new Fila(this.n);

        if(this.vazia()) {
            System.out.println("Pilha vazia.");
            return null;
            //será q é melhor retornar false?
        }
        return vetor[topo];
        //vai retornar os elementos ou oq?
    }
}
