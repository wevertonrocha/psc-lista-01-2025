import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        double alturaMetros, alturaCentimetros, alturaPol, alturaPes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura em metros: ");
        alturaMetros = sc.nextDouble();
        alturaCentimetros = alturaMetros * 100;
        alturaPol = alturaCentimetros / 2.54;
        alturaPes = alturaPol / 12;
        System.out.printf("A altura em metros é: %.2f\n", alturaMetros);
        System.out.printf("A altura em centímetros é: %.2f\n", alturaCentimetros);
        System.out.printf("A altura em polegadas é: %.2f\n", alturaPol);
        System.out.printf("A altura em pés é: %.2f\n", alturaPes);
        sc.close();

    }
}
