/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import modelo.Asignatura;
import servicio.AsignaturaServicelmpl;


/**
 *
 * @author Juan Diego Roman
 */
public class Asignaturacontrol { 
    
    private AsignaturaServicelmpl AsignaturaServicelmpl;
    

    public Asignaturacontrol() {
        this.AsignaturaServicelmpl = new AsignaturaServicelmpl();
    }
    
    
    public String crear(String [] dto){
        var retorno="No se pudo crear el grupo";
        var diasImpartidos=Integer.valueOf(dto[0]).intValue();
        var nombre=dto[1];
        var codigo=Integer.valueOf(dto[2]).intValue();
        var profesor=dto[3];
        var horas=Integer.valueOf(dto[4]).intValue();
        
        //var costoHora=Integer.valueOf(data[4]).intValue();
        
        
        if(horas<0 || diasImpartidos<0){
            retorno+=" horas o dias impartidos incorrectos";
        }else{
            var asignatura = new Asignatura(diasImpartidos,nombre,codigo,profesor,horas);
            this.AsignaturaServicelmpl.crear(asignatura);
            retorno= "asignatura "+asignatura.getNombre()+" creado correctamente"
                    +asignatura.toString();
        }
        return retorno;
    
    }
    
}
