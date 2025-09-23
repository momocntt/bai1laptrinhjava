/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai19_FindMaxInArray {
    public static void main(String[] args) {
        
        Scanner nhap = new Scanner(System.in);
        int[] a = new int[10];
        
       
        System.out.println("Nhap mang:");
        for (int i = 0; i < 10; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = nhap.nextInt();       
        }

       
        int max = a[0];
        int min = a[0];

       
        for (int i = 1; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

       
        System.out.print("So lon nhat: " + max);
        System.out.print("So be nhat: " + min);

    
    }
}
