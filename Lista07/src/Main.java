//import java.util.Deque;
//import java.util.ArrayDeque;

public class Main
{
	public static void main(String[] args) {
				/*
				Arvbin<Integer> a1 = new Arvbin<Integer>(1),
				a2 = new Arvbin<Integer>(2),
				a3 = new Arvbin<Integer>(3,a1,a2),
				a4 = new Arvbin<Integer>(28),
				a5 = new Arvbin<Integer>(5),
				a6 = new Arvbin<Integer>(6),
				a7 = new Arvbin<Integer>(11,a5,a6);
				*/

				//(1(7(6(3)))(5(4(8))))
				Arvbin<Integer> ar1 = new Arvbin<Integer>(3),
				ar2 = new Arvbin<Integer>(6,ar1, null),
				ar3 = new Arvbin<Integer>(7, ar2, null),
				ar4 = new Arvbin<Integer>(1),
				ar5 = new Arvbin<Integer>(8),
				ar6 = new Arvbin<Integer>(4, null, ar5),
				ar7 = new Arvbin<Integer>(5,null, ar6);

				ar4.defineDir(ar7);
				ar4.defineDir(ar3);
				ar4.mostra();
				System.out.println();

				//a4.defineEsq(a3);
				//a4.defineDir(a7);
				//a4.mostra();
				//System.out.println();
				
				//System.out.println("N�mero de n�s: " + a4.contaNos());
				
				//System.out.println("Altura da �rvore: " + a4.calculaAltura());
				
				//Deque<Integer> caminhos = new ArrayDeque<Integer>();
				
				//a4.imprimeTodosCaminhos(caminhos);
				
				/*
				if(Arvbin.verificaArvoreSoma(a4) != Integer.MIN_VALUE)
					System.out.println("A �rvore corresponde a uma �rvore soma.");
				else
					System.out.println("A �rvore n�o corresponde a uma �rvore soma.");
				

				Arvbin<Integer> a11 = a4.busca(3);
				if (a11 != null)
				{
					a11.defineVal(11);
					a11.defineEsq(a10);
				}
				a4.mostra();
				System.out.println();
				*/
	}
}
