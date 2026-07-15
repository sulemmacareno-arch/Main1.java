// =====================================================
// INTERFAZ
// Define el comportamiento que todos los productos
// deben implementar.
// =====================================================

interface Vendible {
    double calcularPrecioFinal();
}

// =====================================================
// CLASE ABSTRACTA
// Representa un producto genérico del inventario.
// =====================================================

abstract class Producto implements Vendible {

    protected int id;
    protected String nombre;
    protected double precio;

    // Constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método común para todos los productos
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio base: $" + precio);
    }

    // Método abstracto que cada subclase implementará
    @Override
    public abstract double calcularPrecioFinal();
}

// =====================================================
// CLASE DERIVADA: ELECTRÓNICO
// Hereda de Producto.
// =====================================================

class Electronico extends Producto {

    private int garantia;

    public Electronico(int id, String nombre, double precio, int garantia) {
        super(id, nombre, precio);
        this.garantia = garantia;
    }

    // Implementación del método abstracto
    @Override
    public double calcularPrecioFinal() {
        return precio * 1.16; // IVA del 16%
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantía: " + garantia + " meses");
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}

// =====================================================
// CLASE DERIVADA: ALIMENTO
// Hereda de Producto.
// =====================================================

class Alimento extends Producto {

    private String fechaCaducidad;

    public Alimento(int id, String nombre, double precio, String fechaCaducidad) {
        super(id, nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 1.08; // Impuesto del 8%
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}

// =====================================================
// CLASE DERIVADA: ROPA
// Hereda de Producto.
// =====================================================

class Ropa extends Producto {

    private String talla;

    public Ropa(int id, String nombre, double precio, String talla) {
        super(id, nombre, precio);
        this.talla = talla;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 1.10; // Impuesto del 10%
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Talla: " + talla);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}

// =====================================================
// CLASE PRINCIPAL
// Aquí se demuestra el uso del polimorfismo.
// =====================================================

public class Inventario {

    public static void main(String[] args) {

        // Se crea un arreglo de tipo Producto.
        // Gracias al polimorfismo puede almacenar
        // diferentes tipos de productos.

        Producto[] inventario = new Producto[3];

        inventario[0] = new Electronico(
                1,
                "Laptop Lenovo",
                18000,
                24
        );

        inventario[1] = new Alimento(
                2,
                "Leche Entera",
                35,
                "15/09/2026"
        );

        inventario[2] = new Ropa(
                3,
                "Playera Deportiva",
                280,
                "M"
        );

        System.out.println("====================================");
        System.out.println(" SISTEMA DE GESTIÓN DE INVENTARIOS");
        System.out.println("====================================\n");

        // Polimorfismo:
        // Aunque todos son tratados como Producto,
        // Java ejecuta el método correspondiente
        // a la clase real del objeto.

        for (Producto producto : inventario) {
            producto.mostrarInformacion();
            System.out.println("------------------------------------");
        }
    }
}