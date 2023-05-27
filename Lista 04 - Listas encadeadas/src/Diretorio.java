public class Diretorio extends Arquivo {
    ListaGenerica<Arquivo> arquivos = new ListaGenerica<>();

    //herdando de arquivo
    public Diretorio(String nomeArq) {
        super(nomeArq);
    }

    public void insere (Arquivo arquivo) {
        arquivos.insere(arquivo);
    }

    @Override
    public void imprime(int indentacao) {
        super.imprime(indentacao);

        if(arquivos.tamanho() == 0) {
            System.out.println("\t".repeat(indentacao + 1) + "Diretório vazio.");
        }

        for(var p = arquivos.prim; p != null; p = p.prox) {
            p.dado.imprime(indentacao + 1);
        }
    }

    public boolean criarDiretorios() {

        //A impresão não tá ideal, o subdiretorio de séries favoritas e roomantics tao saindo errado
        //e a ordem dos bagulhos tá de "cabeça" pra baixo (pq a lista insere no final será?)
        Diretorio principal = new Diretorio("Principal");

        Diretorio videosSalvos = new Diretorio("Videos Salvos");
        videosSalvos.insere(new Arquivo("Apresentacao.mp4"));
        videosSalvos.insere(new Arquivo("The Office - S04EP03.mkv"));
        videosSalvos.insere(new Arquivo("Gatinho_dormindo.mp4"));
        principal.insere(videosSalvos);

        Diretorio faculdade = new Diretorio("Faculdade");
        faculdade.insere(new Arquivo("EDD2"));
        faculdade.insere(new Arquivo("AA"));

        Diretorio subFaculdade = new Diretorio("Eletivas");
        subFaculdade.insere(new Arquivo("Bioestatística"));
        subFaculdade.insere(new Arquivo("Filosofia da ciência"));
        subFaculdade.insere(new Arquivo("Geometria Analítica"));
        faculdade.insere(subFaculdade);
        faculdade.insere(new Arquivo("Redes II"));
        principal.insere(faculdade);

        Diretorio series = new Diretorio("Séries");
        Diretorio seriesFavoritas = new Diretorio("Séries favoritas");
        seriesFavoritas.insere(new Arquivo("Veep"));
        seriesFavoritas.insere(new Arquivo("Succession"));
        seriesFavoritas.insere(new Arquivo("Severance"));
        series.insere(seriesFavoritas);

        Diretorio seriesRomanticas = new Diretorio("Séries romanticas");
        seriesRomanticas.insere(new Arquivo("Fleabag"));
        seriesRomanticas.insere(new Arquivo("Normal People"));
        seriesFavoritas.insere(seriesRomanticas);

        Diretorio seriesAssistir = new Diretorio("Assistir mais tarde");
        seriesAssistir.insere(new Arquivo("Mad Men"));
        seriesAssistir.insere(new Arquivo("Gilmore Girls"));
        series.insere(seriesAssistir);

        Diretorio seriesDrama = new Diretorio("Séries de drama");
        series.insere(seriesDrama);
        principal.insere(series);

        principal.imprime(0);
        return true;
    }
}
