package Atividade04;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2500.00);
        Produto p2 = new Produto("Celular", -500.00);

        System.out.println("Produto 1: " + p1.getNome() + " - R$ " + p1.getPreco());
        System.out.println("Produto 2: " + p2.getNome() + " - R$ " + p2.getPreco());

        p1.setPreco(-1000.00);
        p1.setPreco(2200.00);
        System.out.println("Produto 1 (atualizado): " + p1.getNome() + " - R$ " + p1.getPreco());
    }
 }
    

