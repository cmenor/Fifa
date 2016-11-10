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
public class Fifa {

    /**
     * @param args the command line arguments
     */
    static String presidente = "Blatter";
    static Federacion[] federaciones = new Federacion[2];

    public static void rellenarDatos() {

        Division[] div;
        Equipo[] equipos;
        Jugador[] jugadores;

        for (int f = 0; f < federaciones.length; f++) {
            federaciones[f] = new Federacion();
            federaciones[f].setNombre("FEDERACION " + f);
            federaciones[f].setPais("PAIS " + f);
            div = federaciones[f].getDivisiones();
            for (int d = 0; d < div.length; d++) {
                div[d] = new Division();
                div[d].setNombre("div " + f + d);
                div[d].setPatrocinador("patrocinador " + f + d);

                equipos = div[d].getEquipos();
                for (int e = 0; e < equipos.length; e++) {
                    equipos[e] = new Equipo();
                    equipos[e].setNombre("equipo " + e);
                    equipos[e].setCiudad("ciudad " + e);
                    equipos[e].setEntrenador("entrenador " + e);

                    jugadores = equipos[e].getJugadores();
                    for (int j = 0; j < jugadores.length; j++) {
                        jugadores[j] = new Jugador();
                        jugadores[j].setNombre("Casillas " + j);
                    }
                }
            }
        }
    }

    public static void ejercicio01() {
        //Mostrar Nombre del Presidente

        for (int x = 1; 1 < federaciones.length; x++) {
            presidente = federaciones[x].getPresidente();
            System.out.println("Presidente: " + presidente);
        }
    }

    public static void ejercicio02() {
        //Mostrar Nombre y pais de las federaciones

        String nombre;
        String pais;
        for (int i = 0; i < federaciones.length; i++) {
            nombre = federaciones[i].getNombre();
            pais = federaciones[i].getPais();
            System.out.println(nombre);
            System.out.println(pais);
        }

    }

    public static void ejercicio03() {
        //Nombre y Patrocinador de cada division
    }

    public static void ejercicio04() {
        //Nombre de todos los equipos
    }

    public static void ejercicio05() {
        //Ciudad de todos los equipos
    }

    public static void ejercicio06() {
        //Entrenador y Numero de jugadores
    }

    public static void ejercicio07() {
        //Entrenador y nombre de jugadores
    }

    public static void ejercicio08() {
        //Maximo goleador por federacion

        for (int f = 0; f < federaciones.length; f++) {
            for (int d = 0; d < federaciones[f].getDivisiones().length; d++) {
                for (int e = 0; e < federaciones[f].getDivisiones()[d].getEquipos().length; e++) {
                    for (int j = 0; j < federaciones[f].getDivisiones()[d].getEquipos()[e].getJugadores().length; j++) {

                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Federacion[] f1 = new Federacion[2];
        Division[] d1 = new Division[3];
        Equipo[] e1 = new Equipo[20];
        Jugador[] j1 = new Jugador[22];

        rellenarDatos();

        //ejercicio01();
        ejercicio02();
        //ejercicio03();
        //ejercicio04();
        //ejercicio05();
        //ejercicio06();
        //ejercicio07();
        //ejercicio08();
    }
}
