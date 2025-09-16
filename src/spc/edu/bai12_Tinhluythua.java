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
public class bai12_Tinhluythua {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh luy thua");
       
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap so (a): ");
        int a = nhap.nextInt();
        System.out.print("Nhap so mu(b - so nguyen khong am): ");
        int b = nhap.nextInt();
        if (b < 0) {
            System.out.println("So mu phai la so nguyen khong am");
            return;
        }
        long ketQua = 1;
        for (int i = 1; i <= b; i++) {
            ketQua *= a;
        }
        System.out.println(a + " ^ " + b + " = " + ketQua);
    }
}
       
