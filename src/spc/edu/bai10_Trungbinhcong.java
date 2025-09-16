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
public class bai10_Trungbinhcong {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh trung binh cong");
       
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so:");
        int so = nhap.nextInt();
        int tong =0;
        int dem =0;
        for (int i = 27; i <= 50; i++) {
            if (i % so == 0) {
                tong += i;
                dem++;
            }
        }
         if (dem > 0) {
            double trungbinh = (double) tong / dem;
            System.out.println("Trung binh cong cac so tu 27 den 50 chia het cho " + so + " la: " + trungbinh);
        } else {
            System.out.println("Khong co so nao 27 đến 50 chia het cho " + so + ".");
        }
    }
}
    