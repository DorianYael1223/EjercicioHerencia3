package EjercicioHerencia3;

class PaletaAgua<T> extends Paleta<T> {
    private boolean baseAgua; // Water-based or not

    public PaletaAgua(T sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    public void mostrarBaseAgua() {
        // Display whether the lollipop is water-based or not
        System.out.println("Base de agua: " + (baseAgua ? "Si" : "No"));
    }

    public void nuevoPrecio() {
        // Calculate and display the new price of the lollipop
        double nuevoPrecio = precio + 2;
        System.out.println("El nuevo precio es: $" + nuevoPrecio);
    }

    public void paletaGrandeOChica() {
        // Determine and display whether the lollipop is large or small
        if (precio <= 15) {
            System.out.println("Es una paleta chica.");
        } else {
            System.out.println("Paleta grande.");
        }
    }
}

