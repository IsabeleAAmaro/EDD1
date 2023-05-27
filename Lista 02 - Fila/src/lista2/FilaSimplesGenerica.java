package lista2;

import java.util.Arrays;
public class FilaSimplesGenerica<T> {
    protected int tamanho;	/* Tamanho do vetor */
    protected T[] vetor;	/* Vetor de elementos */
    protected int ini;	/* Posicao do proximo elemento a ser retirado */
    protected int n;	/* Numero de elementos na fila */

    public FilaSimplesGenerica(int tam) {
        tamanho = tam;
        vetor = (T[]) new Object[tamanho];
        ini = 0;
        n = 0;
    }

    public boolean vazia() {
        return (n == 0);
    }

    public boolean cheia() {
        return (n == tamanho);
    }

    public T remove() {
        T elemento = null;
        if (!this.vazia()) {
            elemento = vetor[ini];
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    public boolean insere(T elemento) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho;
            vetor[fim] = elemento;
            n++;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }
}

