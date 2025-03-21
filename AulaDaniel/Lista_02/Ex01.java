import java.util.Scanner;   
public class Ex01 {
    
    public static void main(String[] args) {
        double numeroUm, numeroDois, soma, subtracao, multiplicacao, divisao;

        Scanner sc =new Scanner(System.in);
        
        System.out.println("Digite dois números: ");
        numeroUm = sc.nextDouble();
        numeroDois = sc.nextDouble();
        System.out.println("Os números digitados foram: " + numeroUm + " e " + numeroDois);
         System.out.println("A soma dos números é: " + (numeroUm + numeroDois));
         System.out.println("A subtração dos números é: " + (numeroUm - numeroDois));
            System.out.println("A multiplicação dos números é: " + (numeroUm * numeroDois));
            System.out.println("A divisão dos números é: " + (numeroUm / numeroDois));
        




        sc.close();
    }
}