/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sv.ujmd.escritorio.clases;

import java.util.Scanner;

/**
 *
 * @author alexander.siguenzac
 */
public class NumeroMayorMenor {

    int num1;
    int num2;
    int num3;
   
    public String mayormenor(int num1, int num2, int num3) {
        int mayor = num1;
        int menor = num1;
        String resultado;
             
        if (num1 != num2 && num2 != num3 ) {
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }
            if (num2 < menor) {
                menor = num2;
            }
            if (num3 < menor) {
                menor = num3;
            }
            resultado = "El mayor número es " + mayor + " y el menor número es " + menor;
        } else {
            resultado = "Por favor ingresar solo numeros diferentes";
        }
        return resultado;
    }

    public void TresNumeros() {
        int mayor;
        int medio;
        int menor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int variable_1 = scanner.nextInt();

        System.out.println("Ingrese otro número");
        int variable_2 = scanner.nextInt();

        System.out.println("Ingrese otro número");
        int variable_3 = scanner.nextInt();

        if (variable_1 > variable_2 && variable_1 > variable_3) {
            mayor = variable_1;
            if (variable_2 > variable_3) {

                medio = variable_2;
                menor = variable_3;
            } else {

                medio = variable_2;
                menor = variable_3;
            }
            System.out.println("El número mayor es: " + mayor + " El número medio es: " + medio + " El número menor es:" + menor);
        }

        if (variable_2 > variable_1 && variable_2 > variable_3) {
            mayor = variable_2;
            if (variable_1 > variable_3) {

                medio = variable_1;
                menor = variable_3;
            } else {

                medio = variable_3;
                menor = variable_1;
            }
            System.out.println("El número mayor es: " + mayor + " El número medio es: " + medio + " El número menor es:" + menor);

        }

        if (variable_3 > variable_1 && variable_3 > variable_2) {
            mayor = variable_3;
            if (variable_2 > variable_1) {

                medio = variable_2;
                menor = variable_1;
            } else {

                medio = variable_1;
                menor = variable_2;
            }

            System.out.println("El número mayor es: » + mayor +» El número medio es: » + medio+ » El número menor es:" + menor);

        }
    }
}
