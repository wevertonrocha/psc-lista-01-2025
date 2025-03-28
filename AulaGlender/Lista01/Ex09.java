public class Ex09 {
    public static void main(String[] args) {
        double real, euro, cotacao;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite o valor em reais: ");
        real = sc.nextDouble();
        System.out.println("Digite a cotação do euro: ");
        cotacao = sc.nextDouble();
        euro = real / cotacao;
        System.out.printf("O valor em euros é: %.2f\n", euro);
    }
}
