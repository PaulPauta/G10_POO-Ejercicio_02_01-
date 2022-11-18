/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import modelo.Revista;
import servicio.RevistaServicelmpl;

/**
 *
 * @author Juan Diego Roman
 */
public class Revistacontrol {
    
    private RevistaServicelmpl RevistaServicelmpl;

    public Revistacontrol() {
        this.RevistaServicelmpl = new RevistaServicelmpl();
    }
    
    
    public String crear(String [] dt){
        var retorno="No se pudo crear el profesor";
        var pais=dt[0];
        var nombre=dt[1];
        var codigo=Integer.valueOf(dt[2]).intValue();
        var precio=Integer.valueOf(dt[3]).intValue();
        var editorial=dt[4];
        
        
        
        if(precio<0 ){
            retorno+=" el precio esta incorrecto";
        }else{
            var revista = new Revista(pais,nombre,codigo,precio,editorial);
            this.RevistaServicelmpl.crear(revista);
            retorno= "revista "+revista.getNombre()+" creado correctamente"
                    +revista.toString();
        }
        return retorno;
    
    }
    
}
