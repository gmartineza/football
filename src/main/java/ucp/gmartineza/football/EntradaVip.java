package ucp.gmartineza.football;
import ucp.gmartineza.football.Entrada;

public class EntradaVip extends Entrada{
    private Partido partido;
    private String nombre;
    private int precio;

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public EntradaVip(Partido partido, String nombre, int precio) {
        super(partido, nombre, precio);
    }
    public boolean esVip() {
        return true;
    }

    @Override
    public String toString(){
        // "[Entrada] Partido SAL vs. BOC el 08/11/2023"
        return String.format("[%s] Partido %s vs. %s el %s",
            "Entrada VIP",
            partido.getEquipoLocal().getAbreviatura(),
            partido.getEquipoVisitante().getAbreviatura(),
            partido.getFechaFormateada()
            );
    }

}
