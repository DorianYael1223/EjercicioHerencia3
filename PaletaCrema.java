package EjercicioHerencia3;

class PaletaCrema<T> extends Paleta<T> {
    private boolean cremosa; // Cream-based or not

    public PaletaCrema(T sabor, double precio, boolean cremosa) throws PrecioNegativoException {
        super(sabor, precio);
        this.cremosa = cremosa;

        if (precio < 0) {
            throw new PrecioNegativoException("El precio no puede ser negativo.");
        }
    }

    public void mostrarBaseCrema() {
        // Display whether the lollipop has a cream-based base or not
        System.out.println("Base de crema: " + (cremosa ? "Si" : "No"));
    }

    public void nuevoPrecio() {
        // Calculate and display the new price of the lollipop
        double nuevoPrecio = precio + 6;
        System.out.println("El nuevo precio es: $" + nuevoPrecio);
    }

    public void paletaGrandeOChica() {
        // Determine and display whether the lollipop is large or small
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
