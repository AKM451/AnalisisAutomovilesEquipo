/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisautomoviles;

/**
 *
 * @author Kevin
 */
public class AnalisisAutomoviles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche car01 = new Coche();
        car01.prender = true;
        car01.kilometraje = 10000;
        car01.luz_delantera = true;
        car01.luz_freno = false;
        car01.direccionales = 9;
        car01.movimiento = true;
        System.out.println("El carro esta " + (car01.prender ? "encendido" : "apagado"));
        System.out.println("El kilometraje es de " + car01.kilometraje);
        System.out.println("La luz delantera esta " + (car01.luz_delantera ? "encendida" : "apagada"));
        System.out.println("La luz de freno esta " + (car01.luz_freno ? "encendida" : "apagada"));
        System.out.println("Las direccionales estan " + (car01.direccionales == 1 ? "del lado izquierdo"
                : car01.direccionales == 2 ? "del lado derecho" : "apagadas"));
        System.out.println("El carro esta " + (car01.movimiento ? "desplazamiento" : "inmovil"));

        System.out.println("");

        Coche car02 = new Coche();
        car02.prender = false;
        car02.kilometraje = 15000;
        car02.luz_delantera = false;
        car02.luz_freno = false;
        car02.direccionales = 9;
        car02.movimiento = false;
        System.out.println("El carro esta " + (car02.prender ? "encendido" : "apagado"));
        System.out.println("El kilometraje es de " + car02.kilometraje);
        System.out.println("La luz delantera esta " + (car02.luz_delantera ? "encendida" : "apagada"));
        System.out.println("La luz de freno esta " + (car02.luz_freno ? "encendida" : "apagada"));
        System.out.println("Las direccionales estan " + (car02.direccionales == 1 ? "del lado izquierdo"
                : car01.direccionales == 2 ? "del lado derecho" : "apagadas"));
        System.out.println("El carro esta " + (car02.movimiento ? "desplazamiento" : "inmovil"));
    }
}


