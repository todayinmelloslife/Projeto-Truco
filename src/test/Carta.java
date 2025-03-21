public class Carta {
    private String valor;
    private String naipe;

    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }

    public boolean equals(Carta outraCarta) {
        return this.valor.equals(outraCarta.valor) && this.naipe.equals(outraCarta.naipe);
    }
}