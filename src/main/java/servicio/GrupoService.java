/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Grupo;

/**
 *
 * @author Juan Diego Roman
 */
public interface GrupoService {
    
    public abstract void crear(Grupo grupo);

    public abstract void modificar(int numero, Grupo GrupoModificado);

    public abstract void eliminar(int numero);

    public abstract List<Grupo> listar();
    
}
