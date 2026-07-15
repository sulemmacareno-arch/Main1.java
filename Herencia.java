// Clase base que representa a una persona
class Persona {

    int id;
    String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
    }
}

// Clase que representa a un estudiante
class Estudiante extends Persona {

    String carrera;

    public Estudiante(int id, String nombre, String carrera) {
        super(id, nombre);
        this.carrera = carrera;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== ESTUDIANTE ===");
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
    }
}

// Clase que representa a un profesor
class Profesor extends Persona {

    String especialidad;

    public Profesor(int id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\n=== PROFESOR ===");
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
    }
}

// Clase que representa una materia
class Materia {

    int id;
    String nombre;

    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("\n=== MATERIA ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
    }
}

// Clase que representa una matrícula
class Matricula {

    int numero;

    public Matricula(int numero) {
        this.numero = numero;
    }

    public void registrar() {
        System.out.println("\n=== MATRÍCULA ===");
        System.out.println("Número de matrícula: " + numero);
        System.out.println("Matrícula registrada correctamente.");
    }
}

// Clase que representa una evaluación
class Evaluacion {

    double calificacion;

    public Evaluacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarResultado() {
        System.out.println("\n=== EVALUACIÓN ===");
        System.out.println("Calificación: " + calificacion);

        if (calificacion >= 70) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Reprobado");
        }
    }
}

// Clase principal del programa
class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
            1, "Myriam", "Ingeniería en Desarrollo de Software"
        );
        Profesor profesor = new Profesor(
            101, "Gustavo Valdez", "Programación"
        );
        Materia materia = new Materia(
            201, "Programación Orientada a Objetos"
        );
        Matricula matricula = new Matricula(98095);
        Evaluacion evaluacion = new Evaluacion(100);

        System.out.println("====================================");
        System.out.println("     SISTEMA DE GESTIÓN ESCOLAR     ");
        System.out.println("====================================");

        estudiante.mostrarDatos();
        profesor.mostrarDatos();
        materia.mostrarDatos();
        matricula.registrar();
        evaluacion.mostrarResultado();

        System.out.println("\n=========================================");
        System.out.println("¡El programa corre perfectamente!");
        System.out.println("¡PROGRAMA EJECUTADO CON ÉXITO EN VS CODE!");
        System.out.println("Estudiante: " + estudiante.nombre);
        System.out.println("Carrera: " + estudiante.carrera);
        System.out.println("=========================================");
    }
}
