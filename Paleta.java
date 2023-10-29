package EjercicioHerencia3;

class Paleta<T> {
    protected T sabor;
    protected double precio;

    public Paleta(T sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor + ", precio: $" + precio);
    }
}


