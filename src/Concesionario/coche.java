package Concesionario;
//Eliminamos la clase Gestión de coches y creamos una unca clase de Coches,
//con sus variables y constructores.
 class Coche {
     String marca;
     String modelo;
     int anioFabricacion;
     double precio;
     int anio;

     public Coche(String marca, String modelo, int anioFabricacion, double precio) {
         this.marca = marca;
         this.modelo = modelo;
         this.anioFabricacion = anioFabricacion;
         this.precio = precio;
     }

     public record coche(String marca, String modelo) {
     }
 }