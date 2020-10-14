package com.puji;

public class HitungUmur {
    public static void main(String[] args) {
        int tahunLahir = 2000;
        int tahunSekarang = 2020;
        int usia = tahunSekarang - tahunLahir;

        System.out.println("Kalian lahir di tahun "+tahunLahir+".");
        System.out.println("Sekarang sudah tahun "+tahunSekarang+".");
        System.out.println("Maka, usia sekarang adalah " +usia+" tahun.");
    }
}
