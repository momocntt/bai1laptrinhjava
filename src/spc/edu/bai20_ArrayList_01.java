/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class bai20_ArrayList_01 {
    public static void main(String[] args) {
        System.out.println("Day array");
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        ArrayList<String> a = new ArrayList<String>();
        a.add("Mỹ"); 
        a.add("Mẫn");
        a.add("Mơ");
        a.add("Mai");
        a.add("My");
        a.add("Min");
        a.add("Mun");
           for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        
        
            
        
    }
    }
}

