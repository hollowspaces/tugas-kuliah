package com.puji;

import java.util.Scanner;

public class PajakPPN2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung PPN sebesar 10%");

        System.out.println("Masukkan jumlah DPP: ");
        long inputDPP = input.nextLong();

        long jumlahPPN;
        jumlahPPN = inputDPP * 10 / 100;
        System.out.println("PPN yang dikenakan yaitu sebesar Rp."+jumlahPPN);
    }
}
