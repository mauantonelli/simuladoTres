import java.util.ArrayList;
import java.util.List;

public class Time {
    private String pais;
    private int quantidadeTitulo;
    private List<Jogador> jogadores;

    public Time(String pais, int quantidadeTitulo) {
        this.pais = pais;
        this.quantidadeTitulo = quantidadeTitulo;
        this.jogadores = new ArrayList<>(); // Inicialize a lista aqui
    }

    public void adicionarJogador(Jogador jogador){
        jogadores.add(jogador);
    }
}
