package Atividade03;

public class Main {
    public static void main(String[] args) {
        Contabancaria conta = new Contabancaria();
        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.deposito(100.00);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
    
        conta.sacar(50.00);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        conta.sacar(200.00);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
