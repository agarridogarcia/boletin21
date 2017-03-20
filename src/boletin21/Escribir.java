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

/**
 *
 * @author Ara
 */
public class Escribir {
     public static void engadir (String nomFich,ArrayList<String> lista){
        PrintWriter engadir = null;
        FileWriter fich;
        try{
           engadir= new PrintWriter(new FileWriter(nomFich,true));
           for(int i = 0 ; i<lista.size();i++){
              engadir.print(lista.get(i)+" "); 
           }
           engadir.println("\n");
        }catch(IOException ex){
            System.out.println("Error 1: "+ex.getMessage());
        }finally{
            engadir.close();
        }
        
    }
}
