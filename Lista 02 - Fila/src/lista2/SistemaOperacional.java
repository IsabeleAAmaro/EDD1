package lista2;

import java.util.Arrays;

public class SistemaOperacional {

    protected int tamanho;
    protected Processo[] vetor;
    protected int ini;
    protected int n;
    protected Processo[] aux;

    public SistemaOperacional(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new Processo[tamanho];
        this.ini = 0;
        this.n = 0;
    }

    public boolean vazia() { return (n == 0); }

    public boolean cheia() { return (n == tamanho); }

    public boolean incluir(Processo processo) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho;
            vetor[fim] = processo;
            n++;
            return true;
        } else {
            return false;
        }
    }

    public Processo retira() {
        Processo processo = null;

        if (!this.vazia()) {
            processo = vetor[ini];
            vetor[ini] = null;
            ini = (ini + 1) % tamanho;
            n--;
        }
        return processo;
    }

    public void imprimir() {
        System.out.println("\nLista de Processos:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] != null)
                System.out.println(vetor[i]);
        }
    }

    @Override
    public String toString() {
        return "SistemaOperacional{" +
                "vetor=" + Arrays.toString(vetor) +
                '}';
    }
}
