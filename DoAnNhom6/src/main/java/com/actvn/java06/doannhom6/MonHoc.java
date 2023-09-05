/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.doannhom6;

/**
 *
 * @author Admin
 */
public class MonHoc {

    private String TenMon;
    private int SoTinChi;
    private double Diem;

    public MonHoc(String TenMon, int SoTinChi, double Diem) {
        this.TenMon = TenMon;
        this.SoTinChi = SoTinChi;
        this.Diem = Diem;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(int SoTinChi) {
        this.SoTinChi = SoTinChi;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
}