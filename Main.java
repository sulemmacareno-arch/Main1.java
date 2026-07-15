// Clase que representa a un estudiante
class Estudiante {

    // Atributos del estudiante
    int id;
    String nombre;
    String carrera;

    // Constructor que inicializa los datos del estudiante
    public Estudiante(int id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    // Método que muestra la información del estudiante
    public void mostrarDatos() {
        System.out.println("=== ESTUDIANTE ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
    }
}

// Clase que representa a un profesor
class Profesor {

    // Atributos del profesor
    int id;
    String nombre;
    String especialidad;

    // Constructor que inicializa los datos del profesor
    public Profesor(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Método que muestra la información del profesor
    public void mostrarDatos() {
        System.out.println("\n=== PROFESOR ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}

// Clase que representa una materia
class Materia {

    // Atributos de la materia
    int id;
    String nombre;

    // Constructor que inicializa los datos de la materia
    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Método que muestra la información de la materia
    public void mostrarDatos() {
        System.out.println("\n=== MATERIA ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
    }
}

// Clase que representa una matrícula
class Matricula {

    // Número de matrícula del estudiante
    int numero;

    // Constructor que inicializa el número de matrícula
    public Matricula(int numero) {
        this.numero = numero;
    }

    // Método que muestra la matrícula registrada
    public void registrar() {
        System.out.println("\n=== MATRÍCULA ===");
        System.out.println("Número de matrícula: " + numero);
        System.out.println("Matrícula registrada correctamente.");
    }
}

// Clase que representa una evaluación
class Evaluacion {

    // Calificación obtenida por el estudiante
    double calificacion;

    // Constructor que inicializa la calificación
    public Evaluacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Método que muestra la calificación y el resultado
    public void mostrarResultado() {

        System.out.println("\n=== EVALUACIÓN ===");
        System.out.println("Calificación: " + calificacion);

        // Verifica si el estudiante aprobó la materia
        if (calificacion >= 70) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Reprobado");
        }
    }
}

// Clase principal del programa
class Main {

    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {

        // Se crean los objetos de cada una de las clases con los parámetros correctos
        Estudiante estudiante = new Estudiante(1, "Myriam", "Ingeniería en Desarrollo de Software");
        Profesor profesor = new Profesor(101, "Gustavo Valdez", "Programación");
        Materia materia = new Materia(201, "Programación Orientada a Objetos");
        Matricula matricula = new Matricula(98095);
        Evaluacion evaluacion = new Evaluacion(100);

        // Se muestra un encabezado en la consola
        System.out.println("====================================");
        System.out.println("     SISTEMA DE GESTIÓN ESCOLAR     ");
        System.out.println("====================================");

        // Se llama a los métodos para mostrar la información
        estudiante.mostrarDatos();
        profesor.mostrarDatos();
        materia.mostrarDatos();
        matricula.registrar();
        evaluacion.mostrarResultado();
    
        // Impresiones finales personalizadas
        System.out.println("\n=========================================");
        System.out.println("¡El programa corre perfectamente!");
        System.out.println("¡PROGRAMA EJECUTADO CON ÉXITO EN VS CODE!");
        System.out.println("Estudiante: " + estudiante.nombre);
        System.out.println("Carrera: " + estudiante.carrera);
        System.out.println("=========================================");
    }
}
