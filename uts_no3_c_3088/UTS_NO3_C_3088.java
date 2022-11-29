/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.java.uts_no3_c_3088;

/**
 *
 * @author asus
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO3_C_3088 {

    public static void main(String[] args) {
        AsistenPraktikum_3088[] ap = new AsistenPraktikum_3088[1];
        StudentStaff_3088[] ss = new StudentStaff_3088[1];
        
        ap[0] = new AsistenPraktikum_3088();
        ss[0] = new StudentStaff_3088();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data asisten praktikum
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim_3088 = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama_3088 = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan_3088 = br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk_3088 = Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsisten_3088 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan_3088 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data asisten Praktikum
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3088 AP : ap){
                AP.tampilDataAsistenPraktikum_3088();
                System.out.println("");
            }

            //mengisi data ke array pada data studentstaff
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim_3088 = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama_3088 = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan_3088 = br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk_3088 = Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja_3088 = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja_3088 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data student staff
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3088 SS : ss){
                SS.tampilDataStudentStaff_3088();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
