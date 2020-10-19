package com.puji;
import java.util.Scanner;

public class PPN {
    // Fungsi untuk menghitung PPN
    public static long hitungPPN(long DPP){
        return (DPP * 10 / 100);
    }

    // Fungsi untuk menampilkan output perhitungan PPN
    public static void showResult(long input) {
        // memanggil fungsi hitungPPN untuk menghitung PPN dari nilai DPP yang sudah diinput
        long jumlahPPN = hitungPPN(input);
        // menampilkan output
        System.out.println("PPN yang dikenakan yaitu sebesar Rp."+jumlahPPN);
    }

    // Fungsi utama
    public static void main(String[] args) {
        System.out.println("Menghitung PPN sebesar 10%");
        // Membuat input nilai
        System.out.println("Masukkan jumlah DPP: ");
        Scanner input = new Scanner(System.in);
        long inputDPP = input.nextLong();
        // Memanggil fungsi showResult untuk menampilkan hasil perhitungan PPN
        showResult(inputDPP);
    }
}



