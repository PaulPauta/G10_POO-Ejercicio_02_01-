/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Profesor;


/**
 *
 * @author Juan Diego Roman
 */
public class ProfesorServicelmpl implements ProfesorService {
    
  private List<Profesor> profesorList;

    public ProfesorServicelmpl() {
        this.profesorList= new ArrayList<>();
    }

    
    public void crear(Profesor profesor) {
        this.profesorList.add(profesor);
    }

    
    public void modificar(int codigo, Profesor profesorModificado) {
        var indice=0;
        
        this.profesorList.set(indice, profesorModificado);
    
    }

    
    public void eliminar(int codigo) {
        var indice=0;
        for(var profesor:this.profesorList){
            if(profesor.getCodigo()==codigo){
                this.profesorList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Profesor> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
