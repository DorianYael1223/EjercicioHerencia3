package EjercicioHerencia3;

public class Main {
    public static void main(String[] args) {
        try {
            PaletaCrema paletaCrema = new PaletaCrema("Vainilla", 14, true);
            PaletaCrema paletaCrema2 = new PaletaCrema("Fresa", -16, true); // Intente con precio negativo
            PaletaAgua paletaAgua = new PaletaAgua("Limon", 15, true);
            PaletaAgua paletaAgua2 = new PaletaAgua("Coco", 17, true);

            paletaCrema.mostrarInformacion();
            paletaCrema.paletaGrandeOChica();
            paletaCrema.mostrarBaseCrema();
            paletaCrema.nuevoPrecio();

            System.out.println("-----------------------");
            paletaCrema2.mostrarInformacion();
            paletaCrema2.paletaGrandeOChica();
            paletaCrema2.mostrarBaseCrema();
            paletaCrema2.nuevoPrecio();

            System.out.println("-------------------------");
            paletaAgua.mostrarInformacion();
            paletaAgua.paletaGrandeOChica();
            paletaAgua.mostrarBaseAgua();
            paletaAgua.nuevoPrecio();

            System.out.println("---------------------------");
            paletaAgua2.mostrarInformacion();
            paletaAgua2.paletaGrandeOChica();
            paletaAgua2.mostrarBaseAgua();
            paletaAgua2.nuevoPrecio();
        } catch (PrecioNegativoException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}



