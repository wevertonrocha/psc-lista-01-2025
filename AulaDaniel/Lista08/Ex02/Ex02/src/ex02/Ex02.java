/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;

/**
 *
 * @author wevertonrocha
 */
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int numero = scanner.nextInt();

        verificaInteiroPositivo(numero);

        imprimiPadrao(numero);

        scanner.close();


    }

    public static void verificaInteiroPositivo(int numero) {
        if (numero >= 0) {
            System.out.println("O numero " + numero + " e positivo");
        } else {
            System.out.println("O numero " + numero + " e negativo");
        }
    }
    public static void imprimiPadrao(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}