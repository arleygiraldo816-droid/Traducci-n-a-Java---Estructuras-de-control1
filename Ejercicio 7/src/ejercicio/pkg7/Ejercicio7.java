/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    int cantidad = 0;
    int suma = 0;        
    System.out.println("Ingrese un numero positivo");
    int num = teclado.nextInt();
    while (num >= 0){
    cantidad++; 
    suma = suma + num;
    
    System.out.println("Ingrese otro numero");
    num = teclado.nextInt();
    }
    System.out.println("Cantidad de numeros ingresados" + cantidad);
    System.out.println("total: " + suma);  
    
   } 
}
