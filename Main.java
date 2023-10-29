package EjercicioHerencia3;

public class Main {
    public static void main(String[] args) throws PrecioNegativoException {
        // Example of creating a water-based lollipop
        PaletaAgua<String> paleta1 = new PaletaAgua<>("Fresa", -2.0, true);
        paleta1.mostrarInformacion();
        paleta1.mostrarBaseAgua();
        
        // Example of creating another water-based lollipop
        PaletaAgua<String> paleta2 = new PaletaAgua<>("Mango", 3.0, true);
        paleta2.mostrarInformacion();
        paleta2.mostrarBaseAgua();
    }
}
