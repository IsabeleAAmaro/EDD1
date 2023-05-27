package lista2;

import java.util.Arrays;

public class FilaDePilhas {
    protected int tamanho;    /* Tamanho do vetor */
    protected Pilha[] vetor;    /* Vetor de elementos */
    protected int ini;    /* Posicao do proximo elemento a ser retirado */
    protected int n;    /* Numero de elementos na fila */

    public int getN() {
        return n;
    }

    public FilaDePilhas(int tam) {
        tamanho = tam;
        vetor = new Pilha[tamanho];
        ini = 0;
        n = 0;
    }

    public boolean vazia() {
        return (n == 0);
    }

    public boolean cheia() {
        return (n == tamanho);
    }

    public Pilha remove() {
        //int elemento = Integer.MIN_VALUE;
        Pilha p = new Pilha();
        p = null;

        if (!this.vazia()) {
            p = vetor[ini];
            ini = (ini + 1) % tamanho;
            n--;
        }

        return p;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(Pilha p) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho;
            vetor[fim] = p;
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
