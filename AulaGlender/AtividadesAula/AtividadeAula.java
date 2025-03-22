public class AtividadeAula {
    public static void main(String[] args) {
        if ((2<3) && 15/3 == 5) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        if ((false)|| 20/4 != 3) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        if (!(2*3 >2|| 3>1)) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        if (!(2*3 >2|| 3>1) && 2*3 > 2) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}
