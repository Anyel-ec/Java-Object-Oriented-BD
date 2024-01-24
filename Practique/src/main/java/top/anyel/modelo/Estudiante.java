package top.anyel.modelo;

public class Estudiante extends Persona {
    String carrera;
    String matricula;

    public Estudiante(String nombre, String apellido, int edad, String cedula, String carrera, String matricula) {
        super(nombre, apellido, edad, cedula);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public Estudiante() {
        super();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
