package lista2;

public class Ex01 {

    /*
    1) Sabe-se que existem partes de sistemas operacionais que cuidam da ordem em que os
    processos devem ser executados. Por exemplo, em um sistema de computação “timeshared”,
    existe a necessidade Realize
    uma modelagem e crie classes que representam um Processo e o Sistema Operacional.
    Dessa maneira, escreva métodos para:
    a. Incluir novos processos em uma fila de processos;
    b. Retirar da fila o processo com o maior tempo de espera;
    c. Imprimir o conteúdo da fila de processos em determinado momento. Cada processo
    possui um número identificador.
     */

    //OK, apesar de q eu acho q talvez deveria sim comparar tempos pra retirar

    public static void main(String[] args) {
        SistemaOperacional SO = new SistemaOperacional(3);

        //colocar input humano se pá
        SO.incluir(new Processo(1, 15));
        SO.incluir(new Processo(2, 10));
        SO.incluir(new Processo(3, 8));

        SO.imprimir();
        SO.retira();
        SO.imprimir();
    }
}
