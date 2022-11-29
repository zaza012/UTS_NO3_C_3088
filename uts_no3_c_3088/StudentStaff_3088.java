/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.uts_no3_c_3088;

/**
 *
 * @author asus
 */
public class StudentStaff_3088 extends Mahasiswa_3088{
    int unitKerja_3088, jamKerja_3088;
    
    public double totalPendapatan_3088(){
        return (jamKerja_3088 * 30000);
    }
    public void tampilDataStudentStaff_3088(){
        super.tampilDataMhs_3088();
        System.out.println(" Unit Kerja : " + unitKerja_3088);
        System.out.println(" Jam Kerja : " +jamKerja_3088);
        System.out.println(" Total Pendapatan Student Staff : " + totalPendapatan_3088());
    }
}
