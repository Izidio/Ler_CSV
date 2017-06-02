/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ler_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Izidio Carvalho
 */
public class Ler_CSV {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("src/test.csv"));
        String line = "";
        List lista = new ArrayList();
       
        while ((line = br.readLine()) != null) {
            // "," ou ";" de acordo com o arquivo
            String[] row = line.split(";");
            System.err.println(row[0] +" "+row[1] +" "+row[2] +" "+row[3] +" ");
           }
     }
    
}
