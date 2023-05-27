package lista2;

import java.util.Arrays;

public class FilaDeFilas {

    protected int tamanho;    /* Tamanho do vetor */
    protected Fila[] vetor;    /* Vetor de elementos */
    protected int ini;    /* Posicao do proximo elemento a ser retirado */
    protected int n;    /* Numero de elementos na fila */

    public int getN() {
        return n;
    }

    public FilaDeFilas(int tam) {
        tamanho = tam;
        vetor = new Fila[tamanho];
        ini = 0;
        n = 0;
    }

    public boolean vazia() {
        return (n == 0);
    }

    public boolean cheia() {
        return (n == tamanho);
    }

    //Retiramos o elemento do in�cio da fila
    public Fila remove() {
        //int elemento = Integer.MIN_VALUE;
        Fila f = new Fila(this.n);

        if (!this.vazia()) {
            f = vetor[ini];
            ini = (ini + 1) % tamanho;
            n--;
        }

        return f;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(Fila f) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho;
            vetor[fim] = f;
            n++;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "vetor=" + Arrays.toString(vetor) +
                '}';
    }
}