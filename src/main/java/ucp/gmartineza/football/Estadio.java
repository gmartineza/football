package ucp.gmartineza.football;

public class Estadio {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Estadio(String pNombre, String pCiudad, String pPais){
        setNombre(pNombre);
        setCiudad(pCiudad);
        setPais(pPais);
    }

    public String toString(){
        return (getNombre() + ", " + getCiudad() + " (" + getPais() + ")");
    }
}
