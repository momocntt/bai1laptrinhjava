/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;



/**
 *
 * @author Administrator
 */
public class bai13_Break {
    public static void main(String[] args) {
        System.out.println("Dung break va continue");
    
    for (int i = 2; i<=20 ;i++ ){
        if (i == 4 ){
            System.out.println("Bo qua bang"+i);
            continue;
        }
        if (i == 8 ){
            System.out.println("Dung tai bang"+i);
            break;
        }
         System.out.println("Bang cuu chuong : " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
    }
    }
}
