import java.util.Scanner;   
public class Ex00 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

         
        System.out.println("Digite um número: ");
        double numeroUm = sc.nextDouble(); 
        System.out.println("O numero digitado foi: " + numeroUm);
        sc.close();
    }
}