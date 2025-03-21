import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        double valorBoleto01, valorBoleto02, valorBoleto03, valorBoleto04, totalBoletos, salario;
        Scanner sc = new Scanner(System.in);    
        System.out.println("Digite o valor do primeiro boleto: ");
        valorBoleto01 = sc.nextDouble();
        System.out.println("Digite o valor do segundo boleto: ");
        valorBoleto02 = sc.nextDouble();
        System.out.println("Digite o valor do terceiro boleto: ");
        valorBoleto03 = sc.nextDouble();
        System.out.println("Digite o valor do quarto boleto: ");
        valorBoleto04 = sc.nextDouble();
        System.out.println("Digite o valor do seu salário: ");
        salario = sc.nextDouble();
        totalBoletos = valorBoleto01 + valorBoleto02 + valorBoleto03 + valorBoleto04;
        System.out.println("O valor total é: " + totalBoletos);
        if (totalBoletos > salario) {
            System.out.println("Você não tem dinheiro suficiente para pagar os boletos.");
            System.out.println("Faltam R$ " + (totalBoletos - salario));
        } else {
            System.out.println("Você tem dinheiro suficiente para pagar os boletos.");
            System.out.println("Sobrará R$ " + (salario - totalBoletos));
        }
    }
}
