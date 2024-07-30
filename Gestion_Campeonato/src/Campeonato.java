import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nombre;
    private Modalidad modalidad;
    private List<Equipo> equipos;
    private Tabla tabla;

    public Campeonato(String nombre, Modalidad modalidad) {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.equipos = new ArrayList<>();
        this.tabla = new Tabla();
    }

    public void inscribirEquipo(Equipo equipo, List<Jugador> jugadores) {
        equipos.add(equipo);
        for (Jugador jugador : jugadores) {
            equipo.añadirJugador(jugador);
        }
        tabla.inicializarEquipo(equipo);
    }

    public void registrarPartido(Equipo equipo1, int golesEquipo1, Equipo equipo2, int golesEquipo2) {
        tabla.registrarPartido(equipo1, golesEquipo1, equipo2, golesEquipo2);
    }

    public void mostrarTablaPosiciones() {
        System.out.println("Campeonato: " + nombre);
        tabla.mostrarTabla();
    }
}
