public class Partida {
    private String data;
    private String hora;
    private int placarTime1;
    private int placarTime2;
    private Estadio estadio;

    public Partida(String data, String hora, int placarTime1, int placarTime2, Estadio estadio) {
        this.data = data;
        this.hora = hora;
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
        this.estadio = estadio;
    }

    public void mostrarDados() {
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Placar Time 1: " + placarTime1);
        System.out.println("Placar Time 2: " + placarTime2);
        System.out.println("Estádio: " + estadio.getNome() + ", " + estadio.getCidade());
    }

    public void atualizarResultado(int novoPlacarTime1, int novoPlacarTime2) {
        this.placarTime1 = novoPlacarTime1;
        this.placarTime2 = novoPlacarTime2;
    }
}
