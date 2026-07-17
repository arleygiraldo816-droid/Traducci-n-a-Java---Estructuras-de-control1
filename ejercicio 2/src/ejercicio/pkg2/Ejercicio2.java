/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("ingrese un numero");
    int num1 = teclado.nextInt();
    System.out.println("Ingrese otro numero");
    int num2 = teclado.nextInt();
    
    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicacion = num1 * num2;
    int division = num1 / num2;
    int residuo = num1 % num2;
    
    System.out.println("La suma es: " + suma );
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicacion es: " + multiplicacion);
    System.out.println("La division es: " + division);   
    System.out.println("La residuo es: " + residuo);
    }
    
}
