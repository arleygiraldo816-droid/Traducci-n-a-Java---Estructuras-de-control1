/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese una calificacion");
    double nota = teclado.nextDouble();
    if (nota >= 9 && nota <=10) {
    System.out.println("Excelente");
    } else if (nota >= 8 && nota <9){
    System.out.println("Muy bueno"); 
    } else if (nota >= 7 && nota <8){
    System.out.println("Medio");
    } else if (nota >= 5 && nota <7){
    System.out.println("Regular");
    } else if (nota >= 0 && nota <5){
    System.out.println("Malo");
    } else {
    System.out.println("Calificacion no valida");
    }
   }
}
