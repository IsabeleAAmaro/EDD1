package lista2;

import java.util.Scanner;

public class Ex05 {

    /*
    Uma loja deseja implementar um sistema diferente em seus caixas. Haverá apenas uma
    fila e essa fila será ordenada conforme o grau de prioridade dos clientes. Haverá dois tipos
    de cliente, que possuem diferentes prioridades: o “cliente idoso” e o “cliente adulto”. Esses
    serão ordenados da seguinte forma:
    i) Um cliente idoso sempre passará a frente dos clientes adultos;
    ii) No caso de mais de um cliente idoso na fila, o que tiver entrado primeiro na fila
    permanece em sua posição e o outro se posiciona após ele;
    Iii) Implemente os métodos e atributos necessários para que esse sistema de fila seja
    possível. Você pode utilizar e modificar a implementação de fila que julgar mais adequada
    (fila circular ou fila dupla, vistas em sala de aula).
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prioridade;
        Fila f1 = new Fila(6);

        while (!f1.cheia()) {
            System.out.println("Cliente a entrar na fila:");
            System.out.println("1 - Idoso");
            System.out.println("2 - Adulto");
            prioridade = input.nextInt();

            if(prioridade == 1 ||  prioridade == 2) {
                f1.insere(prioridade);
            } else System.out.println("Opção inválida");
        }
        f1.prioridade(f1);
    }
}
