/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese su carrera");
        String carrera = teclado.nextLine();
        System.out.println("Ingrese su estatura");
        double estatura = teclado.nextDouble();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura); 
    }
    
}
