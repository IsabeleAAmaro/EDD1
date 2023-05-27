package lista2;

public class Processo {
    protected int id;
    protected int tempoEspera;

    public Processo(int id) {
        this.id = id;
    }

    public Processo(int id, int tempo) {
        this.id = id;
        this.tempoEspera = tempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempo() {
        return tempoEspera;
    }

    public void setTempo(int tempo) {
        this.tempoEspera = tempo;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "id=" + id +
                ", tempoEspera=" + tempoEspera +
                '}';
    }
}
