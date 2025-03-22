import java.util.Scanner;

public class aulaCondicional{
    public static void main(String[] args){
        int numero1, numero2;
        double adicao, subtracao, multiplicacao, divisao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        System.out.printf("Escolha a operação desejada: \n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
        int operacao = entrada2.nextInt();
        if(operacao == 1){
            adicao = numero1 + numero2;
            System.out.println("O resultado da adição é: " + adicao);
        }else if(operacao == 2){
            subtracao = numero1 - numero2;
            System.out.println("O resultado da subtração é: " + subtracao);
        }else if(operacao == 3){
            multiplicacao = numero1 * numero2;
            System.out.println("O resultado da multiplicação é: " + multiplicacao);
        }else if(operacao == 4){
            divisao = numero1 / numero2;
            System.out.println("O resultado da divisão é: " + divisao);
        }else{
            System.out.println("Operação inválida");
        }
    }
}