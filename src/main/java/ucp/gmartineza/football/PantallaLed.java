package ucp.gmartineza.football;

import ucp.gmartineza.football.Interfaces.IJugador;
//import ucp.gmartineza.football.*;

public class PantallaLed {

    public String imprimir(IJugador pIJugador) {
       //"[Jugador 6] Marcos Rojo > Defensor" 
       return ("[Jugador " + pIJugador.getNumero() + "] " +
            pIJugador.getName() + " > " +
            pIJugador.getPosicion());
    }

    public String imprimir(Equipo pEquipo) {
        // "[Equipo] Boca Juniors > BOC"
        return ("[Equipo] " + pEquipo.getName() +
                " > " + pEquipo.getAbreviatura());
    }

    public String imprimir(Estadio pEstadio) {
        // "[Estadio] La Bombonera (Buenos Aires - Argentina)"
        return ("[Estadio] " + pEstadio.getName() +
                " (" + pEstadio.getCiudad() +
                " - " + pEstadio.getPais() + ")");
    }
}
