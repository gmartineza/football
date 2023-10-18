package ucp.gmartineza.football;

import ucp.gmartineza.football.Interfaces.IJugador;

public class Jugador implements IJugador{
    String nombre;
    int numero;
    String posicion;

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

    @Override
    public String getPosicion() {
        return this.posicion;
    }

    @Override
    public void setPosicion(String pPosicion) {
        this.posicion = pPosicion;
    }
}
