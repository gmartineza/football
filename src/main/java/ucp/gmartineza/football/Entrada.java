package ucp.gmartineza.football;
public class Entrada {
    private Partido partido;
    private String nombre;
    private int precio;

    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Entrada(Partido partido, String nombre, int precio) {
        setPartido(partido);
        setNombre(nombre);
        setPrecio(precio);
    }

    @Override
    public String toString(){
        // "[Entrada] Partido SAL vs. BOC el 08/11/2023"
        return String.format("[%s] Partido %s vs. %s el %s",
            "Entrada",
            partido.getEquipoLocal().getAbreviatura(),
            partido.getEquipoVisitante().getAbreviatura(),
            partido.getFechaFormateada()
            );
    }
}
