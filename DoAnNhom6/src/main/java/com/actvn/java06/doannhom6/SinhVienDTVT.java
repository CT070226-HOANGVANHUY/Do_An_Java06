package com.actvn.java06.doannhom6;

import java.time.LocalDate;

public class SinhVienDTVT extends SinhVien {

    private String TenNganh;
    private String Lop;

    MonHoc cnmmt = new MonHoc("CONG NGHE MANG MAY TINH", 3);
    MonHoc ktd = new MonHoc("KI THUAT DIEN", 3);
    MonHoc thvht = new MonHoc("TIN HIEU VA HE THONG", 3);
    MonHoc tts = new MonHoc("THONG TIN SO", 3);
    MonHoc ktlt = new MonHoc("KI THUAT LAP TRINH", 3);
    MonHoc csdktd = new MonHoc("CO SO DIEU KHIEN TU DONG", 3);
    MonHoc ktvxl = new MonHoc("KI THUAT VI XU LI", 3);
    MonHoc dts = new MonHoc("DIEN TU SO", 3);
    MonHoc htvt = new MonHoc("HE THONG VIEN THONG", 3);
    MonHoc tkvms = new MonHoc("THIET KE VI MACH SO", 3);

    public SinhVienDTVT(String TenNganh, String Lop, String MaSV, String Name, String gioiTinh, String queQuan, LocalDate ngaySinh, String email) {
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
                cnmmt.getDiem(), 
                ktd.getDiem(), 
                thvht.getDiem(),
                tts.getDiem(),
                ktlt.getDiem(),
                csdktd.getDiem(),
                ktvxl.getDiem(),
                dts.getDiem(),
                htvt.getDiem(),
                tkvms.getDiem());
    }

}
