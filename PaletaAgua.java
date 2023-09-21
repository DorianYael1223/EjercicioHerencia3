package EjercicioHerencia3;

class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    public void mostrarBaseAgua() {
        System.out.println("Base de agua: " + (baseAgua ? "Si" : "No"));
    }

    public void nuevoPrecio() {
        double precionuevo = precio + 2;
        System.out.println("El nuevo precio es: $" + precionuevo);
    }

    public void paletaGrandeOChica() {
        if (precio <= 15) {
            System.out.println("Es una paleta chica.");
        } else {
            System.out.println("Paleta grande.");
        }
    }
}
