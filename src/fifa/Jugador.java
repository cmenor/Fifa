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
public class Jugador {

    private String nombre;
    private String edad;
    private String posicion;
    private int goles;

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(String e) {
        this.edad = e;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setPosion(String p) {
        this.posicion = p;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setGoles(String g) {
        this.edad = g;
    }

    public int getGoles() {
        return this.goles;
    }

}
