package EjercicioHerencia3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PrecioNegativoException {
        // Crear una colección de paletas
        List<Paleta<String>> paletas = new ArrayList<>();

        try {
            // Creamos los objetos de la coleccion
            paletas.add(new PaletaAgua<String>("Limon", 15, true));
            paletas.add(new PaletaCrema<String>("Vainilla", 0, true));
            paletas.add(new PaletaAgua<String>("Fresa", 14, false));
            paletas.add(new PaletaCrema<String>("Sandia", 17, false));

            /*
             * Hacemos la comparacion con forme al sabor.
             * Podriamos hacer la comparacion con el precio.
             * El precio y nombre es lo que mas cambia
             * por eso usamos cualquiera de los dos
             */
            Collections.sort(paletas, (paleta1, paleta2) -> paleta1.getSabor().compareTo(paleta2.getSabor()));
            // Se usaron condiciones para mostrar las caracteristicas de cada instancia.
            for (Paleta<String> paleta : paletas) {
                if (paleta instanceof PaletaAgua) {
                    PaletaAgua<String> paletaAgua = (PaletaAgua<String>) paleta;
                    paletaAgua.mostrarInformacion();
                    paletaAgua.mostrarBaseAgua();
                    paletaAgua.nuevoPrecio();
                    paletaAgua.paletaGrandeOChica();
                    System.out.println();

                } else if (paleta instanceof PaletaCrema) {
                    PaletaCrema<String> paletaCrema = (PaletaCrema<String>) paleta;
                    //Metodos de cada clase 
                    paletaCrema.mostrarInformacion();
                    paletaCrema.mostrarBaseCrema();
                    paletaCrema.nuevoPrecio();
                    paletaCrema.paletaGrandeOChica();
                    System.out.println();
                }
            }
            //Mnesajes de alerta 
        } catch (PrecioNegativoException e) {
            // Catch and handle an Illegal value if it occurs
            System.out.println("Illegal value: " + e.getMessage());
        } catch (PrecioAguaNegativoException e) {
            // Catch and handle a Illegal value if it occurs
            System.out.println("Illegal value: " + e.getMessage());

        }
        //Iterator que recorre y muestra los objetos
        Iterator<Paleta<String>> it = paletas.iterator();
        while (it.hasNext()) {
            Paleta<String> personaje = it.next();
            personaje.mostrarInformacion();
        }
    }
}
