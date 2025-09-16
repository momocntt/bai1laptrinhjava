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
public class bai8_Hinhtron {
    public static void main(String[] args) {
        System.err.println("chuong trinh tinh dien tich chu vi hinh tron");
        Scanner nhap = new Scanner(System.in);
        double bankinh, chuvi, dientich ;
        System.out.println("nhap ban kinh:");
        bankinh = nhap.nextDouble();
        if (bankinh <= 0) {
            System.out.println("Ban kinh phai lon hon 0.");
        } else {
           
            chuvi = 2 * Math.PI * bankinh;  
            dientich = Math.PI * Math.pow(bankinh, 2); 

            
            System.out.println("Chu vi hinh tron la: " + chuvi);
            System.out.println("Dien tich hinh tron la: " + dientich);
        }

       
    }
    
}
    
