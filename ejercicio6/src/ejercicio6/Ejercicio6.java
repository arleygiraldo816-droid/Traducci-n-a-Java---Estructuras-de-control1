/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio6 {
        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int numero = teclado.nextInt();
        int mayor = numero;
        int menor = numero;
        for (int i = 2; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numero = teclado.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        teclado.close();
    }
}
  
 
