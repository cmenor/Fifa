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
public class Equipo {

    private String nombre;
    private String ciudad;
    private String entrenador;
    private Jugador[] jugadores = new Jugador[22];

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCiudad(String c) {
        this.ciudad = c;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setEntrenador(String e) {
        this.entrenador = e;
    }

    public String getEntrenador() {
        return this.entrenador;
    }
}
