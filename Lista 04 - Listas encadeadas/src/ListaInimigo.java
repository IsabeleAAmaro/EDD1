public class ListaInimigo extends ListaGenerica<Inimigo> {

    @Override
    public void insere(Inimigo inimigo) {
        super.insere(inimigo);
    }

    public Inimigo localizar(Inimigo inimigo) {
        boolean IniLocalizado = super.busca(inimigo);
        return inimigo;
    }

    public int efetuarDano(Inimigo inimigo, double dano) {
        if(super.busca(inimigo)) {
            inimigo.setVida((int) (inimigo.getVida() - dano));
            return inimigo.getVida();
        }

        if(inimigo.getVida() <= 0) {
            super.remove(inimigo); //morreu
        }
        return inimigo.getVida();
    }

    public void imprime() {
        Elo p;

        for (p = prim; p != null; p = p.prox) {
            System.out.print(p.dado + "\n");
            System.out.print("Vida restante: " + p.dado.getVida() + "\n");
        }

        System.out.println();
    }
}
