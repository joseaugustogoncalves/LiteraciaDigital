import java.util.ArrayList;

public class Conta {
    public double saldo = 0;
    public ArrayList<Movimento> movimentos = new ArrayList<>();

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        saldo += valor;
        movimentos.add(new Movimento(Movimento.Tipo.DEPOSITO, valor));
    }

    public void levantar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
    
        saldo -= valor;
        movimentos.add(new Movimento(Movimento.Tipo.LEVANTAMENTO, valor));
    }

    public Movimento getMovimento(int index) {
        return movimentos.get(index); // pode lançar IndexOutOfBoundsException
    }
    
    public double mediaDepositos() {
        double soma = 0;
        int cont = 0;
    
        for (Movimento m : movimentos) {
            if (m.tipo == Movimento.Tipo.DEPOSITO) {
                soma += m.valor;
                cont++;
            }
        }
    
        return soma / cont;  // <-- pode dividir por zero
    }

    public double mediaLevantamentos() {
        double soma = 0;
        int cont = 0;
    
        for (Movimento m : movimentos) {
            if (m.tipo == Movimento.Tipo.LEVANTAMENTO) {
                soma += m.valor;
                cont++;
            }
        }
    
        return soma / cont;  // <-- idem
    }
}
