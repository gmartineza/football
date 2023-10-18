package ucp.gmartineza.football;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    String fecha;
    Equipo equipoLocal;
    Equipo equipoVisitante;
    List<Tarjeta> tarjetas = new ArrayList<>();
    String nombre;
    Estadio estadio;

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public String getName() {
        return (this.nombre + " " + this.equipoLocal.getAbreviatura() + "x" + this.equipoVisitante.getAbreviatura());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Partido(Equipo pEquipoLocal, Equipo pEquipoVisitante, String pNombre){
        setEquipoLocal(pEquipoLocal);
        setEquipoVisitante(pEquipoVisitante);
        setNombre(pNombre);
    }

    public Partido(Estadio pEstadio, Equipo pEquipoLocal, Equipo pEquipoVisitante, String pNombre){
        setEstadio(pEstadio);
        setEquipoLocal(pEquipoLocal);
        setEquipoVisitante(pEquipoVisitante);
        setNombre(pNombre);
    }

    public void agregar(Tarjeta pTarjeta){
        this.tarjetas.add(pTarjeta);
    }

    public int tarjetasCantidad(){
        return getTarjetas().size();
    }
}
