public class Inscripcion {
    private String nombre;
    private Deporte deporte;

    public Inscripcion(String nombre, Deporte deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public void registrar(Equipo equipo) {
        // Implementar lógica para registrar un equipo
    }

    public boolean validacion(String facultad, String carrera) {
        // Implementar lógica para validar
        return true; // Ejemplo
    }

    public boolean cancelarRegistro(boolean validacion) {
        // Implementar lógica para cancelar registro
        return validacion; // Ejemplo
    }

    // Getters y setters
}
