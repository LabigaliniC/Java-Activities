public class LivroTeste {
    public static void main(String[] args) {

        Autor[] autores = new Autor[2];
        autores[0] = new Autor("Abraham Silberschatz", "silberschatz@example.com", 'm');
        autores[1] = new Autor("R. Korth", "korth@example.com", 'm');

        // Declarar e instanciar um livro
        Livro databases = new Livro("Sistema de Banco de Dados", autores, 109.99, 99);
        System.out.println(databases.toString());  // toString()
    }
}
