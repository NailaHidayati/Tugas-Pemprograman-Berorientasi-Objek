/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author LENOVO IDEAPAD 3
 */
public class Latihan8 {
    public static void main(String[] args) {
        String nama1,nama2;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Nama Lengkap Anda:");
        nama1 = inputan.nextLine();
        System.out.println("Halo..."+nama1+",ini adalah pengguna nextLine()");
        System.out.print("Masukan Nama Lengkap Anda:");
        nama2 = inputan.next();
        System.out.println("Halo..."+nama2+",ini adalah penggunaan next()");
    }
}
    

