public class Livro {
  private String nome;
  private Autor[] autores;
  private double preco;
  private int quantidade = 0;

  public Livro(String nome, Autor[] autores, Double preco, int quantidade){
    this.nome = nome;
    this.autores = autores;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome(){
    return this.nome;
  }

  public String getAutor(){
    String autorData = "";
    for(Autor autor : this.autores){
      autorData += autor;
    }
    return autorData;
  }

  public Double getPreco(){
    return this.preco;
  }

  public void setPreco(Double preco){
    this.preco = preco;
  }

  public int getQuantidade(){
    return this.quantidade;
  }

  public int setQuantidade(){
    return this.quantidade;
  }

  public String getAutoresData(){
    String autorData = "";
    for(Autor autor : this.autores){
      autorData += autor;
    }
    return autorData;
  }

  public String toString(){
    String autorData = "";
    for(Autor autor : this.autores){
      autorData += autor;
    }
    return this.nome + ", " + this.preco + ", " + this.quantidade + ", " + autorData;
  }
}