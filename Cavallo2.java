/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garacavallo2;

import java.util.Random;
/**
 *
 * @author osamu
 */
public class Cavallo2 extends Thread {
    private final String nome;
    private int Dpercorsa = 0;
    private final int Dtotale;
    private final int velocita;
    private static final Random random = new Random();
    private boolean infortuno = false;
    
    public Cavallo2(String nome, int Dtotale, int velocita){
        this.nome = nome;
        this.Dtotale = Dtotale;
        this.velocita = velocita;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int Dpercorsa(){
        return Dtotale;
    }
    
  
    
    @Override
   public void run(){
       while(Dpercorsa < Dtotale && !infortuno){
           
           try{
               int passo = random.nextInt(velocita) +1;
               Dpercorsa += passo;
               
               if(random.nextInt(10)== 0){ //10% di possibilità di infortuno
                   infortuno = true;
               System.out.println("ooohh noo" + nome + "si è infortunato ora esce dalla gara");
               break;
           }
           
           System.out.println(nome + " ha percorso " + Dpercorsa + "metri");
          
           
           Thread.sleep(5000);//una pausa di 5 secondi
       
       } catch(InterruptedException e){
               }  
       } 
       
       if(!infortuno){
           System.out.println(nome + "ha terminato la gara");
       }
   
   }
   
}