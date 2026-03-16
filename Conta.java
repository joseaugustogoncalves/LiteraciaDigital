import java.util.ArrayList;

public class Conta {
    public double saldo = 0;
    public ArrayList<Movimento> movimentos = new ArrayList<>();

    public void depositar(double valor) {
        saldo += valor;
        movimentos.add(new Movimento(Movimento.Tipo.DEPOSITO, valor));
    }

    public void levantar(double valor) {
        // ERROS:
        // - permite levantar valor negativo
        // - permite saldo negativo
        saldo -= valor;
        movimentos.add(new Movimento(Movimento.Tipo.LEVANTAMENTO, valor));
    }

    public Movimento getMovimento(int index) {
        return movimentos.get(index); // pode lançar IndexOutOfBoundsException
    }
}
