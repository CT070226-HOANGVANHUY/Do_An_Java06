/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class QuanLy {

    Scanner sc = new Scanner(System.in);

    private List<SinhVien> listSV;

    public QuanLy() {
        listSV = new ArrayList<>();
    }

    public void themSV(SinhVien sv) {
        listSV.add(sv);
    }

    public void inputSV() {
        System.out.print("Nhap ma sinh vien: ");
        String MaSV = sc.nextLine();
        System.out.print("Nhap ho va ten sinh vien: ");
        String Name = sc.nextLine();
        System.out.print("Nhap gioi tinh sinh vien: ");
        String Gioitinh = sc.nextLine();
        System.out.print("Nhap que quan sinh vien: ");
        String quequan = sc.nextLine();
        System.out.println("Nhap ngay thang nam sinh cua sinh vien.");
        System.out.print("Nhap ngay sinh: ");
        int d = sc.nextInt();
        System.out.print("Nhap thang sinh: ");
        int m = sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        int y = sc.nextInt();
        sc.nextLine();
        LocalDate Ngaysinh = LocalDate.of(y, m, d);
        SinhVien sinhvien = new SinhVien(MaSV, Name, Gioitinh, quequan, Ngaysinh);
        themSV(sinhvien);
        System.out.println("Them thanh cong!");
    }
    public void PrintSv()
    {
        for (SinhVien sv : listSV)
        {
            System.out.println(sv);
        }
    }
    public SinhVien timkiemSV(String MaSV)
    {
        for(SinhVien sv:listSV)
        {
            if(sv.getMaSV()== MaSV)
            {
                return sv;
            }
        }
        return null;
    }

}
