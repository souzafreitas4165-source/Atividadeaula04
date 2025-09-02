package Atividade06;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
}
public Livro(String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
}
public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor:
}
public boolean isdisponivel(){
    return disponivel;
}
public void emprestar(){
    if(disponivel){
        disponivel = false
        system.out.println("Livro" + titulo + "Livro disponvel para empréstimo!");
    } else{
        system.out.print("livro" + titulo + "LIvros indisponivel para empréstimo!");
    }
public void devolver(){
    if(disponivel){
        disponivel = true
        System.out.println("Livro" + titulo + "Livro devolvido com sucesso!");
    }else {
        system.out.println("Livro" + titulo + "Está disponivel!")
    }

}



