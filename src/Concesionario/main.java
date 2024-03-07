package Concesionario;

public class main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 25000.0);
        Coche coche2 = new Coche("Honda", "Civic", 2021, 22000.0);

        //En vez de llamar al método, lo hacemos directamente con add.
        concesionario.inventario.add(coche1);
        concesionario.inventario.add(coche2);

        //Creo otro objeto coche con los datos que había.
        Coche coche3 = new Coche("Honda","Civic",2021,22000.0);
        concesionario.inventario.add(coche3);

        //Hay un método que ya comprueba si existe o no el coche en el concesionario, que es el mimso que estamos utilizando.
        //
        concesionario.imprimirInformacionCoche(coche3);
    }
}
