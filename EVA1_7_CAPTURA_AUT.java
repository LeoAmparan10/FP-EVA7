/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_captura_aut;

import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class EVA1_7_CAPTURA_AUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int year;
        double precio;
        //CREAR NUESTRO ESCANER
        Scanner captu;
        captu = new Scanner(System.in);
        //capturar:
        System.out.println("CAPTURA LA MARCA DEL AUTO");
        marca = captu.nextLine();
        
        System.out.println("Capura el modelo");
        modelo = captu.nextLine();
        
        System.out.println("Captura el year");
        year = captu.nextInt();
        
        System.out.println("Captura el precio");
        precio = captu.nextDouble();
        
        //IMPRECION:
        System.out.println("SECCIÓN DE IMPRESIÓN DE DATOS");
        System.out.println("MARCA:");
        System.out.println(marca);
        System.out.println("MODELO:");
        System.out.println(modelo);
        System.out.println("YEAR:");
        System.out.println(year);
        System.out.println("PRECIO:");
        System.out.println(precio);
    }
    
}
