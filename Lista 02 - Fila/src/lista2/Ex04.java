package lista2;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

       /* 4) Implemente um método estático na classe Fila, a qual implementa uma fila circular. Eses
        método deve receber uma fila circular e retornar uma fila circular dupla. */

        Scanner input = new Scanner(System.in);
        int num, n_aux;
        int escolha;

        Fila f1 = new Fila(4);
        FilaDupla fd1 = new FilaDupla(4);

        do {
            System.out.println("--------------------------");
            System.out.println("Selecione a opcao:");
            System.out.println("1. Insere elemento no fim da fila.");
            System.out.println("2. Remove elemento do inicio da fila.");
            System.out.println("3. Converte para fila dupla");
            System.out.println("4. Insere elemento no inicio da fila.");
            System.out.println("5. Remove elemento do fim da fila.");
            System.out.println("6. Imprime elementos a partir do inicio da fila.");
            System.out.println("0. Fim.");
            System.out.println("Opcao: ");
            escolha = input.nextInt();


            switch (escolha) {
                case 0:
                    break;
                case 1:
                    System.out.println("Insira o elemento para adicionar no fim da fila: ");
                    num = input.nextInt();
                    if (!f1.insere(num)) {
                        System.out.println("Fila cheia.");
                    }

                    break;
                case 2:
                    num = f1.remove();
                    if (num != Integer.MIN_VALUE) {
                        System.out.println("Elemento " + num + " removido.");
                    } else {
                        System.out.println("Fila vazia");
                    }
                    break;
                case 3:
                    fd1 = Fila.implementaCircularDupla(f1);
                    fd1.imprime();
                    break;
                case 4:
                    System.out.println("Insira o elemento para adicionar no inicio da fila: ");
                    num = input.nextInt();
                    if (!fd1.insereInicio(num)) {
                        System.out.println("Fila cheia.");
                    }
                    break;
                case 5:
                    System.out.println("Insira o elemento para remover do fim da fila: ");
                    //imprimindo pra testar
                    //fd1.imprime();
                    num = input.nextInt();
                    n_aux = fd1.removeFim();
                    if (num != Integer.MIN_VALUE) {
                        System.out.println("Elemento " + n_aux + " removido.");
                    } else {
                        System.out.println("Fila vazia");
                    }
                    //SÓ PRA TESTAR
                    //fd1.imprime();
                    break;
                case 6:
                    fd1.imprime();
                    break;

            }
        } while (escolha != 0);
    }
}
