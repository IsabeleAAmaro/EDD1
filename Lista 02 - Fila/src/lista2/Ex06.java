package lista2;

import java.util.Scanner;

public class Ex06 {

    /*
    Dado um número inteiro N, faça um algoritmo eficiente que use fila para gerar todas as
    representações binárias dos números inteiros entre 1 e N.
     */

    public static String Converte(int n) {
        if (n == 1) {
            return "1";
        }
        if (n % 2 == 0) {
            return Converte(n / 2) + "0";
        } else {
            return Converte(n / 2) + "1";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        int n = input.nextInt();
        //String binario;

        FilaSimplesGenerica<String> fila = new FilaSimplesGenerica<>(n);
        fila.insere("1");

        for(int i = 2; i <= n; i++) {
            String binario = Converte(i);
            fila.insere(binario);
        }

        System.out.println("Binários 1 a N");
        while (!fila.vazia()){
            System.out.println(fila.remove());
        }
    }
}
