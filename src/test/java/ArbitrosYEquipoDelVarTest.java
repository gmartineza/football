import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import ucp.gmartineza.football.*;

public class ArbitrosYEquipoDelVarTest {
    @Test
    public void InstanciarPartidoConArbitrosTest() {
    Estadio estadio = new Estadio("nombre estadio", "nombre ciudad", "nombre pais");
    Equipo equipoLocal = new Equipo("equipo local", "LOC") ;
    Equipo equipoVisitante = new Equipo("equipo visitante", "VIS") ;
    Arbitro arbitro = new Arbitro("arbitro");
    Arbitro arbitroLinea1 = new Arbitro("arbitro linea 1");
    Arbitro arbitroLinea2 = new Arbitro("arbitro linea 2");
    Arbitro arbitroAsistente = new Arbitro("arbitro asistente");
    Partido partido = new Partido(estadio, equipoLocal, equipoVisitante, "nombre partido", arbitro, arbitroLinea1, arbitroLinea2, arbitroAsistente);

    assertEquals(estadio, partido.getEstadio());
    assertEquals(equipoLocal, partido.getEquipoLocal());
    assertEquals(equipoVisitante, partido.getEquipoVisitante());
    assertEquals(arbitro, partido.getArbitro());
    ArrayList<Arbitro> arbitrosLinea = new ArrayList<>();
    arbitrosLinea.add(arbitroLinea1);
    arbitrosLinea.add(arbitroLinea2);
    assertEquals(arbitrosLinea, partido.getArbitrosLinea());
    assertEquals(arbitroAsistente, partido.getArbitroAsistente());
    }

}