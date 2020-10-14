package com.puji;

public class PajakPPN {
    public static void main(String[] args) {
        System.out.println("=====Menghitung PPN sebesar 10%====");

        int DPP = 250000;
        int jumlahPPN;
        jumlahPPN = DPP * 10 / 100;

        System.out.println("Jumlah DPP/total pembelian sebesar Rp."+DPP);
        System.out.println("Maka, PPN yang dikenakan yaitu sebesar Rp."+jumlahPPN);
    }
}
