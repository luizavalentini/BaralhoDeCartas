public class App {
    public static void main(String args[]) {
        Baralho baralho = new Baralho();
        
        baralho.embaralhar();
        while (!baralho.vazio()) {
            System.out.println(baralho.retiraCartaTopo());
        }

    }
}