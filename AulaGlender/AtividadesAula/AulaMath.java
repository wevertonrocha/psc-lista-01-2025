import java.util.Scanner;
public class AulaMath {
   public static void main(String[] args) {
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println(Math.max(numero2, numero2));
        System.out.println(Math.min(numero1, numero2));
        System.out.println(Math.pow(numero1, numero2));
   } 
}
