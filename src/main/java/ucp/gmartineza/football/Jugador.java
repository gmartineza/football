package ucp.gmartineza.football;

import ucp.gmartineza.football.Interfaces.IImprimible;
import ucp.gmartineza.football.Interfaces.IJugador;

public class Jugador
        implements IJugador, IImprimible {
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

    public Jugador(String pNombre, int pNumero) {
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

    public String impresion() {
        // "[Jugador 6] Marcos Rojo > Defensor"
        return String.format("[Jugador %d] %s > %s",
                getNumero(),
                getName(),
                getPosicion());
    }
}
