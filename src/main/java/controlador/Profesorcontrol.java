/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Profesor;
import servicio.ProfesorServicelmpl;

/**
 *
 * @author Juan Diego Roman
 */
public class Profesorcontrol {
    
    private ProfesorServicelmpl ProfesorServicelmpl;

    public Profesorcontrol() {
        this.ProfesorServicelmpl = new ProfesorServicelmpl();
    }
    
    
    public String crear(String [] data){
        var retorno="No se pudo crear el profesor";
        var codigo=Integer.valueOf(data[0]).intValue();
        var nombre=data[1];
        var horas=Integer.valueOf(data[2]).intValue();
        var diasImpartidos=Integer.valueOf(data[3]).intValue();
        var costoHora=Integer.valueOf(data[4]).intValue();
        
        
        if(horas<0 || diasImpartidos<0 || costoHora<0){
            retorno+=" diasImpartidos, horas o el costoHora estan incorrectos";
        }else{
            var profesor = new Profesor(horas,nombre,codigo,diasImpartidos,costoHora);
            this.ProfesorServicelmpl.crear(profesor);
            retorno= "profesor "+profesor.getNombre()+" creado correctamente"
                    +profesor.toString();
        }
        return retorno;
    
    }
    
    
}
