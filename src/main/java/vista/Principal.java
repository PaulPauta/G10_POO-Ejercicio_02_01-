/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package vista;

import controlador.Articulocontrol;
import controlador.Asignaturacontrol;
import controlador.Calificacioncontrol;
import controlador.Grupocontrol;
import controlador.Profesorcontrol;
import controlador.Revistacontrol;

/**
 *
 * @author Juan Diego Roman
 */
public class Principal {

    public static void main(String[] args) {

        var profesorcontrol = new Profesorcontrol();
        var data = new String[5];
        data[0] = "345";
        data[1] = "Jysus Cordero";
        data[2] = "2";
        data[3] = "4";
        data[4] = "25";

        var grupocontrol = new Grupocontrol();
        var dato = new String[3];
        dato[0] = "4";
        dato[1] = "Dios";
        dato[2] = "2";

        System.out.println(profesorcontrol.crear(data));
        System.out.println(grupocontrol.crear(dato));
        
        var calificacioncontrol = new Calificacioncontrol();
        var deto = new String[5];
        deto[0] = "70";
        deto[1] = "25";
        deto[2] = "10";
        deto[3] = "15";
        deto[4] = "39";
        

        var asignaturacontrol = new Asignaturacontrol();
        var dto = new String[5];
        dto[0] = "0579";
        dto[1] = "3";
        dto[2] = "160";
        dto[3] = "Circuitos Electricos";
        dto[4] = "Alex Flores";

        System.out.println(calificacioncontrol.crear(deto));
        System.out.println(asignaturacontrol.crear(dto));
        
        var revistacontrol = new Revistacontrol();
        var dt = new String[5];
        dt[0] = "705";
        dt[1] = "Lorenzo Maldini";
        dt[2] = "Marca";
        dt[3] = "Aregentina";
        dt[4] = "500";
        

        var articulocontrol = new Articulocontrol();
        var dat = new String[4];
        dat[0] = "Juan Riquelme";
        dat[1] = "40";
        dat[2] = "4";
        dat[3] = "Como Vivir en sociedad";
        
        System.out.println(revistacontrol.crear(dat));
        System.out.println(articulocontrol.crear(dat));
        
        
    }
}
