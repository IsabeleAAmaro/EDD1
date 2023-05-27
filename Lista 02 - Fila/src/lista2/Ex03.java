package lista2;

public class Ex03 {
    /*
    3) Como você implementaria uma fila de pilhas? E uma pilha de filas? E uma fila de filas?
    Implemente cada uma dessas estruturas. Você pode reaproveitar ou modificar as classes
    fornecidas e apresentadas em sala de aula.
     */

    public static void main(String[] args) {
        Fila f1 = new Fila(3);
        Fila f2 = new Fila(3);
        Fila f3 = new Fila(3);

        f1.insere(30);
        f1.insere(40);
        f1.insere(50);

        f2.insere(60);
        f2.insere(70);
        f2.insere(80);

        f3.insere(90);
        f3.insere(100);
        f3.insere(110);

        PilhaDeFilas pf1 = new PilhaDeFilas(3);
        pf1.push(f1);
        pf1.push(f2);
        pf1.push(f3);

        pf1.retornaTopo();

        // * - * - * - * - * - * - * - * - * - * //

        Pilha p1 = new Pilha(3);
        Pilha p2 = new Pilha(3);
        Pilha p3 = new Pilha(3);

        p1.push(1);
        p1.push(2);
        p1.push(3);

        p2.push(4);
        p2.push(5);
        p2.push(6);

        p3.push(7);
        p3.push(8);
        p3.push(9);

        FilaDePilhas FP1 = new FilaDePilhas(3);
        FP1.insere(p1);
        FP1.insere(p2);
        FP1.insere(p3);

        // * - * - * - * - * - * - * - * - * - * //

        Fila f4 = new Fila(3);
        Fila f5 = new Fila(3);
        Fila f6 = new Fila(3);

        f4.insere(3);
        f4.insere(4);
        f4.insere(5);

        f5.insere(6);
        f5.insere(7);
        f5.insere(8);

        f6.insere(9);
        f6.insere(10);
        f6.insere(11);

        FilaDeFilas FF1 = new FilaDeFilas(3);
        FF1.insere(f4);
        FF1.insere(f5);
        FF1.insere(f6);
    }
}
