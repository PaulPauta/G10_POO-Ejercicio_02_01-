/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Profesor {
    
    private int horas;
    private String nombre;
    private int codigo;
    private int diasImpartidos;
    private int costoHora;

    public Profesor(int horas, String nombre, int codigo, int diasImpartidos, int costoHora) {
        this.horas = horas;
        this.nombre = nombre;
        this.codigo = codigo;
        this.diasImpartidos = diasImpartidos;
        this.costoHora = costoHora;
    }
    
    

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDiasImpartidos() {
        return diasImpartidos;
    }

    public void setDiasImpartidos(int diasImpartidos) {
        this.diasImpartidos = diasImpartidos;
    }

    public int getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(int costoHora) {
        this.costoHora = costoHora;
    }

    
    public String toString() {
        return "Profesor{" + "horas=" + horas + ", nombre=" + nombre 
                + ", codigo=" + codigo + ", diasImpartidos=" + diasImpartidos 
                + ", costoHora=" + costoHora + '}';
    }
    
    
    
}
