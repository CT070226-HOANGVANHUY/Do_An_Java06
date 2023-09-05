/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.doannhom6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    static void Menu() {
        System.out.println("=============MENU==========");
        System.out.println("1. Them sinh vien.");
        System.out.println("2. Tim kiem thong tin bang ma sinh vien");
        System.out.println("3. Xuat danh sach sinh vien.");
        System.out.println("4. Loc danh sach.");
        System.out.println("5. Sap xep MSV.");
        System.out.println("6. Ket thuc.");
        System.out.println("MOI BAN NHAP LUA CHON.");
    }

    public static void main(String[] args) {
        QuanLy quanly = new QuanLy();
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        do {
            Menu();
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1://them sv
                    quanly.inputSV();
                    break;
                case 2://tim kiem thong tin bang masv
                    System.out.print("Nhap ma sinh vien ban can tim: ");
                    String MaSv = sc.nextLine();
                    SinhVien ketqua = quanly.timkiemSV(MaSv);
                    if (ketqua != null) {
                        System.out.println("Sinh vien ban can tim la: ");
                        System.out.println(ketqua);
                    } else {
                        System.out.println("Ma sinh vien khong ton tai!");

                    }
                    break;

                case 3:// xuat danh sach
                    quanly.PrintSv();
                    break;

            }

        } while (luachon != 6);

    }
}
