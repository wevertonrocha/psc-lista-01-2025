public class Ex03 {
    public static void main(String[] args) {
        double precoGasolina, litros, total;
        System.out.println("Digite o preço da gasolina: ");
        precoGasolina = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a quantidade de litros: ");
        litros = Double.parseDouble(System.console().readLine());
        
        total = precoGasolina * litros;
        System.out.println("O total a ser pago é: " + total);
    }
}
