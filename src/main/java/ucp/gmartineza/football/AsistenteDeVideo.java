package ucp.gmartineza.football;

public class AsistenteDeVideo extends IntegranteDelVar{
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AsistenteDeVideo(String nombre){
        super(nombre, "AsistenteDeVideo");
    }
}
