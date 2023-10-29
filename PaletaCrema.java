package EjercicioHerencia3;

class PaletaCrema <T> extends Paleta <T>{
    private boolean cremosa; 
public PaletaCrema(T sabor, double precio, boolean cremosa) throws PrecioNegativoException {
        super(sabor, precio);
        this.cremosa = cremosa;

        if (precio < 0) {
            throw new PrecioNegativoException("El precio no puede ser negativo.");
        }
    }

    public void mostrarBaseCrema() {
        System.out.println("Base de crema: " + (cremosa ? "Si" : "No"));
    }

    public void nuevoPrecio() {
        double precionuevo = precio + 6;
        System.out.println("El nuevo precio es: $" + precionuevo);
    }

    public void paletaGrandeOChica() {
        if (precio <= 15) {
            System.out.println("Es una paleta chica.");
        } else {
            System.out.println("Es una Paleta grande.");
        }
    }
}
class PrecioNegativoException extends Exception {
    public PrecioNegativoException(String mensaje) {
        super(mensaje);
    }
}
