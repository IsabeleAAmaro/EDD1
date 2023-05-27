package Lista01;

public class Pilha2 {

    //coloquei um metodo q retorna o tamanho

    private int n;
    private char[] vetor;
    private int topo;

    public Pilha2()
    {
        n = 10;
        vetor = new char[n];
        topo = -1;
    }

    public Pilha2(int tamanho)
    {
        n = tamanho;
        vetor = new char[tamanho];
        topo = -1;
    }

    public int tamanho() {
        return n;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public boolean vazia()
    {
        return topo == -1;
    }

    public boolean cheia()
    {
        return topo == n - 1;
    }

    public char desempilha()
    {
        char c = '\0';

        if (!this.vazia())
        {
            c = vetor[topo];

            //Decrementando o topo, o elemento é "removido"
            topo--;
        }
        return c;
    }

    public boolean empilha(char elemento)
    {
        if (!this.cheia())
        {
            vetor[++topo] = elemento;
            return true;
        }
        else
        {
            //Impressão para fins didáticos
            System.out.println("Pilha cheia: push não funcionou.\n");
            return false;
        }
    }

    public char retornaTopo()
    {
        char elemento = '\0';

        if(!this.vazia())
        {
            elemento = vetor[topo];
        }
        else
        {
            //System.out.println("Pilha vazia.");
            //kkk..
        }

        return elemento;
    }

}
