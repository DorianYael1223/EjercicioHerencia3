package EjercicioHerencia3;

public class Main {
    public static void main(String[] args) throws PrecioNegativoException {
        // Example of creating a water-based lollipop
        PaletaAgua<String> paleta1 = new PaletaAgua<>("Fresa", 20.0, true);
        paleta1.mostrarInformacion();
        paleta1.mostrarBaseAgua();
        paleta1.paletaGrandeOChica();
        paleta1.nuevoPrecio();
        
        // Example of creating another water-based lollipop
        PaletaAgua<String> paleta2 = new PaletaAgua<>("Mango", 17.0, true);
        System.out.println();
        paleta2.mostrarInformacion();
        paleta2.mostrarBaseAgua();
        paleta2.paletaGrandeOChica();
        paleta2.nuevoPrecio();

        PaletaCrema<String> paleta3 = new PaletaCrema<String>("Vainilla", 15, true);
        System.out.println();
        paleta3.mostrarInformacion();
        paleta3.mostrarBaseCrema();
        paleta3.paletaGrandeOChica();
        paleta3.nuevoPrecio();
    }
}
