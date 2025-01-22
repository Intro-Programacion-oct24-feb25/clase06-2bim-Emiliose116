/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            try {
                System.out.println("Ingrese un País: ");
                String cadena1 = entrada.nextLine();

                char inicial1 = cadena1.toLowerCase().charAt(0);
                String letra = String.valueOf(inicial1);
                if (letra.equals("a") || letra.equals("e") || letra.equals("i")
                        || letra.equals("o") || letra.equals("u")) {
                    throw new Exception("PAISES CON CONSONANTE POR FAVOR");
                }
                System.out.printf("%s\n", cadena1);
                bandera = false;
            } catch (Exception e) {
                System.out.printf("Error:\n%s\n", e);
            }
        }
    }
}
