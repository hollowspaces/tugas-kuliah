/**
 * Created on Linux Ubuntu 2020. Using Intellij IDEA 2020.2.3
 * Membuat program untuk menghitung nilai akhir mahasiswa
 **/

package com.puji;
import java.util.Scanner;

public class NilaiAkhirMhs {
    public static void main(String[] args) {
        // Deklarasi Variabel
        float jmlKehadiran, tugas, UTS, UAS, nA, presKehadiran;
        String namaMhs, NIM, jenisKelamin, tglInput, mataKuliah, grade, ketNilai;

        // Membuat input
        Scanner input = new Scanner(System.in);

        System.out.println("Perhitungan Nilai Akhir Mahasiswa");
        System.out.println("Tanggal Input Nilai: ");
        tglInput = input.nextLine();
        System.out.println("Masukkan Nama Mahasiswa: ");
        namaMhs = input.nextLine();
        System.out.println("Masukkan NIM: ");
        NIM = input.nextLine();
        System.out.println("Masukkan Jenis Kelamin (P/L): ");
        jenisKelamin = input.nextLine();
        System.out.println("Masukkan Mata Kuliah: ");
        mataKuliah = input.nextLine();
        System.out.println("Masukkan Jumlah Absensi: ");
        jmlKehadiran = input.nextFloat();
        System.out.println("Masukkan Nilai Tugas: ");
        tugas = input.nextFloat();
        System.out.println("Masukkan Nilai UTS: ");
        UTS = input.nextFloat();
        System.out.println("Masukkan Nilai UAS: ");
        UAS = input.nextFloat();

        /*
        * Presentase kehadiran dihitung dari berapa banyak kehadiran
        * mahasiswa dari jumlah total 14 pertemuan selama 1 semester.
        * Sementara nilai akhir dihitung dengan presentase berikut:
        * Absensi/Presentase Kehadiran = 10%, Tugas 20%
        * UTS = 30%, UAS =40%
        */
        presKehadiran = jmlKehadiran / 14 * 100;
        nA = (presKehadiran * 10 / 100) + (tugas * 20 / 100)
                + (UTS * 30 / 100) + (UAS * 40 / 100);

        // Mencari keterangan kelulusan dengan control flow statement
        if (nA >= 80){
            grade = "A";
            ketNilai = "LULUS";
        } else if (nA <= 79.9 && nA >= 77){
            grade = "A-";
            ketNilai = "LULUS";
        } else if (nA <= 76.9 && nA >= 74){
            grade = "B+";
            ketNilai = "LULUS";
        } else if (nA <= 73.9 && nA >= 71){
            grade = "B";
            ketNilai = "LULUS";
        } else if (nA <= 70.9 && nA >= 68){
            grade = "B-";
            ketNilai = "LULUS";
        } else if (nA <= 67.9 && nA >= 64){
            grade = "C+";
            ketNilai = "LULUS";
        } else if (nA <= 63.9 && nA >= 60){
            grade = "C";
            ketNilai = "LULUS";
        } else if (nA <= 59 && nA >= 50){
            grade = "D";
            ketNilai = "TIDAK LULUS";
        } else {
            grade = "E";
            ketNilai = "TIDAK LULUS";
        }

        // Output
        System.out.println("\n=====Data Mahasiswa======");
        System.out.println("Tanggal Input: "+tglInput);
        System.out.println("Nama Mahasiswa: "+namaMhs);
        System.out.println("NIM: "+NIM);
        System.out.println("Jenis Kelamin: "+jenisKelamin);
        System.out.println("Mata Kuliah: "+mataKuliah);
        System.out.println("Absensi (%): "+presKehadiran);
        System.out.println("Nilai Tugas: "+tugas);
        System.out.println("Nilai UTS: "+UTS);
        System.out.println("Nilai UAS: "+UAS);
        System.out.println("Nilai Akhir: "+nA);
        System.out.println("Grade Nilai: "+grade);
        System.out.println("Keterangan: "+ketNilai);
    }
}
