public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Mauricio", "Atacante", 9);

        Time time1 = new Time("Brasil", 5);
        Time time2 = new Time("Argentina", 1);

        time1.adicionarJogador(jogador);

        Estadio estadio = new Estadio("Maracanã", "RJ");
        Partida partida = new Partida("19/12/2023", "13", 2, 3, estadio);

        partida.atualizarResultado(5, 2);
        partida.mostrarDados();
    }
}
