/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai16_Fibonacci {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); 
        System.out.println("In dãy Fibonacci");
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu n:");
        int n = nhap.nextInt();
        int so1 = 1 , so2= 2;
        System.out.println("DÃY FIBONACCI:");
         for ( int i = 1 ; i< n ; i++) {
             System.out.print(so1+ "");
             
             int soketiep = so1 + so2;
             so1 = so2;
             so2 = soketiep;
         }
    }
    
}
