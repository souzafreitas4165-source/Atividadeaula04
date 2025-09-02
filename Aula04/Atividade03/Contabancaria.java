package Atividade03;

public class Contabancaria {
    private int numeroconta;
    private double saldo;

    
    public Contabancaria() {
        this.numeroconta = 12345;
        this.saldo = 1.50;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito concluído!");
        } else {
            System.out.println("Depósito incorreto, tente novamente!");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
}
