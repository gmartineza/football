<<<<<<< HEAD
package ucp.gmartineza.football;
import java.util.ArrayList;
import java.util.List;

import ucp.gmartineza.football.Interfaces.IJugador;

public class Var {
    private Partido partido;
    private AsistenteDeVideo asistenteDeVideo;
    private List<AVAR> aVar = new ArrayList<>();

    public List<AVAR> getaVar() {
        return this.aVar;
    }

    public void setaVar(AVAR aVar1, AVAR aVar2, AVAR aVar3) {
        this.aVar.add(aVar1);
        this.aVar.add(aVar2);
        this.aVar.add(aVar3);
        // if (this.aVar.size() == 3) {
        //     this.aVar = aVar;
        // } else {
        //     throw new IllegalArgumentException("aVar list must contain exactly 3 items.");
        // }
    }

    public AsistenteDeVideo getAsistenteDeVideo() {
        return this.asistenteDeVideo;
    }

    public void setAsistenteDeVideo(AsistenteDeVideo asistenteDeVideo) {
        this.asistenteDeVideo = asistenteDeVideo;
    }

    public Partido getPartido() {
        return this.partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    // Constructor
    public Var(Partido pPartido){
        setPartido(pPartido);
    }

    public Var(Partido pPartido, AsistenteDeVideo asistenteDeVideo, AVAR aVAR1, AVAR aVAR2, AVAR aVAR3){
        setPartido(pPartido);
        setAsistenteDeVideo(asistenteDeVideo);
        setaVar(aVAR1, aVAR2, aVAR3);
    }

    public int cantidadTarjetasAmarillas(){
        List<TarjetaBase> tarjetas = getPartido().getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> tarjeta.getColor() == "AMARILLA").
                count();
    }

    public int cantidadTarjetasRojas() {
        List<TarjetaBase> tarjetas = getPartido().getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> tarjeta.getColor() == "ROJA").
                count();
    }

    public int cantidadTarjetas(Equipo pEquipo){
        // have a list of players of pEquipo to reference searching for cards
        List<IJugador> jugadores = pEquipo.getJugadores();
        List<TarjetaBase> tarjetas = getPartido().getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> jugadores.contains(tarjeta.getJugador())).
                count();
    }
}
=======
package ucp.gmartineza.football;
import java.util.ArrayList;
import java.util.List;

import ucp.gmartineza.football.Interfaces.IJugador;

public class Var {
    private Partido partido;
    private AsistenteDeVideo asistenteDeVideo;
    private List<AVAR> aVar = new ArrayList<>();

    public List<AVAR> getaVar() {
        return this.aVar;
    }

    public void setaVar(AVAR aVar1, AVAR aVar2, AVAR aVar3) {
        this.aVar.add(aVar1);
        this.aVar.add(aVar2);
        this.aVar.add(aVar3);
        // if (this.aVar.size() == 3) {
        //     this.aVar = aVar;
        // } else {
        //     throw new IllegalArgumentException("aVar list must contain exactly 3 items.");
        // }
    }

    public AsistenteDeVideo getAsistenteDeVideo() {
        return this.asistenteDeVideo;
    }

    public void setAsistenteDeVideo(AsistenteDeVideo asistenteDeVideo) {
        this.asistenteDeVideo = asistenteDeVideo;
    }

    public Partido getPartido() {
        return this.partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    // Constructor
    public Var(Partido pPartido){
        setPartido(pPartido);
    }

    public Var(Partido pPartido, AsistenteDeVideo asistenteDeVideo, AVAR aVAR1, AVAR aVAR2, AVAR aVAR3){
        setPartido(pPartido);
        setAsistenteDeVideo(asistenteDeVideo);
        setaVar(aVAR1, aVAR2, aVAR3);
    }

    public int cantidadTarjetasAmarillas(){
        List<TarjetaBase> tarjetas = getPartido().getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> tarjeta.getColor() == "AMARILLA").
                count();
    }

    public int cantidadTarjetasRojas() {
        List<TarjetaBase> tarjetas = getPartido().getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> tarjeta.getColor() == "ROJA").
                count();
    }

    public int cantidadTarjetas(Equipo pEquipo){
        // have a list of players of pEquipo to reference searching for cards
        List<IJugador> jugadores = pEquipo.getJugadores();
        List<TarjetaBase> tarjetas = getPartido().getTarjetas();
        return (int) tarjetas.stream()
                .filter(tarjeta -> jugadores.contains(tarjeta.getJugador())).
                count();
    }
}
>>>>>>> 260cc0ece473e4dd14fda6932c2f63bbf6cc319a
