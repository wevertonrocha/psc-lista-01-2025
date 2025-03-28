public class Ex10 {
    public static void main(String[] args) {
        double AreaTotal, comodo1, comodo2, comodo3, largura, comprimento;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite a largura do primeiro comodo: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do primeiro comodo: ");
        comprimento = sc.nextDouble();
        comodo1 = largura * comprimento;
        System.out.println("Digite a largura do segundo comodo: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do segundo comodo: ");
        comprimento = sc.nextDouble();
        comodo2 = largura * comprimento;    

        System.out.println("Digite a largura do terceiro comodo: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terceiro comodo: ");
        comprimento = sc.nextDouble();
        comodo3 = largura * comprimento;
        System.out.println("A área do primeiro comodo é: " + comodo1);
        System.out.println("A área do segundo comodo é: " + comodo2);
        System.out.println("A área do terceiro comodo é: " + (comodo3));
        System.out.println("A área total dos comodos é: " + (comodo1 + comodo2 + comodo3));
        
    }
}
