
package Vehiculos;

import java.util.Scanner;

public class Motocicleta extends Vehiculo {
    int Tienecasco;
    
    public void Motocicleta(){
        
    }
    @Override
    public void Acelerar(){
        VelocidadMaxima=(int) (Math.random() * 100 + 1 );
         Scanner ent=new Scanner(System.in);
         System.out.println("Motocicleta");
         System.out.println("Desea ponerse casco");
         System.out.println("1. Si");
         System.out.println("2. No");
         Tienecasco=ent.nextInt();
         if(Tienecasco==1){
             System.out.println("Velocidad Maxima es de: "+VelocidadMaxima+" Km/H");
             System.out.println("Se ha puesto el casco de seguridad");
             System.out.println("_________________________________________");
         }else{
             System.out.println("Velocidad Maxima es de: "+VelocidadMaxima+" Km/H");
             System.out.println("No se ha puesto el casco de seguridad");
             System.out.println("_________________________________________");
         }
         
         
         
         
    }
}
