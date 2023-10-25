import org.junit.Test;
import static org.junit.Assert.*;

import ucp.gmartineza.football.*;

public class ArbitrosYEquipoDelVarTest {
    @Test
    public void PartidoTest(){
        // Partido necesita arbitro, arbitroLinea 2...2, arbitroAsistente.
        Equipo equipoLocal = new Equipo("equipo local", "LOC");
        Equipo equipoVisitante = new Equipo("equipo visitante", "VIS");
        Partido partido = new Partido(equipoLocal, equipoVisitante, nombre,
                arbitro, arbitroLinea, arbitroAsistente);
    }
}