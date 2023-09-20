/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areatriangulo;
       
import java.util.Scanner;

/**
 *
 * @author moram
 */
public class AreaTriangulo {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame la base en decimal");
        double base = scanner.nextDouble();
        
        System.out.println("Dame la altura en decimal");
        double altura = scanner.nextDouble();
        
        double area = base*altura/2;
        
        System.out.println("El area del tringulo es: " + area);
        
        scanner.close();
         
    }
}
