package ucp.gmartineza.football;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partido {
    private Date fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private List<TarjetaBase> tarjetas = new ArrayList<>();
    private String nombre;
    private Estadio estadio;
    private Arbitro arbitro;
    private List<Arbitro> arbitrosLinea = new ArrayList<>(); // 2...2
    private Arbitro arbitroAsistente;

    public Arbitro getArbitroAsistente() {
        return arbitroAsistente;
    }

    public void setArbitroAsistente(Arbitro arbitroAsistente) {
        this.arbitroAsistente = arbitroAsistente;
    }

    public List<Arbitro> getArbitrosLinea() {
        return arbitrosLinea;
    }

    public void setArbitrosLinea(List<Arbitro> arbitroLinea) {
        if (this.arbitrosLinea.size() == 2) {
            this.arbitrosLinea = arbitroLinea;
        } else {
            throw new IllegalArgumentException("ArbitroLinea list must contain exactly 2 items.");
        }
    }

    public void setArbitroLinea(Arbitro arbitroLinea1, Arbitro arbitroLinea2){
        this.arbitrosLinea.add(arbitroLinea1);
        this.arbitrosLinea.add(arbitroLinea2);
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    // public String getFecha() {
    //     return fecha;
    // }

    // public void setFecha(String fecha) {
    //     this.fecha = fecha;
    // }

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

    public List<TarjetaBase> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<TarjetaBase> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public String getName() {
        return (this.nombre + " " + this.equipoLocal.getAbreviatura() + "x" + this.equipoVisitante.getAbreviatura());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Partido(Equipo pEquipoLocal, Equipo pEquipoVisitante, String pNombre) {
        setEquipoLocal(pEquipoLocal);
        setEquipoVisitante(pEquipoVisitante);
        setNombre(pNombre);
    }

    public Partido(Estadio pEstadio, Equipo pEquipoLocal, Equipo pEquipoVisitante, String pNombre) {
        setEstadio(pEstadio);
        setEquipoLocal(pEquipoLocal);
        setEquipoVisitante(pEquipoVisitante);
        setNombre(pNombre);
    }

    public Partido(Estadio pEstadio, Equipo pEquipoLocal, Equipo pEquipoVisitante, String pNombre, Arbitro arbitro, Arbitro arbitroLinea1, Arbitro arbitroLinea2, Arbitro arbitroAsistente) {
        setEstadio(pEstadio);
        setEquipoLocal(pEquipoLocal);
        setEquipoVisitante(pEquipoVisitante);
        setNombre(pNombre);
        setArbitro(arbitro);
        setArbitroLinea(arbitroLinea1, arbitroLinea2);
        setArbitroAsistente(arbitroAsistente);
    }

    public void agregar(TarjetaBase pTarjeta) {
        this.tarjetas.add(pTarjeta);
    }

    public int tarjetasCantidad() {
        return getTarjetas().size();
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFechaFormateada() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(fecha);
    }

    public Date getFecha() {
        return this.fecha;
    }
}
