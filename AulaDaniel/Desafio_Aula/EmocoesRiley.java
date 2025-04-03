
import java.util.Scanner;

public class EmocoesRiley {
    public static void main(String[] args) {
        // Emoções Riley
        int alegria = 0, tristeza = 0, amizades = 0, exerciciosFeitos = 0;
        String nome = "Riley";
        double NotaA1 = 0, NotaA2 = 0, NotaA3 = 0, Media = 0;

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Olá, " + nome + "! Vamos falar sobre suas emoções.");
        System.out.println("Quantos amigos você fez na cidade nova?");
        amizades = scanner.nextInt();
        alegria = amizades * 10; 
        if (amizades == 0) {
            tristeza = 30; 
        } else {
            tristeza = 0; 
        }



        System.out.println("Qual foi sua nota na prova A1? (0 a 10)");
        NotaA1 = scanner.nextDouble();
        System.out.println("Qual foi sua nota na prova A2? (0 a 10)");
        NotaA2 = scanner.nextDouble();
        System.out.println("Qual foi sua nota na prova A3? (0 a 10)");
        NotaA3 = scanner.nextDouble();
        Media = (NotaA1 + NotaA2 + NotaA3) / 3; 
        if (Media >= 7) {
            alegria += 50; 
        } else {
            tristeza += 50; 
        }

        System.out.println("Quantos dos 10 exercícios de programação você fez? ");
        exerciciosFeitos = scanner.nextInt();
        alegria += exerciciosFeitos * 10;

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma boa experiencia para você!!! XD");
        } else if (tristeza > alegria) {
            System.out.println("A mudança para a nova cidade não foi uma boa experiencia para você! :( ");
        } else {
            System.out.println("Você está neutro! "+ nome + "!");
        }
        
        System.out.println("Alegria: " + alegria);
        System.out.println("Tristeza: " + tristeza);
    }
}