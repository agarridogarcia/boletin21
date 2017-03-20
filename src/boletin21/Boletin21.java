/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ara
 */
public class Boletin21 {

 
    public static void main(String[] args) {
         Escribir escri=new Escribir();
    
    
   
        ArrayList<String> listaPalabras = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
        System.out.println("Escribe aquí:");
       String frases = sc.nextLine();
        System.out.println(frases);
        String cadena[] = frases.split(" ");
        for(int i =0; i<cadena.length;i++){
            listaPalabras.add(cadena[i]);
        }
        Collections.sort(listaPalabras);
        escri.engadir("ficheiro.txt",listaPalabras);
    }
    }
    

