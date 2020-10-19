
/**
 * Created on Linux Ubuntu 2020. Using Intellij IDEA 2020.2.3
 * Tugas Pertemuan 4 nomor 1: Program untuk menghitung usia -> menggunakan fungsi/prosedur
 **/

package com.puji;

import java.util.Scanner;

public class HitungUmur2 {
    public static int hitungUsia(int thLahir, int thSkr){
        return thSkr-thLahir;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Masukkan tahun lahir: ");
        int tahunLahir = console.nextInt();
        int tahunSekarang = 2020;
        int usia = hitungUsia(tahunLahir, tahunSekarang);

        System.out.println("Kalian lahir di tahun "+tahunLahir+".");
        System.out.println("Sekarang sudah tahun "+tahunSekarang+".");
        System.out.println("Maka, usia sekarang adalah " +usia+" tahun.");
    }
}
