/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Revista;

/**
 *
 * @author Juan Diego Roman
 */
public class RevistaServicelmpl {
    
    private List<Revista> revistaList;

    public RevistaServicelmpl() {
        this.revistaList= new ArrayList<>();
    }

    
    public void crear(Revista revista) {
        this.revistaList.add(revista);
    }

    
    public void modificar(int codigo, Revista revistaModificado) {
        var indice=0;
        
        this.revistaList.set(indice, revistaModificado);
    
    }

    
    public void eliminar(int codigo) {
        var indice=0;
        for(var revista:this.revistaList){
            if(revista.getCodigo()==codigo){
                this.revistaList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }
    
}
