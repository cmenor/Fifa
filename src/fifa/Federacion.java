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
public class Federacion {

    private String nombre;
    private String pais;
    private String presidente;
    private Division[] divisiones = new Division[3];

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public Division[] getDivisiones() {
        return divisiones;
    }

    public void setDivisiones(Division[] divisiones) {
        this.divisiones = divisiones;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPais(String p) {
        this.pais = p;
    }

    public String getPais() {
        return this.pais;
    }
}
