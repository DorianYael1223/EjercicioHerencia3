package EjercicioHerencia3;

public class Main {
    public static void main(String[] args) throws PrecioNegativoException {
        // Ejemplo de creación de una paleta con base de agua
        PaletaAgua<String> paleta1 = new PaletaAgua<>("Fresa", -2.0, true);
        paleta1.mostrarInformacion();
        paleta1.mostrarBaseAgua();
        // Ejemplo de creación de otra paleta con base de agua
        PaletaAgua<String> paleta2 = new PaletaAgua<>("Mango", 3.0, true);
        paleta2.mostrarInformacion();
        paleta2.mostrarBaseAgua();

    }
}
