/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese un numero");
    int num = teclado.nextInt();
    for (int i = 1; i<= 12; i++){
     System.out.println(num + " x " + i  + " = " + (num * i));
    }
        teclado.close();
    }
    
}
