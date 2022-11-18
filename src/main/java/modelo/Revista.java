/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Revista {
    
    private String pais;
    private String nombre;
    private int codigo;
    private int precio; 
    private String editorial;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Revista(String pais, String nombre, int codigo, int precio, String editorial) {
        this.pais = pais;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Revista{" + "pais=" + pais + ", nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", editorial=" + editorial + '}';
    }
    
    
    
}
