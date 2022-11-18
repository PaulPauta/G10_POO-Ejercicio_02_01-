/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Grupo;


/**
 *
 * @author Juan Diego Roman
 */
public class GrupoServicelmpl {
    
    private List<Grupo> grupoList;

    public GrupoServicelmpl() {
        this.grupoList= new ArrayList<>();
    }

    
    public void crear(Grupo grupo) {
        this.grupoList.add(grupo);
    }

    
    public void modificar(int numero, Grupo grupoModificado) {
        var indice=0;
        
        this.grupoList.set(indice, grupoModificado);
    
    }

    
    public void eliminar(int numero) {
        var indice=0;
        for(var grupo:this.grupoList){
            if(grupo.getNumero()==numero){
                this.grupoList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    /*public List<Grupo> listar() {
        retorn=0;
        return retorn;
        
    }*/

    
    
}
