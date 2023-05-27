public class Arquivo {
    protected String nomeArq;

    public Arquivo(String nomeArq) {
        this.nomeArq = nomeArq;
    }

    public void imprime(int indentacao) {
        StringBuilder Stringindentada = new StringBuilder();
        for (int i = 0; i < indentacao; i++) {
            Stringindentada.append("\t");
        }
        System.out.println(Stringindentada + nomeArq);
    }
}
