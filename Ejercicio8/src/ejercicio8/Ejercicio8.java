/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese una contraseña");
    String clave = teclado.nextLine();
    while (!clave.equals("java2026")){
     System.out.println("Contraseña incorrecta: ");
     clave = teclado.nextLine();
    }
    System.out.println("Contraseña correcta, puede ingresar");
   
    }
    
}
