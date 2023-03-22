/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sv.ujmd.escritorio.clases;

/**
 *
 * @author alexander.siguenzac
 */
public class PersonaClases {

    private String nombre;
    private String apellido;
    private int edad;
    private String resultado;

    public PersonaClases() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mayorEdad(int edad) {
        if (edad > 17) {
            resultado = "ES mayor de edad : " + edad;
        } else {
            resultado = "NO es mayor de edad : " + edad;
        }
        return resultado;
    }

}
