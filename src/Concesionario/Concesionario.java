package Concesionario;

import java.util.ArrayList;
import java.util.List;

class Concesionario {
    List<Coche> inventario;

    public Concesionario() {
        this.inventario = new ArrayList<>();
    }

    /*public void agregarCoche(Coche Coche) {
        inventario.add(Coche);
    Este método lo eliminamos ya que solo es una sola línea de código, cosa que podemos hacer directamente en el código
    sin tener que llamar a un método exterior.
    }*/

    //
    public boolean buscarCochePorModelo(String marca, String modelo, int anio) {
        for (Coche Coche : inventario) {
            if (Coche.marca.equals(marca) && Coche.modelo.equals(modelo) && Coche.anioFabricacion == anio) {
                return true;
            }
        }
        return false;
    }
    //En vez de pasa varias variables, le pasamos un objeto de tipo coche directamente.
    public void imprimirInformacionCoche(Coche vehiculo) {
        for (Coche Coches : inventario) {
            if (buscarCochePorModelo(vehiculo.marca, vehiculo.modelo, vehiculo.anio)) {
                System.out.println("Información del Coche:");
                System.out.println("Marca: " + vehiculo.marca);
                System.out.println("Modelo: " + vehiculo.modelo);
                System.out.println("Año de Fabricación: " + vehiculo.anio);
                System.out.println("Precio: $" + Coches.precio);
                //return; esto sobra en el código, no tienes que devolver nada.
            }
        }
        System.out.println("El Coche con la marca '" + vehiculo.marca + "', modelo '" + vehiculo.modelo + "' y año '" + vehiculo.anio + "' no se encuentra en el concesionario.");
    }
}
