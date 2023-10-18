package ucp.gmartineza.football;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    String fecha;
    Equipo equipoLocal;
    Equipo equipoVisitante;
    List<Tarjeta> tarjetas = new ArrayList<>();
    String nombre;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Partido(Equipo pEquipoLocal,Equipo pEquipoVisitante, String pNombre){
        setEquipoLocal(pEquipoLocal);
        setEquipoVisitante(pEquipoVisitante);
        setNombre(pNombre + " " + pEquipoLocal.getAbreviatura()+"x"+pEquipoVisitante.getAbreviatura());
    }

    public void agregar(Tarjeta pTarjeta){
        this.tarjetas.add(pTarjeta);
    }

    public int tarjetasCantidad(){
        return getTarjetas().size();
    }
}
