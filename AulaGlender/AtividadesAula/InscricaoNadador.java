
import java.util.Scanner;

public class InscricaoNadador {
    public static void main(String[] args) {
        int idade, categoria = 0 ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade do nadador: ");
        idade = entrada.nextInt();
        if (idade >= 5 && idade <= 7) {
            categoria = 1;
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            categoria = 2;
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            categoria = 3;
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            categoria = 4;
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            categoria = 5;
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Idade inválida para inscrição.");
        }

    }
}
