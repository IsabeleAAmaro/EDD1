package Oficiais;

import java.util.Scanner;

    /*
    7) Em sala de aula, aprendemos a avaliar uma expressão aritmética que estivesse em
    notação pós-fixada, que não faz uso de parênteses por não possuir ambiguidade na sua
    avaliação. Neste exercício, você deve utilizar o conceito de Pilha para realizar a avaliação
    de expressões aritméticas em notação infixa, isto é, aquela que aprendemos e utilizamos ao
    longo do Ensino Fundamental e do Ensino Médio. Nesse contexto, vamos usar a seguinte
    definição recursiva: uma expressão aritmética é um número, ou um parêntese esquerdo
    seguido de uma expressão aritmética seguida por um operador seguido por outra expressão
    aritmética seguida de um parêntese direito. Por simplicidade, essa definição assume que a
    expressão está completamente parentizada, especificando precisamente quais operadores
    devem ser aplicados a quais operandos e removendo possíveis ambiguidades na avaliação.
    Por exemplo, a expressão ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) segue essa definição.
    Você deve então implementar um método que realize a avaliação de tais expressões
    representadas em uma String usando o conceito de Pilha. Por fim, cabe citar que o código
    que voces vão desenvolver corresponde a um exemplo simples de um interpretador: um
    programa que interpreta uma computação especificada por uma string e realiza tal
    computação para chegar ao resultado.
    */

public class Ex07 {

    public static int prece(char op) {

        return switch (op) {
            case '+', '-' -> 1;
            case '/', '*' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }

    public static String conversao(String expressao) {
        StringBuilder res = new StringBuilder();
        Pilha2 p = new Pilha2();
        char c;

        for(int i = 0; i < expressao.length(); i++) {
            c = expressao.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                res.append(c);
            } else if(c == '(') {
                p.empilha(c);
            } else if(c == ')') {
                while (!p.vazia() && p.retornaTopo() != '(') {
                    res.append(p.desempilha());
                }
                p.desempilha();
            } else {
                while (!p.vazia() && prece(c) <= prece(p.retornaTopo())) {
                    res.append(p.desempilha());
                }
                p.empilha(c);
            }
        }

        while (!p.vazia()) {
            if(p.retornaTopo() == '(') {
                return "Expressão Inválida!";
            }
            res.append(p.desempilha());
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma expressão em notação infixa:");
        String expressao = input.nextLine();
        // Pra ignorar os espaços
        expressao = expressao.replaceAll("\\s+","");

        String expConversao = conversao(expressao);
        PosFixada pos = new PosFixada(expressao.length());

        pos.leExpressao(expConversao);

        if (pos.avaliaExpressao()) {
            pos.imprimeResposta();
        }
    }
}
