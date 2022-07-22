/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Final_Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
         Clase_Restaurant [] Restaurant = new Clase_Restaurant [5];
        
        double Precio_comida = 0;
        double Precio_bebida = 0;
        double Precio_Postre = 0;
        double acumulador_postre = 0;
        double acumulador_bebida = 0;
        double acumulador_comida = 0;
        double acumulador_total = 0;
        
        for (int i = 0; i <=4; i++) 
        {
            System.out.println("Ingrese el precio de comida que pidio el comensal de la mesa numero " +i);
            Precio_comida = teclado.nextDouble();
            
            System.out.println("Ingrese el precio de la bebida que pidio el comensal de la mesa numero " +i);
            
            Precio_bebida = teclado.nextDouble();
            
            System.out.println("Ingrese el precio del postre que pidio el comensal de la mesa numero " +i);
            
            Precio_Postre = teclado.nextDouble();
            
            Clase_Restaurant Objetos = new Clase_Restaurant(Precio_comida, Precio_bebida, Precio_Postre);
            
            Restaurant[i] = Objetos;
            
        }
        
        for (int i = 0; i <=4; i++) 
        {
            acumulador_comida = acumulador_comida + Restaurant[i].getPrecio_comida();
            
            acumulador_bebida = acumulador_bebida + Restaurant[i].getPrecio_bebida();
                    
            acumulador_postre = acumulador_postre + Restaurant[i].getPrecio_postre();
            
            
        }
        
        double mayor_comida = Restaurant[0].getPrecio_comida();
        double mayor_postre = Restaurant[0].getPrecio_postre();
        double menor_bebida = Restaurant[0].getPrecio_bebida();
        
        for (int i = 0; i <=4; i++) 
        {
            if (Restaurant[i].getPrecio_comida() > mayor_comida) 
            {
                mayor_comida = Restaurant[i].getPrecio_comida();
                
            }
            
            if (Restaurant[i].getPrecio_postre() > mayor_postre) 
            {
                mayor_postre = Restaurant[i].getPrecio_postre();
            }
            
            if (Restaurant[i].getPrecio_bebida() < menor_bebida) 
            {
                menor_bebida = Restaurant[i].getPrecio_bebida();
            }
            
        }
        
        acumulador_total = acumulador_bebida + acumulador_comida + acumulador_postre;
        
        System.out.println("El comensal con mayor gastos en comida es el que gasto = " + " $ " + mayor_comida + " Pesos ");
        System.out.println("El comensal con mayor gastos en postres es el que gasto = " + " $ " + mayor_postre + " Pesos ");
        System.out.println("El comensal con menor gastos en bebida es el que gasto = " + " $ " + menor_bebida + " Pesos ");
        System.out.println("La ganancia en comida que genero el restaurant es de = " + " $ " + acumulador_comida + " Pesos ");
        System.out.println("La ganancia en bebida que genero el restaurant es de = " + " $ " + acumulador_bebida + " Pesos ");
        System.out.println("La ganancia en postre que genero el restaurant es de = " + " $ " + acumulador_postre + " Pesos ");
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("La ganancia total del restaurant es de = " + " $ " + acumulador_total + " Pesos ");
        
    }
    
}
