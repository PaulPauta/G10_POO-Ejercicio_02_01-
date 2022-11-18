/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Articulo;


/**
 *
 * @author Juan Diego Roman
 */
public interface ArticuloService {
    
    public abstract void crear(Articulo articulo);

    public abstract void modificar(int seccion, Articulo ArticuloModificado);

    public abstract void eliminar(int seccion);

    public abstract List<Articulo> listar();
    
}
