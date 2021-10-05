public class Carta {
    private int valor;
    private Naipe naipe;

    public Carta(int valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String getValor() {
        if (valor == 1) {
            return "A";
        } else if (valor > 1 && valor <= 10) {
            return ""+valor;
        } else if (valor == 11) {
            return "J";
        } else if (valor == 12) {
            return "Q";
        } else {
            return "K";
        }
    }
    
    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return "Carta [naipe=" + naipe + ", valor=" + getValor() + "]";
    }
}
