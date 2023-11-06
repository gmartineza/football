package ucp.gmartineza.football;

public abstract class IntegranteDelVar extends ArbitroBase{
    public IntegranteDelVar(String name, String tipoAsistente) {
        super(name);
        setTipoAsistente(tipoAsistente);
    }

    private String TipoAsistente;

    public String getTipoAsistente() {
        return TipoAsistente;
    }

    public void setTipoAsistente(String tipoAsistente) {
        this.TipoAsistente = tipoAsistente;
    }
}
