import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tabla {
    private List<Equipo> equipos;
    private Map<Equipo, Integer> puntos;
    private Map<Equipo, Integer> partidosJugados;
    private Map<Equipo, Integer> partidosGanados;
    private Map<Equipo, Integer> partidosEmpatados;
    private Map<Equipo, Integer> partidosPerdidos;

    public Tabla() {
        this.equipos = new ArrayList<>();
        this.puntos = new HashMap<>();
        this.partidosJugados = new HashMap<>();
        this.partidosGanados = new HashMap<>();
        this.partidosEmpatados = new HashMap<>();
        this.partidosPerdidos = new HashMap<>();
    }

    public void inicializarEquipo(Equipo equipo) {
        if (!puntos.containsKey(equipo)) {
            equipos.add(equipo);
            puntos.put(equipo, 0);
            partidosJugados.put(equipo, 0);
            partidosGanados.put(equipo, 0);
            partidosEmpatados.put(equipo, 0);
            partidosPerdidos.put(equipo, 0);
        }
    }

    public void registrarPartido(Equipo equipo1, int golesEquipo1, Equipo equipo2, int golesEquipo2) {
        inicializarEquipo(equipo1);
        inicializarEquipo(equipo2);

        partidosJugados.put(equipo1, partidosJugados.get(equipo1) + 1);
        partidosJugados.put(equipo2, partidosJugados.get(equipo2) + 1);

        if (golesEquipo1 > golesEquipo2) {
            puntos.put(equipo1, puntos.get(equipo1) + 3);
            partidosGanados.put(equipo1, partidosGanados.get(equipo1) + 1);
            partidosPerdidos.put(equipo2, partidosPerdidos.get(equipo2) + 1);
        } else if (golesEquipo1 < golesEquipo2) {
            puntos.put(equipo2, puntos.get(equipo2) + 3);
            partidosGanados.put(equipo2, partidosGanados.get(equipo2) + 1);
            partidosPerdidos.put(equipo1, partidosPerdidos.get(equipo1) + 1);
        } else {
            puntos.put(equipo1, puntos.get(equipo1) + 1);
            puntos.put(equipo2, puntos.get(equipo2) + 1);
            partidosEmpatados.put(equipo1, partidosEmpatados.get(equipo1) + 1);
            partidosEmpatados.put(equipo2, partidosEmpatados.get(equipo2) + 1);
        }
    }

    public void mostrarTabla() {
        equipos.sort(Comparator.comparingInt(puntos::get).reversed());

        System.out.printf("%-10s %-7s %-7s %-7s %-7s %-7s%n", "Equipo", "Puntos", "Jugados", "Ganados", "Empatados", "Perdidos");
        for (Equipo equipo : equipos) {
            System.out.printf("%-15s %-7d %-7d %-7d %-7d %-7d%n", equipo.getNombre(), puntos.get(equipo), partidosJugados.get(equipo),
                    partidosGanados.get(equipo), partidosEmpatados.get(equipo), partidosPerdidos.get(equipo));
        }
    }
}
