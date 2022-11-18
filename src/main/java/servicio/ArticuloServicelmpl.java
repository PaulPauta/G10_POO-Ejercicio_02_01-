/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Articulo;

/**
 *
 * @author Juan Diego Roman
 */
public class ArticuloServicelmpl {

    private List<Articulo> articuloList;

    public ArticuloServicelmpl() {
        this.articuloList = new ArrayList<>();
    }

    public void crear(Articulo articulo) {
        this.articuloList.add(articulo);
    }

    public void modificar(int seccion, Articulo articuloModificado) {
        var indice = 0;

        this.articuloList.set(indice, articuloModificado);

    }

    public void eliminar(int seccion) {
        var indice = 0;
        for (var articulo : this.articuloList) {
            if (articulo.getSeccion() == seccion) {
                this.articuloList.remove(indice);
                break;
            } else {
                indice++;
            }
        }
    }

}
