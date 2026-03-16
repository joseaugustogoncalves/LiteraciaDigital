public class Movimento {
    public enum Tipo { DEPOSITO, LEVANTAMENTO }

    public Tipo tipo;
    public double valor;

    public Movimento(Tipo tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}