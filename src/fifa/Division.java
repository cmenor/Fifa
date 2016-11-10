/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

/**
 *
 * @author usuario
 */
public class Division {

    private String nombre;
    private String patrocinador;
    private Equipo[] equipos = new Equipo[20];

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPatrocinador(String p) {
        this.patrocinador = p;
    }

    public String getPatrocinador() {
        return this.patrocinador;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }
}
