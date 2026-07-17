/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    int suma = 0;
    for (int i = 1; i <=10; i++){
     System.out.println("Ingrese un numero" + i + ":");
     int numero = teclado.nextInt();
     suma = suma + numero;
    }
    double promedio = (double) suma/10;
     System.out.println("Suma: " + suma);
     System.out.println("Promedio: " + promedio);
     teclado.close();
  }  
}
