import java.util.Random;

// tipo abastrato de dados
public class Baralho {
    private final int TAM = 52;
    private Carta[] cartas;
    private int topo;

    public Baralho() {
        // 52
        // A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
        // Ouro, Paus, Copas, Espada

        cartas = new Carta[52];

        // Inicializa baralho
        for (int i = 0, valor = 1; i < 13; i++, valor++) {
            cartas[i] = new Carta(valor, Naipe.OURO);
        }
        for (int i = 13, valor = 1; i < 26; i++, valor++) {
            cartas[i] = new Carta(valor, Naipe.PAUS);
        }
        for (int i = 26, valor = 1; i < 39; i++, valor++) {
            cartas[i] = new Carta(valor, Naipe.COPAS);
        }
        for (int i = 39, valor = 1; i < 52; i++, valor++) {
            cartas[i] = new Carta(valor, Naipe.ESPADA);
        }
        topo = 52;
    }
    
    public void embaralhar() {
        // embaralhar o baralho
        Random rand = new Random();
        for (int i = 0; i < cartas.length; i++) {
            int pos = rand.nextInt(52);
            Carta aux = cartas[i];
            cartas[i] = cartas[pos];
            cartas[pos] = aux;
        }
        topo = 52;
    }

    public boolean vazio() {
        return topo == 0;
    }

    public Carta retiraCartaTopo() {
        if (vazio()) {
            return null;
        }
        topo--;
        return cartas[topo];
    }

    public Carta getCarta(int pos) {
        if (pos < 0 || pos >= TAM)
            return null;
        return cartas[pos];
    }
}
