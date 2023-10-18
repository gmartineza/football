import java.util.List;

import ucp.gmartineza.football.Partido;
import ucp.gmartineza.football.TarjetaBase;

public class Var {
    Partido partido;

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
}
