package ucp.gmartineza.football;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Equipo {
    String nombre;
    List<Jugador> jugadores = new ArrayList<>();
    String abreviatura;

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
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

    public void agregar(Jugador pJugador){
        this.jugadores.add(pJugador);
    }

    public int jugadoresCantidad(){
        return this.jugadores.size();
    }

    public Jugador obtenerJugador(int pNumeroJugador) {
        Optional<Jugador> jugadorEncontrado = jugadores.stream()
                .filter(jugador -> jugador.getNumeroJugador() == pNumeroJugador)
                .findFirst();

        return jugadorEncontrado.orElse(null);
    }

}
