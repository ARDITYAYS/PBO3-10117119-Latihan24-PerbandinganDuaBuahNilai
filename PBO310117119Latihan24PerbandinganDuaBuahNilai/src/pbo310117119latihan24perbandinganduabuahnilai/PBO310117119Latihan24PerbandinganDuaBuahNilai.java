/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan24perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini dapat membandingkan dua buah nilai
 */
public class PBO310117119Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a,b;
    String ulang;

    Scanner scanner = new Scanner (System.in);
        
        System.out.println("====PROGRAM PERBANDINGAN NILAI====");
                System.out.println("");

                do{
                System.out.print("Masukan Nilai Pertama : ");
                a = scanner.nextInt();

                System.out.print("Masukan Nilai Kedua   : ");
                b = scanner.nextInt();



                if (a < b) {
        System.out.println("Hasil : " + a + " Lebih Kecil dari " + b);
        }
        else if (a > b) {
        System.out.println("Hasil : " + a + " Lebih Besar dari " + b);
        }
        else
        System.out.println("Hasil : " + a + " Sama Dengan " + b);

        System.out.println("");
        System.out.print("Ulangi Aktifitas ? (YA/TIDAK) : ");
        ulang = scanner.next();

        System.out.println("");
        }
        while(!ulang.equals("TIDAK"));
        }
}