import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Python", "Facultad de la energia", "Computacion");
        Equipo equipo2 = new Equipo("Java", "Facultad de la energia", "Computacion");
        Equipo equipo3 = new Equipo("C++", "Facultad de la energia", "Computacion");
        Equipo equipo4 = new Equipo("C#", "Facultad de la energia", "Computacion");
        Equipo equipo5 = new Equipo("Ruby", "Facultad de la energia", "Computacion");
        Equipo equipo6 = new Equipo("Javascript", "Facultad de la energia", "Computacion");

        Jugador jugador1 = new Jugador("Pedro", 1, 10, "Argelia");
        Jugador jugador2 = new Jugador("Agustin", 2, 11, "Carigan");
        Jugador jugador3 = new Jugador("Felipe", 3, 12, "Centro");
        Jugador jugador4 = new Jugador("Miguel", 4, 13, "Simon Bolivar");
        Jugador jugador5 = new Jugador("Juan", 5, 14, "La tebaida");
        Jugador jugador6 = new Jugador("Carlos", 6, 15, "Motupe");
        Jugador jugador7 = new Jugador("Jose", 7, 16, "Pueblo Libre");
        Jugador jugador8 = new Jugador("Luis", 8, 17, "San Juan");
        Jugador jugador9 = new Jugador("Jorge", 9, 18, "San Juan");
        Jugador jugador10 = new Jugador("Mario", 10, 19, "San Juan");
        Jugador jugador11 = new Jugador("Javier", 11, 20, "San Juan");
        Jugador jugador12 = new Jugador("Raul", 12, 21, "San Juan");


        equipo1.añadirJugador(jugador1);
        equipo1.añadirJugador(jugador2);
        equipo2.añadirJugador(jugador3);
        equipo2.añadirJugador(jugador4);
        equipo3.añadirJugador(jugador5);
        equipo3.añadirJugador(jugador6);
        equipo4.añadirJugador(jugador7);
        equipo4.añadirJugador(jugador8);
        equipo5.añadirJugador(jugador9);
        equipo5.añadirJugador(jugador10);
        equipo6.añadirJugador(jugador11);
        equipo6.añadirJugador(jugador12);

        List<Jugador> jugadoresEquipo1 = new ArrayList<>(equipo1.getJugadores());
        List<Jugador> jugadoresEquipo2 = new ArrayList<>(equipo2.getJugadores());
        List<Jugador> jugadoresEquipo3 = new ArrayList<>(equipo3.getJugadores());
        List<Jugador> jugadoresEquipo4 = new ArrayList<>(equipo4.getJugadores());
        List<Jugador> jugadoresEquipo5 = new ArrayList<>(equipo5.getJugadores());
        List<Jugador> jugadoresEquipo6 = new ArrayList<>(equipo6.getJugadores());

        // Crear campeonato
        Campeonato campeonato = new Campeonato("Liga Media", Modalidad.TODOS_CONTRA_TODOS);
        campeonato.inscribirEquipo(equipo1, jugadoresEquipo1);
        campeonato.inscribirEquipo(equipo2, jugadoresEquipo2);
        campeonato.inscribirEquipo(equipo3, jugadoresEquipo3);


        campeonato.registrarPartido(equipo1, 2, equipo2, 2);
        campeonato.registrarPartido(equipo1, 3, equipo3, 1);


        campeonato.mostrarTablaPosiciones();

        Campeonato campeontao1 = new Campeonato("Liga Mayor", Modalidad.FASES_DE_GRUPOS);

        campeontao1.inscribirEquipo(equipo2, jugadoresEquipo2);
        campeontao1.inscribirEquipo(equipo4, jugadoresEquipo4);
        campeontao1.inscribirEquipo(equipo5, jugadoresEquipo5);
        campeontao1.inscribirEquipo(equipo6, jugadoresEquipo6);

        campeontao1.registrarPartido(equipo2, 2, equipo4, 2);
        campeontao1.registrarPartido(equipo2, 3, equipo5, 1);
        campeontao1.registrarPartido(equipo2, 3, equipo6, 1);

        campeontao1.mostrarTablaPosiciones();

    }
}
