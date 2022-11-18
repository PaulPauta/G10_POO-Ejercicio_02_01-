/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Grupo {
    
    private String nombre;
    private int numero;
    private int horas;
    private Profesor profesor; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    

    public Grupo(String nombre, int numero, int horas) {
        this.nombre = nombre;
        this.numero = numero;
        this.horas = horas;
        
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", numero=" + numero + ", horas=" + horas + ", profesor=" + profesor + '}';
    }
    
    
    
    
    
}
