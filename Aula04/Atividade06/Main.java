package Atividade06;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro l2 = new Livro("Pequeno principe", "Antonie de Saint");
        Livro l3 = new Livro("1984", "George Orwell");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("POO em Java");

        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("POO em Java");

        biblioteca.mostrarLivros();
    }
}
