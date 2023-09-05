/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.doannhom6;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class SinhVienDTVT extends SinhVien{
    private String TenNganh;
    private String Lop;

    public SinhVienDTVT(String TenNganh, String Lop, String MaSV, String Name, String Gioitinh, String quequan, LocalDate Ngaysinh) {
        super(MaSV, Name, Gioitinh, quequan, Ngaysinh);
        this.TenNganh = TenNganh;
        this.Lop = Lop;
    }

   

    public String getTenNganh() {
        return TenNganh;
    }

    public void setTenNganh(String TenNganh) {
        this.TenNganh = TenNganh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
    
    
    
    
        
    }
    

