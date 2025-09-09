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
public class bai4_pheptinh {
    public static void main(String[] args) {
            System.out.println("CHUONG TRINH PHEP TINH CO BAN");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = sc.nextInt();
         System.out.println("Nhap so b");
        int b = sc.nextInt();
        
        int cong = a + b;
        System.out.printf(" %d - %d = %d/n", a,b,cong);
        
        int hieu = a - b;
        System.out.printf(" %d - %d = %d/n", a,b,hieu);
        
        int tich = a * b;
        System.out.printf(" %d * %d = %d/n", a,b,tich);
        
        double thuong =(double)a / b;
        System.out.printf(" %d / %d = %f/n", a,b,thuong);
    
 
}

public static int tinhcong(int a, int b){ return a + b;}

public static int tinhhieu(int a, int b){return a - b;}

public static int tinhtich(int a, int b){return a * b;}
        
public static double tinhthuong( int a, int b){return (double) a / b;}

public static String tinhthuongmoi(int a, int b){if(b==0) { 
    return "Khong the chia cho 0";
}else {
    return Double.toString((double)a / b);
}
}
}
