import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};
        String[] valores = {"4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"};

        for (String naipe : naipes) {
            for (String valor : valores) {
                cartas.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta darCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(cartas.size() - 1);
    }

    public void add(Carta carta) {
        cartas.add(carta);
    }

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.embaralhar();
        System.out.println("Carta distribuída: " + baralho.darCarta());
    }
}

class Carta {
    private String naipe;
    private String valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}