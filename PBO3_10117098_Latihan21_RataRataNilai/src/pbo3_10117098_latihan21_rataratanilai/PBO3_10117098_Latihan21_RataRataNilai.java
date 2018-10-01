/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan21_rataratanilai;
import java.util.Scanner;
/**
 *
 * @author  
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menghitung nilai rata-
 *                     rata mahasiswa
 */
public class PBO3_10117098_Latihan21_RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nMhs;
        int nilaiMhs;
        double totalNilai;
        double rataNilai;

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
        totalNilai = 0; 
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilaiMhs = scn.nextInt();
            totalNilai += nilaiMhs; 
        }
        
        rataNilai = totalNilai/nMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataNilai);
    }
    
}
