
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int celsius;
        double fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius = sc.nextInt();
        fahrenheit = (celsius * 1.8) + 32;  
        System.out.printf("A temperatura em graus Fahrenheit é: %.2f\n", fahrenheit);
    }
}
