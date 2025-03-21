import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int anos, segundosAno = 31536000; 
        long segundosAnos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de anos: ");
        anos = sc.nextInt();
        segundosAnos = anos * segundosAno;
        System.out.println("A quantidade de segundos em " + anos + " anos é: " + segundosAnos);
        sc.close();
    }

}
