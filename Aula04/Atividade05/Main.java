package Atividade05;

public class Main {
    public static void main(String[] args) {    
        Endereco e1 = new Endereco("Rua Marechal Rondon", 188);
        Endereco e2 = new Endereco("Rua Pirajá", 422);

        Pessoa p1 = new Pessoa("Pedro", 30, e1);
        Pessoa p2 = new Pessoa("Dux", 25, e2);
 
        p1.mostrarDados();
        p2.mostrarDados();
    }
}
