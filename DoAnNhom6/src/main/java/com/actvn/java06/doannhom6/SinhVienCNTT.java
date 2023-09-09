package com.actvn.java06.doannhom6;

import java.time.LocalDate;

public class SinhVienCNTT extends SinhVien {

    private String TenNganh;
    private String Lop;

    MonHoc ctdl_va_gt = new MonHoc("CAU TRUC DU LIEU VA GIAI THUAT", 3);
    MonHoc mmt = new MonHoc("MANG MAY TINH", 3);
    MonHoc khdl = new MonHoc("KHOA HOC DU LIEU", 3);
    MonHoc ptuddd = new MonHoc("PHAT TRIEN UNG DUNG DI DONG", 3);
    MonHoc ktlt = new MonHoc("KI THUAT LAP TRINH", 3);
    MonHoc hdh = new MonHoc("HE DIEU HANH", 3);
    MonHoc qldapm = new MonHoc("QUAN LI DU AN PHAN MEM", 3);
    MonHoc lthdt = new MonHoc("LAP TRINH HUONG DOI TUONG", 3);
    MonHoc cdcs = new MonHoc("CHUYEN DE CO SO", 3);
    MonHoc pmnvdd = new MonHoc("PHAN MEM NHUNG VA DI DONG", 3);

    public SinhVienCNTT(String TenNganh, String Lop, String MaSV, String Name, String gioiTinh, String queQuan, LocalDate ngaySinh, String email) {
        super(MaSV, Name, gioiTinh, queQuan, ngaySinh, email);
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

    @Override
    public String toString() {
        return String.format("%15s%25s%10s%10s%15s%15s%50s%30s\n", getMaSV(), getName(), getTenNganh(), getLop(), getGioitinh(), getNgaysinh(), getQuequan(), getEmail());
    }
    
        public String WriteCSV() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f\n", getMaSV(),
                getName(),
                getTenNganh(),
                getLop(),
                getGioitinh(),
                getNgaysinh(), getQuequan(),
                getEmail(), 
                ctdl_va_gt.getDiem(), 
                mmt.getDiem(), 
                khdl.getDiem(),
                ptuddd.getDiem(),
                ktlt.getDiem(),
                hdh.getDiem(),
                qldapm.getDiem(),
                lthdt.getDiem(),
                cdcs.getDiem(),
                pmnvdd.getDiem());
    }

}
