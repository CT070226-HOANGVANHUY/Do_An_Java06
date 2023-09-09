package com.actvn.java06.doannhom6;

import com.actvn.java06.doannhom6.QuanLyThongTin;
import com.actvn.java06.doannhom6.QuanLiDiem;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void Menu_1() {
        System.out.println("====================== QUAN LI THONG TIN =======================");
        System.out.println("I.   THEM MOI 1 SINH VIEN.");
        System.out.println("II.  HIEN THI DANH SACH SINH VIEN. ");
        System.out.println("III. SUA THONG TIN 1 SINH VIEN.");
        System.out.println("IV.  XOA MOT SINH VIEN.");
        System.out.println("V.   XUAT FILE SINH VIEN.");
        System.out.println("VI.  LOC THONG TIN SINH VIEN.");
        System.out.println("VII. THOAT PHAN QUAN LI THONG TIN.");
        System.out.println("    _Moi ban chon chuc nang : ");

    }

    static void Menu_2() {
        System.out.println("====================== QUAN LI DIEM =======================");
        System.out.println("I.   THEM DIEM CAC MON HOC CHO TUNG SINH VIEN.");
        System.out.println("II.  XUAT BANG DIEM CAC MON HOC. ");
        System.out.println("III. THOAT PHAN QUAN LI DIEM.");

        System.out.println("    _Moi ban chon chuc nang : ");

    }

    static void MenuChinh() {

        System.out.println("\t============================ PHAN MEM QUAN LI SINH VIEN ================================\n\n");
        System.out.println("\t\tPHAN 1 . QUAN LI THONG TIN SINH VIEN.\n");
        System.out.println("\t\tPHAN 2 . QUAN LI DIEM.\n");
        System.out.println("\t\tPHAN 3 . KET THUC CHUONG TRINH.\n");
        System.out.println("\t\t _Ban chon phan : ");
    }

    public static void main(String[] args) throws FileNotFoundException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        Scanner sc = new Scanner(System.in);

        int luachon1, luachon2;
        do {
            MenuChinh();
            luachon1 = sc.nextInt();
            
            switch (luachon1) {
                case 1:
                    do {
                        Menu_1();
                        luachon2 = sc.nextInt();
                        switch (luachon2) {
                            case 1:
                                sc.nextLine();
                                QuanLyThongTin.themMoiSinhVien();
                                System.out.println("");
                                break;
                            case 2:
                                QuanLyThongTin.hienThiThongTin();
                                System.out.println("");
                                break;
                            case 3:
                                QuanLyThongTin.suaThongTin();
                                System.out.println("");
                                break;
                            case 4:
                                QuanLyThongTin.xoaSinhVien();
                                System.out.println("");
                                break;
                            case 5:
                                QuanLyThongTin.xuatFileSinhVien();
                                break;
                            case 6:
                                QuanLyThongTin.timKiemLocDanhSach();
                                System.out.println("");
                                break;
                            default:
                                break;
                        }

                    } while (luachon2 != 7);
                    break;

                case 2:
                    int chon;
                    Menu_2();
                    do {
                        chon = sc.nextInt();
                        switch (chon) {
                            case 1:
                                QuanLiDiem.nhapDiem();
                                break;
                            case 2:
                                QuanLiDiem.hienThiBangDiem();
                                break;
                            case 3:
                                break;
                        }

                    } while (chon != 3);
                    break;
                case 3:
                    System.out.println("CAM ON DA TRAI NGHIEM PHAN MEM !!!!");
                    System.out.println("\t GOOD BYE. ");
                    break;
            }

        } while (luachon1 != 3);
    }
}
