import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
    int numero1, numero2, numero3;
    int maior, menor, media;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    numero1 = scanner.nextInt();
    System.out.println("Digite o segundo número: ");
    numero2 = scanner.nextInt();
    System.out.println("Digite o terceiro número: ");
    numero3 = scanner.nextInt();
    
    if (numero1 > numero2 && numero1 > numero3) {
        maior = numero1;
    } else if (numero2 > numero1 && numero2 > numero3) {
        maior = numero2;
    } else {
        maior = numero3;
    }
    
    if (numero1 < numero2 && numero1 < numero3) {
        menor = numero1;
    } else if (numero2 < numero1 && numero2 < numero3) {
        menor = numero2;
    } else {
        menor = numero3;
    }
    
    media = (numero1 + numero2 + numero3) / 3;
    
    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
    System.out.println("A média é: " + media);
}
}