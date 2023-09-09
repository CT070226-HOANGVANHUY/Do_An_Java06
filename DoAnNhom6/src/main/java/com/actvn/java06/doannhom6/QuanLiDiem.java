package com.actvn.java06.doannhom6;

import com.actvn.java06.doannhom6.QuanLyThongTin;
import java.util.List;
import java.util.Scanner;

public class QuanLiDiem {

    public static Scanner sc = new Scanner(System.in);

    public static List<SinhVienATTT> svATTT = QuanLyThongTin.khoa_ATTT.getListSVATTT();
    public static List<SinhVienCNTT> svCNTT = QuanLyThongTin.khoa_CNTT.getListSVCNTT();
    public static List<SinhVienDTVT> svDTVT = QuanLyThongTin.khoa_DTVT.getListSVDTVT();

    static void nhapDiemTungMonKhoaATTT() {

        for (int i = 0; i < svATTT.size(); i++) {
            System.out.println(svATTT.get(i).getMaSV() + " - " + svATTT.get(i).getName() + " : ");
            System.out.println("_Nhap diem mon CAU TRUC DU LIEU VA GIAI THUAT : ");
            svATTT.get(i).ctdl_va_gt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon QUAN TRI AN TOAN HE THONG : ");
            svATTT.get(i).qtat_ht.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon NHAP MON MAT MA HOC : ");
            svATTT.get(i).nmmmh.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon GIAO THUC AN TOAN MANG : ");
            svATTT.get(i).gtatm.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon KI THUAT LAP TRINH : ");
            svATTT.get(i).ktlt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon THUAT TOAN TRONG AN TOAN THONG TIN : ");
            svATTT.get(i).tttattt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon TAN CONG VA PHONG THU HE THONG : ");
            svATTT.get(i).tcvptht.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon LAP TRINH HUONG DOI TUONG : ");
            svATTT.get(i).lthdt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon CHUYEN DE CO SO : ");
            svATTT.get(i).cdcs.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon KIEN TRUC MAY TINH VA HOP NGU : ");
            svATTT.get(i).ktmtvhn.setDiem(sc.nextDouble());

        }
    }

    static void hienThiDiemKhoaATTT() {
        for (int i = 0; i < svATTT.size(); i++) {
            System.out.printf("%-5s%15s%30s%10s%20s%20s%20s%20s%20s%20s%20s%20s%20s%20s\n\n", "STT", "MA SV", "HO VA TEN", "LOP",
                    "CTDLVGT",
                    "QTATHT",
                    "NMMMH",
                    "GTATM",
                    "KTLT",
                    "TTTATTT",
                    "TCVPTHT",
                    "LTHDT",
                    "CDCS",
                    "KTMTVHN");

            System.out.printf("%-5d", i + 1);
            System.out.printf("%15s%30s%10s%20f%20f%20f%20f%20f%20f%20f%20f%20f%20f\n", svATTT.get(i).getMaSV(), svATTT.get(i).getName(), svATTT.get(i).getLop(),
                    svATTT.get(i).ctdl_va_gt.getDiem(),
                    svATTT.get(i).qtat_ht.getDiem(),
                    svATTT.get(i).nmmmh.getDiem(),
                    svATTT.get(i).gtatm.getDiem(),
                    svATTT.get(i).ktlt.getDiem(),
                    svATTT.get(i).tttattt.getDiem(),
                    svATTT.get(i).tcvptht.getDiem(),
                    svATTT.get(i).lthdt.getDiem(),
                    svATTT.get(i).cdcs.getDiem(),
                    svATTT.get(i).ktmtvhn.getDiem());

        }

    }

    static void nhapDiemTungMonKhoaCNTT() {

        for (int i = 0; i < svCNTT.size(); i++) {
            System.out.println(svCNTT.get(i).getMaSV() + " - " + svCNTT.get(i).getName() + " : ");
            System.out.println("_Nhap diem mon CAU TRUC DU LIEU VA GIAI THUAT : ");
            svCNTT.get(i).ctdl_va_gt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon MANG MAY TINH : ");
            svCNTT.get(i).mmt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon KHOA HOC DU LIEU : ");
            svCNTT.get(i).khdl.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon PHAT TRIEN UNG DUNG DI DONG : ");
            svCNTT.get(i).ptuddd.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon KI THUAT LAP TRINH : ");
            svCNTT.get(i).ktlt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon HE DIEU HANH : ");
            svCNTT.get(i).hdh.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon QUAN LI DU AN PHAN MEM : ");
            svCNTT.get(i).qldapm.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon LAP TRINH HUONG DOI TUONG : ");
            svCNTT.get(i).lthdt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon CHUYEN DE CO SO : ");
            svCNTT.get(i).cdcs.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon PHAN MEM NHUNG VA DI DONG : ");
            svCNTT.get(i).pmnvdd.setDiem(sc.nextDouble());

        }
    }

