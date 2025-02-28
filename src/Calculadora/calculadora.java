/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class calculadora {   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA PARA SUMA Y RESTA");
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese operacion (+ o -): ");
        char operador = scanner.next().charAt(0);
        
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();  
        
    double resultado;
    switch (operador) {
            case '+':
                suma sum = new suma();
                resultado = sum.getSuma(num1, num2);
                break;
            case '-':
                resta rest = new resta();
                resultado = rest.getResta(num1, num2);
                break;
            default:
                System.out.println("Operador no válido.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
       
}   
}
