import java.util.Scanner;

public class Desafio_Sonic3{

    public static void main(String[] args){
        int NovosAliados = 0, esperanca = 0, medo = 0, determinação = 0, incerteza = 0;
        int Desafio1 = 0, Desafio2 = 0, Desafio3 = 0 , media = 0;
        int confianca = 0, desanimo = 0, EstrategiasAnalisadas = 0, EmocoesPositivas = 0, EmocoesNegativas = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos aliados Sonic, Knucklese tails conseguiram encontrar: ");
        NovosAliados = scanner.nextInt();
        if (NovosAliados > 0){
            esperanca = NovosAliados * 15;
        } else{
            medo = 40;
        }
        System.out.println(esperanca + " pontos de esperanca e " + medo + " pontos de medo.");

        System.out.println("Qual foi o nivel do primeiro desafio em uma escala de 0 a 10: (sendo 10 vitoria e 0 derrota)");
        Desafio1 = scanner.nextInt();
        System.out.println("Qual foi o nivel do segundo desafio em uma escala de 0 a 10: (sendo 10 vitoria e 0 derrota)");
        Desafio2 = scanner.nextInt();
        System.out.println("Qual foi o nivel do terceiro desafio em uma escala de 0 a 10: (sendo 10 vitoria e 0 derrota)");
        Desafio3 = scanner.nextInt();
        media = (Desafio1 + Desafio2 + Desafio3) / 3;
        if (media >= 7){
            confianca = 60;
        }
        else{
            desanimo = 60;
        }

        System.err.println("Quantas das 12 estrategias foram analisadas: ");
        EstrategiasAnalisadas = scanner.nextInt();
        determinação = EstrategiasAnalisadas * 10;
        incerteza = (12 - EstrategiasAnalisadas) * 10;

        System.out.println("" + determinação + " pontos de determinação e " + incerteza + " pontos de incerteza.");

        EmocoesPositivas = esperanca + confianca + determinação;
        EmocoesNegativas = medo + desanimo + incerteza;
        System.out.println("A soma das emoções positivas é: " + EmocoesPositivas + " e a soma das emoções negativas é: " + EmocoesNegativas + ".");
        if (EmocoesPositivas > EmocoesNegativas){
            System.out.println("Sonic, Knuckles e Tails venceram o Sadow!");
        } else{
            System.out.println("Sonic, Knuckles e Tails foram derrotados pelo Sadow!");
        }






    }



}