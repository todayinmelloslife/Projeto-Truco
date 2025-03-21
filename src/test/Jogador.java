import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private List<Carta> mao;
    private int pontuacao;

    public Jogador() {
        this.mao = new ArrayList<>();
        this.pontuacao = 0;
    }

    public void adicionarCarta(Carta carta) {
        mao.add(carta);
    }

    public int calcularPontuacao() {
        return pontuacao;
    }

    public List<Carta> getMao() {
        return new ArrayList<>(mao);
    }

    public void resetarMao() {
        mao.clear();
        pontuacao = 0;
    }
}