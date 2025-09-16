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
public class bai15_giaithua {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh giai thua");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = nhap.nextInt();
        long giaiThua = 1;
        for (int i = 1; i<= n ; i++) {
        giaiThua *= i;
    }
        System.out.println(n + "!=" + giaiThua);
}
}