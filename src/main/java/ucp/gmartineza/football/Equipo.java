package ucp.gmartineza.football;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import ucp.gmartineza.football.Interfaces.IJugador;

public class Equipo {
    private String nombre;
    private List<IJugador> jugadores = new ArrayList<>();
    private String abreviatura;

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<IJugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<IJugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
 
    // Constructor
    public Equipo(String pNombre, String pAbreviatura){
        this.nombre = pNombre;
        this.abreviatura = pAbreviatura;
    }

    public void agregar(IJugador pJugador){
        this.jugadores.add(pJugador);
    }

    public int jugadoresCantidad(){
        return this.jugadores.size();
    }

    public IJugador obtenerJugador(int pNumeroJugador) {
        Optional<IJugador> jugadorEncontrado = jugadores.stream()
                .filter(jugador -> jugador.getNumero() == pNumeroJugador)
                .findFirst();

        return jugadorEncontrado.orElse(null);
    }

    public String imprimirPlantel(){
        // sort jugadores by numero
        // [%s] %s (%s),... .format(numero, nombre, posicion)
        List<IJugador> jugadores = this.jugadores;
        Comparator<IJugador> byNumero = Comparator.comparing(IJugador::getNumero);
        Collections.sort(jugadores, byNumero);
        String plantel = "";
        for (IJugador jugador : jugadores) {
            if (!plantel.isEmpty()){
                plantel = plantel.concat(", ");
            }
            plantel = plantel.concat("[" + jugador.getNumero() + "] " +
                    jugador.getName() + " (" + jugador.getPosicion() +")"
                    );
        }

        return plantel;
    }
}
