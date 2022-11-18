/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Asignatura {
    
    private int diasImpartidos;
    private String nombre;
    private int codigo;
    private String profesor;
    private int horas;

    public Asignatura(int diasImpartidos, String nombre, int codigo, String profesor, int horas) {
        this.diasImpartidos = diasImpartidos;
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesor = profesor;
        this.horas = horas;
    }

    public int getDiasImpartidos() {
        return diasImpartidos;
    }

    public void setDiasImpartidos(int diasImpartidos) {
        this.diasImpartidos = diasImpartidos;
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

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "diasImpartidos=" + diasImpartidos + ", nombre=" + nombre + ", codigo=" + codigo + ", profesor=" + profesor + ", horas=" + horas + '}';
    }
    
    
    
    
    
}
