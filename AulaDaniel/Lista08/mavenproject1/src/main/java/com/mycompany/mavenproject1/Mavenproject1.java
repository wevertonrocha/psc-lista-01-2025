/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author wevertonrocha
 */

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro e positivo: ");

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
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
    
