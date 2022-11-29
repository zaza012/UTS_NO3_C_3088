/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.uts_no3_c_3088;

/**
 *
 * @author asus
 */
public class AsistenPraktikum_3088 extends Mahasiswa_3088{
    String mkAsisten_3088;
    int jmlPertemuan_3088;
    
    public double totalPendapatan_3088(){
        return(jmlPertemuan_3088 * 50000);
    }
    public void tampilDataAsistenPraktikum_3088() {
        super.tampilDataMhs_3088();
        System.out.println("Mata Kuliah         : " + mkAsisten_3088);
        System.out.println("Jumlah Pertemuan    : " + jmlPertemuan_3088);
        System.out.println("Total Pendapatan    : " + totalPendapatan_3088());
    }
}
