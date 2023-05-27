package Lista01;

import java.util.Scanner;

    /*
    Escreva um programa que leia uma sequência de caracteres e determine se os
    parênteses, colchetes e chaves estão balanceados. Se a sequência não possuir esses
    caracteres ele deve ser considerado balanceado. Exemplo:
    “{ab}[cde]” - Balanceado
    “{ab[cd]efg}” - Balanceado
    “[abcde{efg]}” - Não balanceado
     */

public class Ex05 {
        static String abre = "({[";
        static String fecha =")}]";

        public static void checkBalanceado(String exp){

            Pilha2 pilha = new Pilha2();

            char simbolo, topo;
            int i;
            for(i = 0; i < exp.length(); i++){
                simbolo = exp.charAt(i);

                if (abre.indexOf(simbolo) > - 1){
                    pilha.empilha(simbolo);
                }else if (fecha.indexOf(simbolo) > - 1){
                    if(pilha.vazia()){
                        return;
                    }
                    else{
                        topo = pilha.desempilha();
                        if (abre.indexOf(topo) != fecha.indexOf(simbolo)){
                            System.out.println("A expressão não está balanceada");
                            //return;
                        }else{
                            System.out.println("A expressão está balanceada");
                            //return;
                        }
                    }
                }
            }
        }

    public static void main(String[] args) {
        System.out.println("Insira a expressão: ");
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();

        checkBalanceado(exp);

    }
}

