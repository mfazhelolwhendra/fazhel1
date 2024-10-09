package Percabangan;

import java.util.Scanner;

public class Percabangan1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        final int GAJI_POKOK = 5000000;
        final int UANG_LEMBUR_PER_JAM = 50000;
        
        int masaKerja;
        int jamKerja;
        int totalGaji;
        double tambahan = 0;
        
        // Membaca input dari user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();
        
        System.out.print("Masukkan jumlah jam kerja dalam 1 bulan: ");
        jamKerja = scanner.nextInt();
        
        // Hitung tambahan berdasarkan masa kerja
        if (masaKerja < 5) {
            tambahan = 0;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tambahan = GAJI_POKOK * 0.05;
        } else {
            tambahan = GAJI_POKOK * 0.10;
        }
        
        // Hitung jam lembur
        int jamLembur = 0;
        if (jamKerja > 40) {
            jamLembur = jamKerja - 40;
        }
        
        // Hitung total gaji
        totalGaji = GAJI_POKOK + (int) tambahan + (jamLembur * UANG_LEMBUR_PER_JAM);
        
        // Tampilkan total gaji
        System.out.println("Total gaji yang diterima: Rp " + totalGaji);
        
        // Tutup scanner
        scanner.close();
    }
}