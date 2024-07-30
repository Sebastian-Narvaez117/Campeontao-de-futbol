import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Estadisticas> estadisticasList;
    private List<Inscripcion> inscripcionList;

    public Sistema() {
        this.estadisticasList = new ArrayList<>();
        this.inscripcionList = new ArrayList<>();
    }

    public void visualizarEstadisticasIndividuales(int aportesJugador) {
        // Implementar lógica para visualizar estadísticas individuales
    }

    public void visualizarEstadisticasEquipo(int aportesEquipo) {
        // Implementar lógica para visualizar estadísticas de equipo
    }

    public void visualizarTablaPosiciones() {
        // Implementar lógica para visualizar la tabla de posiciones
    }

    public void añadirCampeonato(Campeonato campeonato) {
        // Implementar lógica para añadir un campeonato
    }

    public void inscripcionEquipo(Inscripcion inscripcion) {
        inscripcionList.add(inscripcion);
    }

    public void asignarCampeon() {
        // Implementar lógica para asignar un campeón
    }
}
