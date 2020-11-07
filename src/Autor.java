public class Autor{

    private String nome;
    private String email;
    private char gender;

    public Autor(String nome, String email, char gender){
        this.nome = nome;
        this.email = email;
        this.gender = gender;
    }

    public String toString(){
        return "(" + this.nome + " , " + this.gender + " , " + this.email + ")";
    }
}
