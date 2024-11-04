/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garacavallo2;

/**
 *
 * @author osamu
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author osamu
 */
public class GaraCavallo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // leggere diversi inpunt su console 
         
       // Inserisco la lunghezza della gara
        System.out.println("inserire lunghezza percorso");
        int LunghezzaGara = scanner.nextInt();
       
       System.out.println("inserire numero di cavalli"); // inserisco il numero dei cavalli 
       int Ncavalli = scanner.nextInt();
       scanner.nextLine(); // la pulizia del buffer 
       
       ArrayList<Cavallo> cavalli = new ArrayList<>();// utilizzo un ArrayList per memomirrizzare i cavalli Thread
       
       for(int i = 0; i < Ncavalli; i++){
               
           System.out.println("inserire nome dei cavalli : " + (i+1)+ ":");
           String nomeCavallo = scanner.nextLine(); 
           
           System.out.println("Inserisci la velocita del cavalo");
           int velocita = scanner.nextInt();
           scanner.nextLine();
           
           Cavallo cavallo = new Cavallo(nomeCavallo, LunghezzaGara, velocita);
           
               }
       
       
       
       System.out.println("\nLa gara iniziata!");
       
      System.out.println("gara terminata!");
      
    }
    
}
