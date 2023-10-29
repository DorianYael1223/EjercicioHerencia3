package EjercicioHerencia3;

class Paleta<T> {
    protected T sabor; // Flavor of the lollipop
    protected double precio; // Price of the lollipop

    public Paleta(T sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        // Display information about the lollipop
        System.out.println("Sabor: " + sabor + ", precio: $" + precio);
    }
}
