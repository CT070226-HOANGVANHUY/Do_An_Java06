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
public class SinhVien {
    private String MaSV;
    private String Name;
    private String Gioitinh;
    private String quequan;
    private LocalDate Ngaysinh;
   


    public SinhVien(String MaSV, String Name, String Gioitinh, String quequan, LocalDate Ngaysinh) {
        this.MaSV = MaSV;
        this.Name = Name;
        this.Gioitinh = Gioitinh;
        this.quequan = quequan;
        this.Ngaysinh = Ngaysinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public LocalDate getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(LocalDate Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MaSV=" + MaSV + ", Name=" + Name + ", Gioitinh=" + Gioitinh + ", quequan=" + quequan + ", Ngaysinh=" + Ngaysinh + '}';
    }
    

   

    
    
}
