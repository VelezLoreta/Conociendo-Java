/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.three;

import java.util.Scanner;

/**
 *
 * @author lore_
 */
public class EjercicioThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      String frase;
              System.out.println("Ingresa tu frase");
              frase = leer.next();
      String mayus = frase.toUpperCase();
        System.out.println("La frase en mayusculas es:" + mayus);
      String minus = frase.toLowerCase();
        System.out.println("La frase en minusculas es:" + minus);
              
    }
    
}
