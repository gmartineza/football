package ucp.gmartineza.football;

import ucp.gmartineza.football.Interfaces.IPlayer;

public class Jugador implements IPlayer{
    String nombre;
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int pNumero) {
        this.numero = pNumero;
    }

    public String getName() {
        return this.nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public Jugador(String pNombre, int pNumero){
        setNombre(pNombre);
        setNumero(pNumero);
    }
}
