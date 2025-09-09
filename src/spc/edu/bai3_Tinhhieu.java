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
public class bai3_Tinhhieu {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH HIEU 2 SO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = sc.nextInt();
         System.out.println("Nhap so b");
        int b = sc.nextInt();
        int hieu = a - b;
        System.out.printf(" %d - %d = %d", a,b,hieu);
        
        int tich = a * b;
        System.out.printf(" %d * %d = %d", a,b,tich);
        
        double thuong =(double)a / b;
        System.out.printf(" %d / %d = %f", a,b,thuong);
    }
 
}
