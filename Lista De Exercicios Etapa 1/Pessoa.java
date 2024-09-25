
    class Dados {

    private String nome;
    private String sobrenome;
    private double altura;
    private String data; 

    public Dados(String nome, String sobrenome, double altura, String data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.data = data;
    }
    // Método para gerar email
    private String gerarEmail() {
    return (this.nome + "." + this.sobrenome + "@mail.com");
}
    // Método status para printar as informações da pessoa
    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Data: " + this.data);
        System.out.println("Os dados da pessoa e email são:" + this.gerarEmail());
    }
}

public class Pessoa {
    public static void main(String[] args) {
        // Instancia um objeto Dados e chama o método status
        Dados c1 = new Dados("Pedro", "Cruz",1.90,"16/04/2006" ); 
        c1.status();
    }
}
