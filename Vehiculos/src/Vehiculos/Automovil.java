
package Vehiculos;

public class Automovil extends Vehiculo {
    
    int numPuertas=4;
    
    public void Automovil(){
        
    }
    @Override
    public void Acelerar(){
        System.out.println("_________________________________________");
        System.out.println("Automovil");
        VelocidadMaxima=(int) (Math.random() * 100 + 1 );
        System.out.println("Velocidad Maxima es de: "+VelocidadMaxima+" Km/H");
        System.out.println("Tiene un numero de puerta de: "+numPuertas);
        System.out.println("_________________________________________");
    }
    
}
