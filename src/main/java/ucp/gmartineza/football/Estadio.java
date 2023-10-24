package ucp.gmartineza.football;

import ucp.gmartineza.football.Interfaces.IImprimible;

public class Estadio
        implements IImprimible {
    String nombre;
    String ciudad;
    String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Estadio(String pNombre, String pCiudad, String pPais) {
        setNombre(pNombre);
        setCiudad(pCiudad);
        setPais(pPais);
    }

    @Override
    public String toString() {
        return (getName() + ", " + getCiudad() + " (" + getPais() + ")");
    }

    public String impresion() {
        // "[Estadio] La Bombonera (Buenos Aires - Argentina)"
        return String.format("[Estadio] %s (%s - %s)",
                getName(),
                getCiudad(),
                getPais());
    }
}
