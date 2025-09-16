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
public class bai7_hinhchunhat {
    public static void main(String[] args) {
        System.err.println("Chuong trinh tinh dien tich chu vi hinh chu nhat");
        Scanner nhap = new Scanner(System.in);
        double chieudai, chieurong, dientich, chuvi;
        System.out.println("nhap chieu dai:");
        chieudai = nhap.nextDouble();
        System.out.println("nhap chieu rong:");
        chieurong = nhap.nextDouble();
        if (chieudai <= 0 || chieurong <= 0) {
            System.out.println("Chieu dai va chieu rong phai lon hon 0.");
        } else {
            // Tính chu vi và diện tích
            chuvi = 2 * (chieudai + chieurong);
            dientich = chieudai * chieurong;

            // In kết quả
            System.out.println("Chu vi hinh chu nhat la: " + chuvi);
            System.out.println("Dien tich hinh chu nhat la: " + dientich);
        }
    }
}

