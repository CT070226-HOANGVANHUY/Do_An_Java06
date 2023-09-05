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
public class Khoa_ATTT extends SinhVienATTT{
    private List <MonHoc> MonAT = new ArrayList<>();

    public List<MonHoc> getMonAT() {
        return MonAT;
    }

    public void setMonAT(List<MonHoc> MonAT) {
        this.MonAT = MonAT;
    }

    public Khoa_ATTT(String TenNganh, String Lop, String MaSV, String Name, String Gioitinh, String quequan, LocalDate Ngaysinh) {
        super(TenNganh, Lop, MaSV, Name, Gioitinh, quequan, Ngaysinh);
    }
    

    
    
   
   
            
    
    
    
}
