/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Articulo {
    
    private String titulo;
    private String autor;
    private int nroPagina;
    //private Revista revista;
    private int seccion;

    public Articulo(String titulo, String autor, int nroPagina, int seccion) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPagina = nroPagina;
        //this.revista = revista;
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPagina() {
        return nroPagina;
    }

    public void setNroPagina(int nroPagina) {
        this.nroPagina = nroPagina;
    }

    //public Revista getRevista() {
       // return revista;
   // }

    //public void setRevista(Revista revista) {
     //   this.revista = revista;
    //}

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", autor=" + autor + ", nroPagina=" + nroPagina + ", revista=" + /*revista +*/ ", seccion=" + seccion + '}';
    }
    
    
    
}
