/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Calificacion {
    
    private double notasPruebas;
    private double notasDeberes;
    private double notasGrupales;
    private int notaMinima;
    private int nroLista;

    public Calificacion(double notasPruebas, double notasDeberes, double notasGrupales, int notaMinima, int nroLista) {
        this.notasPruebas = notasPruebas;
        this.notasDeberes = notasDeberes;
        this.notasGrupales = notasGrupales;
        this.notaMinima = notaMinima;
        this.nroLista=nroLista;
    }

    public double getNotasPruebas() {
        return notasPruebas;
    }

    public void setNotasPruebas(double notasPruebas) {
        this.notasPruebas = notasPruebas;
    }

    public double getNotasDeberes() {
        return notasDeberes;
    }

    public void setNotasDeberes(double notasDeberes) {
        this.notasDeberes = notasDeberes;
    }

    public double getNotasGrupales() {
        return notasGrupales;
    }

    public void setNotasGrupales(double notasGrupales) {
        this.notasGrupales = notasGrupales;
    }

    public int getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(int notaMinima) {
        this.notaMinima = notaMinima;
    }

    public int getNroLista() {
        return nroLista;
    }

    public void setNroLista(int nroLista) {
        this.nroLista = nroLista;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "notasPruebas=" + notasPruebas + ", notasDeberes=" + notasDeberes + ", notasGrupales=" + notasGrupales + ", notaMinima=" + notaMinima + ", nroLista=" + nroLista + '}';
    }

   

    
   
    
}
