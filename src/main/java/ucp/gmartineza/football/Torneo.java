package ucp.gmartineza.football;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    String nombre;
    List<Equipo> listaEquipos = new ArrayList<>();
    List<Partido> listaPartidos = new ArrayList<>(); 
    Equipo ganador;

    public Equipo getGanador() {
        return ganador;
    }

    public void setGanador(Equipo ganador) {
        this.ganador = ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(List<Equipo> listOfTeams) {
        this.listaEquipos = listOfTeams;
    }

    public List<Partido> getListaPartidos() {
        return this.listaPartidos;
    }

    public void setListaPartidos(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    // Constructor
    public Torneo(String pName){
        this.nombre = pName;
    }

    public void agregar(Equipo pEquipo){
        this.listaEquipos.add(pEquipo);
    }

    public void agregar(Partido pPartido){
        this.listaPartidos.add(pPartido);
    }

    public int equiposCantidad(){
        return getListaEquipos().size();
    }

    public int partidosCantidad(){
        return getListaPartidos().size();
    }
}
