public class Ex08 {
    public static void main(String[] args) {
        double produto1, produto2, produto3, total, valorPago, troco;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite o valor do primeiro produto: "); 
        produto1 = sc.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        produto2 = sc.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
        produto3 = sc.nextDouble();
        total = produto1 + produto2 + produto3;
        System.out.printf("O total da compra é: %.2f\n", total);
        System.out.println("Digite o valor pago: ");
        valorPago = sc.nextDouble();
        troco = valorPago - total;
        System.out.printf("O troco é: %.2f\n", troco);
    }
}
