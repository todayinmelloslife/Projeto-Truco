import java.util.HashSet;
import java.util.Set;

public class Time {
    private Set<String> jogadores;

    public Time() {
        this.jogadores = new HashSet<>();
    }

    public boolean adicionarJogador(String jogador) {
        if (jogadores.size() < 2) {
            return jogadores.add(jogador);
        }
        return false;
    }

    public boolean removerJogador(String jogador) {
        return jogadores.remove(jogador);
    }

    public Set<String> listarJogadores() {
        return new HashSet<>(jogadores);
    }

    public boolean isDuplaCompleta() {
        return jogadores.size() == 2;
    }
}