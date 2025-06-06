/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_03;


/**
 *
 * @author wevertonrocha
 */
public class Ex_03 {
    
public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Exemplo de chamada da função
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;

        int resultado = somar(numero1, numero2, numero3);

        System.out.println("A soma dos três números é: " + resultado);
    }
   
    
}
