/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Grupo;
import servicio.GrupoServicelmpl;

/**
 *
 * @author Juan Diego Roman
 */
public class Grupocontrol {
    
    private GrupoServicelmpl GrupoServicelmpl;
    

    public Grupocontrol() {
        this.GrupoServicelmpl = new GrupoServicelmpl();
    }
    
    
    public String crear(String [] dato){
        var retorno="No se pudo crear el grupo";
        var numero=Integer.valueOf(dato[0]).intValue();
        var nombre=dato[1];
        var horas=Integer.valueOf(dato[2]).intValue();
        
        //var costoHora=Integer.valueOf(data[4]).intValue();
        
        
        if(horas<0){
            retorno+=" horas incorrectas";
        }else{
            var grupo = new Grupo(nombre,numero,horas);
            this.GrupoServicelmpl.crear(grupo);
            retorno= "grupo "+grupo.getNombre()+" creado correctamente"
                    +grupo.toString();
        }
        return retorno;
    
    }
    
    
    
}