    static void hienThiDiemKhoaCNTT() {
        for (int i = 0; i < svCNTT.size(); i++) {
            System.out.printf("%-5s%15s%30s%10s%20s%20s%20s%20s%20s%20s%20s%20s%20s%20s\n\n", "STT", "MA SV", "HO VA TEN", "LOP",
                    "CTDLVGT",
                    "MMT",
                    "KHDL",
                    "PTUDDD",
                    "KTLT",
                    "HDH",
                    "QLDAPM",
                    "LTHDT",
                    "CDCS",
                    "PMNVDD");

            System.out.printf("%-5d", i + 1);
            System.out.printf("%15s%30s%10s%20f%20f%20f%20f%20f%20f%20f%20f%20f%20f\n",
                    svCNTT.get(i).getMaSV(),
                    svCNTT.get(i).getName(),
                    svCNTT.get(i).getLop(),
                    svCNTT.get(i).ctdl_va_gt.getDiem(),
                    svCNTT.get(i).mmt.getDiem(),
                    svCNTT.get(i).khdl.getDiem(),
                    svCNTT.get(i).ptuddd.getDiem(),
                    svCNTT.get(i).ktlt.getDiem(),
                    svCNTT.get(i).hdh.getDiem(),
                    svCNTT.get(i).qldapm.getDiem(),
                    svCNTT.get(i).lthdt.getDiem(),
                    svCNTT.get(i).cdcs.getDiem(),
                    svCNTT.get(i).pmnvdd.getDiem());

        }

    }

    static void nhapDiemTungMonKhoaDTVT() {

        for (int i = 0; i < svDTVT.size(); i++) {
            System.out.println(svDTVT.get(i).getMaSV() + " - " + svDTVT.get(i).getName() + " : ");
            System.out.println("_Nhap diem mon CONG NGHE MANG MAY TINH : ");
            svDTVT.get(i).cnmmt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon KI THUAT DIEN : ");
            svDTVT.get(i).ktd.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon TIN HIEU VA HE THONG : ");
            svDTVT.get(i).thvht.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon THONG TIN SO : ");
            svDTVT.get(i).tts.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon KI THUAT LAP TRINH : ");
            svDTVT.get(i).ktlt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon CO SO DIEU KHIEN TU DONG : ");
            svDTVT.get(i).csdktd.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon KI THUAT VI XU LI : ");
            svDTVT.get(i).ktvxl.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon DIEN TU SO : ");
            svDTVT.get(i).dts.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon HE THONG VIEN THONG : ");
            svDTVT.get(i).htvt.setDiem(sc.nextDouble());

            System.out.println("_Nhap diem mon THIET KE VI MACH SO : ");
            svDTVT.get(i).tkvms.setDiem(sc.nextDouble());

        }
    }

    static void hienThiDiemKhoaDTVT() {
        for (int i = 0; i < svDTVT.size(); i++) {
            System.out.printf("%-5s%15s%30s%10s%20s%20s%20s%20s%20s%20s%20s%20s%20s%20s\n\n", "STT", "MA SV", "HO VA TEN", "LOP",
                    "CNMMT",
                    "KTD",
                    "THVHT",
                    "TTS",
                    "KTLT",
                    "CSDKTD",
                    "KTVXL",
                    "DTS",
                    "HTVT",
                    "TKVMS");

            System.out.printf("%-5d", i + 1);
            System.out.printf("%15s%30s%10s%20f%20f%20f%20f%20f%20f%20f%20f%20f%20f\n",
                    svDTVT.get(i).getMaSV(),
                    svDTVT.get(i).getName(),
                    svDTVT.get(i).getLop(),
                    svDTVT.get(i).cnmmt.getDiem(),
                    svDTVT.get(i).ktd.getDiem(),
                    svDTVT.get(i).thvht.getDiem(),
                    svDTVT.get(i).tts.getDiem(),
                    svDTVT.get(i).ktlt.getDiem(),
                    svDTVT.get(i).csdktd.getDiem(),
                    svDTVT.get(i).ktvxl.getDiem(),
                    svDTVT.get(i).dts.getDiem(),
                    svDTVT.get(i).htvt.getDiem(),
                    svDTVT.get(i).tkvms.getDiem());

        }

    }

    static void nhapDiem() {
        System.out.println("============ CHON KHOA CAN NHAP =============\n\n");
        System.out.println("1.Khoa ATTT.\n");
        System.out.println("2.Khoa CNTT.\n");
        System.out.println("3. Khoa DTVT.\n");
        System.out.println("_ lua chon cua ban : ");

        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                nhapDiemTungMonKhoaATTT();
                break;
            case 2:
                nhapDiemTungMonKhoaCNTT();
                break;
            case 3:
                nhapDiemTungMonKhoaDTVT();
                break;
        }
    }

    static void hienThiBangDiem() {
        System.out.println("============ CHON KHOA CAN HIEN THI =============\n\n");
        System.out.println("1.Khoa ATTT.\n");
        System.out.println("2.Khoa CNTT.\n");
        System.out.println("3. Khoa DTVT.\n");
        System.out.println("_ lua chon cua ban : ");

        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                hienThiDiemKhoaATTT();
                break;
            case 2:
                hienThiDiemKhoaCNTT();
                break;
            case 3:
                hienThiDiemKhoaDTVT();
                break;
        }
    }
}
