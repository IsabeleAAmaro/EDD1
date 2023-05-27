package Oficiais;

import java.util.Scanner;

public class Ex04 {

    /*
    4) Utilizando as operações de manipulação de pilhas vistas em aula, assim como o código
    de PilhaGenerica visto, use uma pilha auxiliar e uma variável do tipo T, para desenvolver
    um procedimento que remova um dado objeto do tipo T de uma posição qualquer de uma
    pilha. Para saber se dois objetos do tipo T são iguais, você deve usar o método equals (ou
    compareTo). Note que você não pode acessar diretamente a estrutura interna da pilha
    (atributos), devendo usar apenas as operações (métodos) de manipulação.
     */

    public static <T> void removeElemento(PilhaGenerica<T> pilha, T elemento) {
        PilhaGenerica<T> pilhaAux = new PilhaGenerica<T>(pilha.tamanho());
        T elementoAtual;

        while (!pilha.vazia()) {
            elementoAtual = pilha.pop();

            if (!elementoAtual.equals(elemento)) {
                pilhaAux.push(elementoAtual);
            }
        }

        while (!pilhaAux.vazia()) {
            pilha.push(pilhaAux.pop());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PilhaGenerica<Integer> pilha = new PilhaGenerica<>(5);

        pilha.push(13);
        pilha.push(20);
        pilha.push(35);
        pilha.push(47);
        pilha.push(58);

        System.out.println("Pilha antes da remoção:");
        while (!pilha.vazia()) {
            System.out.println(pilha.pop());
        }

        // Empilha novamente os números na pilha
        pilha.push(13);
        pilha.push(20);
        pilha.push(35);
        pilha.push(47);
        pilha.push(58);

        // Remove o número 3 da pilha
        removeElemento(pilha, 35);

        // Exibe a pilha após a remoção
        System.out.println("Pilha após a remoção:");
        while (!pilha.vazia()) {
            System.out.println(pilha.pop());
        }
    }
    }

