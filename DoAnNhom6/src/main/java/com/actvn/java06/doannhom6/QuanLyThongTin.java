/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.doannhom6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyThongTin {

    private List<SinhVien> listStudent = new ArrayList<>();

    public List<SinhVien> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<SinhVien> listStudent) {
        this.listStudent = listStudent;
    }
    Scanner sc = new Scanner(System.in);

    private String inputName() {
        return sc.nextLine();
    }

    private String inputMaSV() {
        return sc.nextLine();
    }

    private String inputGioiTinh() {
        return sc.nextLine();
    }

    private String inputLop() {
        return sc.nextLine();
    }

    private LocalDate inputNgaySinh() {
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        LocalDate date = LocalDate.of(nam, thang, ngay);
        return date;
    }

    private String inputMaKhoa() {
        return sc.nextLine();
    }

    private QueQuan inputquequan() {
        String xa = sc.nextLine();
        String huyen = sc.nextLine();
        String tinh = sc.nextLine();
        QueQuan x = new QueQuan(xa, huyen, tinh);
        return x;
    }

    public void themSinhVien() {
        String name = inputName();
        String MaSV = inputMaSV();
        LocalDate NgaySinh = inputNgaySinh();
        String Lop = inputLop();
        QueQuan QueQuan = inputquequan();
        String Gioitinh = inputGioiTinh();
        String MaKhoa = inputMaKhoa();
        SinhVien sv = new SinhVien(MaSV, name, Lop, Gioitinh, QueQuan, NgaySinh, MaKhoa);
        listStudent.add(sv);
    }

    public void Updateinfor() {

    }
    

}
