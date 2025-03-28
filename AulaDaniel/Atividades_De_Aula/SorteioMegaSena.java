public class SorteioMegaSena {
    public static void main(String[] args) {
        int numeroAleatorio = 1;
        for (int i = 0; i < 6; i++) {
            numeroAleatorio = (int) (Math.random() * 60);
            System.out.println("Número sorteado: " + numeroAleatorio);
        }
}
}