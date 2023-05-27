package Oficiais;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex08 {

    /*
    8) Dada uma sequência de 1 a N armazenada em um array, são formadas todas as
    subsequências (subarrays) possíveis a partir da sequência original. Para todas essas
    subsequências geradas, encontre a quantidade de pares únicos (a, b), em que ‘a’ é
    diferente de ‘b’ e ‘a’ é máximo (maior número) e ‘b’ é o segundo máximo da subsequência.
     */
    public static void parUnico(int n, int[] seq) {
        Par par;
        Set<Par> pares = new HashSet<>();
        for (int i = 0; i < n - 1; ++i) {
            int maior = Math.max(seq[i], seq[i + 1]);
            int segundoMaior = Math.min(seq[i], seq[i + 1]);

            int a = i + 1;
            while (n > a) {
                if (seq[a] > maior) {
                    segundoMaior = maior;
                    maior = seq[a];
                }
                if (seq[a] < maior && seq[a] > segundoMaior) {
                    segundoMaior = seq[a];
                }
                par = new Par(maior, segundoMaior);
                pares.add(par);
                ++a;
            }
        }
        imprimirPares(pares);
    }

    public static void imprimirPares(Set<Par> pares) {
        System.out.println("Quantidade de pares únicos: " + pares.size());
        System.out.println("Pares: ");

        for (Par p : pares) System.out.println("(" + p.getN1() + ", " + p.getN2() + ")");
    }


    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n = input.nextInt();

        while (n < 0) {
            System.out.println("Valor inválido, digite novamente");
            n = input.nextInt();
        }

        int[] seq = new int[n];

        int i = 0;
        while (i < n) {
            System.out.println((i + 1) + "º número: ");
            seq[i] = input.nextInt();
            i++;
        }

        parUnico(n, seq);
        }
    }
