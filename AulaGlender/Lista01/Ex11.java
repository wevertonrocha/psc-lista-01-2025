public class Ex11 {
    public static void main(String[] args) {
        double precoProduto, desconto = 0.15, valorFinal;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        precoProduto = sc.nextDouble();
        valorFinal = precoProduto - (precoProduto * desconto);
        System.out.println("O valor final do produto com desconto é: " + valorFinal);
     
        }

}
