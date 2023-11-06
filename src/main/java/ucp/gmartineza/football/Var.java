package ucp.gmartineza.football;
import java.util.List;

import ucp.gmartineza.football.Interfaces.IJugador;

public class Var {
    private Partido partido;
    private AsistenteDeVideo asistenteDeVideo;
    private List<AVAR> aVar;

    public List<AVAR> getaVar() {
        return aVar;
    }

    public void setaVar(AVAR aVar1, AVAR aVar2, AVAR aVar3) {
        aVar.add(aVar1);
        aVar.add(aVar2);
        aVar.add(aVar3);
        // if (this.aVar.size() == 3) {
        //     this.aVar = aVar;
        // } else {
        //     throw new IllegalArgumentException("aVar list must contain exactly 3 items.");
        // }
    }

    public AsistenteDeVideo getAsistenteDeVideo() {
        return asistenteDeVideo;
    }

    public void setAsistenteDeVideo(AsistenteDeVideo asistenteDeVideo) {
        this.asistenteDeVideo = asistenteDeVideo;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    // Constructor
    public Var(Partido pPartido){
        setPartido(pPartido);
    }

    public int cantidadTarjetasAmarillas(){
        List<TarjetaBase> tarjetas = this.partido.getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> tarjeta.getColor() == "AMARILLA").
                count();
    }

    public int cantidadTarjetasRojas() {
        List<TarjetaBase> tarjetas = this.partido.getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> tarjeta.getColor() == "ROJA").
                count();
    }

    public int cantidadTarjetas(Equipo pEquipo){
        // have a list of players of pEquipo to reference searching for cards
        List<IJugador> jugadores = pEquipo.getJugadores();
        List<TarjetaBase> tarjetas = this.partido.getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> jugadores.contains(tarjeta.getJugador())).
                count();
    }
}
