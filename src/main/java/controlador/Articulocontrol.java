/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Articulo;
import modelo.Profesor;
import servicio.ArticuloServicelmpl;
import servicio.ProfesorServicelmpl;

/**
 *
 * @author Juan Diego Roman
 */
public class Articulocontrol {
    
    private ArticuloServicelmpl ArticuloServicelmpl;

    public Articulocontrol() {
        this.ArticuloServicelmpl = new ArticuloServicelmpl();
    }
    
    
    public String crear(String [] dat){
        var retorno="No se pudo crear el profesor";
        var titulo=dat[0];
        var autor=dat[1];
        var nroPagina=Integer.valueOf(dat[2]).intValue();
        var seccion=Integer.valueOf(dat[2]).intValue();
        
        
        
        if(nroPagina<0 ){
            retorno+=" nroPagina o seccion incorrecto";
        }else{
            var articulo = new Articulo(titulo,autor,nroPagina,seccion);
            this.ArticuloServicelmpl.crear(articulo);
            retorno= "articulo "+articulo.getTitulo()+" creado correctamente"
                    +articulo.toString();
        }
        return retorno;
    
    }
    
    
}
