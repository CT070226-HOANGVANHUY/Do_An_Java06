/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.doannhom6;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Khoa_DTVT extends SinhVienDTVT{
    private List <MonHoc> MonDT = new ArrayList<>();

    public Khoa_DTVT(String TenNganh, String Lop, String MaSV, String Name, String Gioitinh, String quequan, LocalDate Ngaysinh) {
        super(TenNganh, Lop, MaSV, Name, Gioitinh, quequan, Ngaysinh);
    }

   
    public List<MonHoc> getMonDT() {
        return MonDT;
    }

    public void setMonDT(List<MonHoc> MonDT) {
        this.MonDT = MonDT;
    }
    
    
}
