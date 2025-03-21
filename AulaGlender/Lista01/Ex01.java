import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        double Nota1, Nota2, Nota3, Media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        Nota3 = sc.nextDouble();
        Media = (Nota1 + Nota2 + Nota3) / 3;
        System.out.printf("A média é: %.2f", Media);
        
    }
}