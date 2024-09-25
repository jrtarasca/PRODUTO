    
class iphone {

    private String nome;
    private String marca;
    private double custo;
    private double venda;

    // Construtor da classe Iphone
    public iphone(String nome, String marca, double custo, double venda) {
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
    }
    //Método para calcular o lucro
    public double lucro() {

        return this.venda - this.custo;

    }

    // Método status para exibir as informações do iPhone
    public void status() {
        System.out.println("Celular: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Custo: " + this.custo);
        System.out.println("Venda: " + this.venda);
        System.out.println("O lucro é de:" + lucro());
    }
}

public class Produto {
    public static void main(String[] args) {
        // Instancia um objeto Iphone e chama o método status
        iphone c1 = new iphone("Iphone 13", "Apple", 1500.00, 3500.00);
        c1.status();
    }
}
