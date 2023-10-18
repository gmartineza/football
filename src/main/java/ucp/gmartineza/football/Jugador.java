package ucp.gmartineza.football;

public class Jugador implements IPlayer{
    String nombre;
    int numeroJugador;

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public String getName() {
        return this.nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public Jugador(String pNombre, int pNumeroJugador){
        setNombre(pNombre);
        setNumeroJugador(pNumeroJugador);
    }
}
