import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        double valorBoleto01, valorBoleto02, valorBoleto03, valorBoleto04, valorTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro boleto: ");
        valorBoleto01 = sc.nextDouble();
        System.out.println("Digite o valor do segundo boleto: ");
        valorBoleto02 = sc.nextDouble();
        System.out.println("Digite o valor do terceiro boleto: ");
        valorBoleto03 = sc.nextDouble();
        System.out.println("Digite o valor do quarto boleto: ");
        valorBoleto04 = sc.nextDouble();
        valorTotal = valorBoleto01 + valorBoleto02 + valorBoleto03 + valorBoleto04;
        System.out.println("O valor total dos boletos é: " + String.format("%.2f", valorTotal));
    }
}
