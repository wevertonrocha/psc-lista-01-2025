
import java.util.Scanner;

public class Ex04 {
   public static void main(String[] args) {
      double Boleto1, Boleto2, Boleto3,Boleto4, Total, DescontoSalario = 0.14, salario, SalarioLiquido;
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o valor do primeiro boleto: ");
        Boleto1 = sc.nextDouble();
        System.out.println("Digite o valor do segundo boleto: ");
        Boleto2 = sc.nextDouble();
        System.out.println("Digite o valor do terceiro boleto: ");
        Boleto3 = sc.nextDouble();
        System.out.println("Digite o valor do quarto boleto: ");
        Boleto4 = sc.nextDouble();
        System.out.println("Digite o valor do seu salário: ");
        salario = sc.nextDouble();
        Total = Boleto1 + Boleto2 + Boleto3 + Boleto4;
        SalarioLiquido = salario - (salario);
        System.out.println("O total de contas: " + Total);
        System.out.println("O salário liquido: " + SalarioLiquido);  
        System.out.println("O restante do salário gente fina : " + (SalarioLiquido - Total));
        sc.close();
   } 
}