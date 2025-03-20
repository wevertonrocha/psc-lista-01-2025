import java.util.Scanner;   
public class Ex01 {
    
    public static void main(String[] args) {
        double notaUm, notaDois, notaTres, notaQuatro, media;
        boolean aprovado;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Digite a nota do primeiro bimestre: ");
        notaUm = sc.nextDouble(); 
        System.out.println("Digite a nota do segundo bimestre: ");
        notaDois = sc.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre: ");
        notaTres = sc.nextDouble();
        System.out.println("Digite a nota do quarto bimestre: ");
        notaQuatro = sc.nextDouble();
        media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        System.out.println("A média das notas é: " + media);
        aprovado = media >= 7;
        System.out.println("O aluno foi aprovado? " + aprovado);




        sc.close();
    }
}