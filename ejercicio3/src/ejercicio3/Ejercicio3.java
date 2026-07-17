/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la edad");
    int edad = teclado.nextInt();
     if (edad  >= 18){
    System.out.println("Es mayor de edad");
    } else {
    System.out.println("Es menor de edad");
    }
  }
}
