/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("ingrese la nota");
    int nota = teclado.nextInt();
    if (nota >= 7 ){
    System.out.print("Aprobado");
    } else {
    System.out.println("Reprobado");
    }
    
    }
    
}
