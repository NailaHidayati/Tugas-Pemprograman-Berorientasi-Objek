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
public class Soal3 {
    public static void main(String[] args) {
        String nama;
        String nim;
        String semester;
        String kelas;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukan Nama : ");
        nama = inputan.nextLine();
        System.out.println("Masukan Nim : ");
        nim = inputan.nextLine();
        System.out.println("Masukan Semester : ");
        semester = inputan.nextLine();
        System.out.println("Masukan Kelas : ");
        kelas = inputan.nextLine();
        System.out.println("+Nama");
        System.out.println("+Nim");
        System.out.println("+Semester");
        System.out.println("+Kelas");
    }
}
