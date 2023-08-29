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
    private String Lop;
    private String Gioitinh;
    private QueQuan quequan;
    private LocalDate Ngaysinh;
    private String MaKhoa;

    public SinhVien(String MaSV, String Name, String Lop, String Gioitinh, QueQuan quequan, LocalDate Ngaysinh, String MaKhoa) {
        this.MaSV = MaSV;
        this.Name = Name;
        this.Lop = Lop;
        this.Gioitinh = Gioitinh;
        this.quequan = quequan;
        this.Ngaysinh = Ngaysinh;
        this.MaKhoa = MaKhoa;
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

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public QueQuan getQuequan() {
        return quequan;
    }

    public void setQuequan(QueQuan quequan) {
        this.quequan = quequan;
    }

    public LocalDate getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(LocalDate Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
    
}
