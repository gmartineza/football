package ucp.gmartineza.football;

public class Tarjeta {
    Jugador jugador;
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    // Constructor
    public Tarjeta(String pColor, Jugador pJugador){
        setColor(pColor);
        setJugador(pJugador);
    }
}
