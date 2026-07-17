/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.pkg2;

/**
 *
* @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio62 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);   
    System.out.println("Ingrese un numero del 1 al 7");
    int num = teclado.nextInt();
    switch (num){
        case 1:
          System.out.println("Es lunes");
          break;
        case 2:       
          System.out.println("Es Martes");
          break;
        case 3:       
          System.out.println("Es Miercoles");
          break;
        case 4:       
          System.out.println("Es Jueves");
          break;
        case 5:       
          System.out.println("Es Viernes");
          break;  
        case 6:       
          System.out.println("Es Sabado");
          break;  
        case 7:       
          System.out.println("Es Domingo");
          break;  
        default:
          System.out.println("Numero no valido");
    }
    }
}
