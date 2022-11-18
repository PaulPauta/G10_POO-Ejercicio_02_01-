/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;


/**
 *
 * @author Juan Diego Roman
 */
public class AsignaturaServicelmpl {
    
    private List<Asignatura> asignaturaList;

    public AsignaturaServicelmpl() {
        this.asignaturaList= new ArrayList<>();
    }

    
    public void crear(Asignatura asignatura) {
        this.asignaturaList.add(asignatura);
    }

    
    public void modificar(int codigo, Asignatura asignaturaModificado) {
        var indice=0;
        
        this.asignaturaList.set(indice, asignaturaModificado);
    
    }

    
    public void eliminar(int codigo) {
        var indice=0;
        for(var asignatura:this.asignaturaList){
            if(asignatura.getCodigo()==codigo){
                this.asignaturaList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }
    
}
