import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private int numeroJugadores;
    private String facultad;
    private String carrera;
    private List<Jugador> jugadores;

    public Equipo(String nombre, String facultad, String carrera) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.carrera = carrera;
        this.jugadores = new ArrayList<>();
    }

    public void añadirJugador(Jugador jugador) {
        jugadores.add(jugador);
        numeroJugadores++;
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
        numeroJugadores--;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
