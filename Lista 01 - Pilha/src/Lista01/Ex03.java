package Oficiais;
import java.util.Scanner;

public class Ex03 {

        /*
        3) Desenvolva um método para manter duas pilhas dentro de um único vetor (array) de
        modo que nenhuma das pilhas incorra em estouro até que toda a memória seja usada, e
        toda uma pilha nunca seja deslocada para outro local dentro do vetor.
         */

        public static void addVetor(PilhaGenerica<Integer> p1, PilhaGenerica<Integer> p2, Integer tam) {
            Integer[] vetor = new Integer[tam];

            int i = 0;
            while(!p1.vazia()){
                vetor[i] = p1.pop();
                i++;
            }

            int j = i;
            while(!p2.vazia()) {
                vetor[j] = p2.pop();
                j++;
            }

            System.out.println("Vetor: ");
            for (Integer integer : vetor) {
                System.out.print(integer);
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int p1Tam;
            System.out.println("Digite o tamanho da primeira pilha:");
            p1Tam = input.nextInt();
            PilhaGenerica<Integer> p1 = new PilhaGenerica<>(p1Tam);

            System.out.println("Informe os valores da primeira pilha: \n");
            for (int i = 0; i < p1Tam; i++) {
                int posP1 = input.nextInt();
                p1.push(posP1);
            }
            int p2Tam;
            System.out.println("Informe o tamanho da segunda pilha: \n");
            p2Tam = input.nextInt();
            PilhaGenerica<Integer> p2 = new PilhaGenerica<>(p2Tam);

            System.out.println("Informe os valores da segunda pilha: \n");
            for (int i = 0; i < p2Tam; i++) {
                int posP2 = input.nextInt();
                p2.push(posP2);
            }
            addVetor(p1, p2, (p1Tam + p2Tam));
        }
    }

