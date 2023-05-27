public class Ex06 {

    /*
    6) Um diretório é uma lista de arquivos e outros diretórios. Assim sendo, crie um programa
    que receba o nome de um diretório e imprima o nome de todos os arquivos e outros diretórios
    contidos naquele, de modo que o conteúdo de cada diretório seja recursivamente listado (de
    forma indentada) sob o nome do diretório pai
     */

    //Complexidade: Fora os metodos de impressão que sao O(n), o metodo de criar diretorios é O(1)
    public static void main(String[] args) {
        Diretorio d = new Diretorio("Home");
        System.out.println(d.criarDiretorios());
    }
}
