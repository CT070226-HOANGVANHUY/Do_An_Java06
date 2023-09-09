
package com.actvn.java06.doannhom6;

import static com.actvn.java06.doannhom6.QuanLiDiem.sc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quanl
 */
public class ReadAndWriteCSV {

    private String current = System.getProperty("user.dir");
    private String separator = File.separator;
    private String PATH_CSV_FILE_ATTT = current + separator + "ATTT.csv";
    private String PATH_CSV_FILE_CNTT = current + separator + "CNTT.csv";
    private String PATH_CSV_FILE_DTVT = current + separator + "DTVT.csv";

    //   -------------------------------------- ATTT ------------------------------------------- 
    public void ReadFileCSV_ATTT(Khoa_ATTT khoa_ATTT) throws FileNotFoundException {
        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_FILE_ATTT));
        List<SinhVienATTT> list = new ArrayList<>();
        String line;
        try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                SinhVienATTT sv = new SinhVienATTT(str[2], str[3], str[0], str[1], str[4], str[6], LocalDate.parse(str[5]), str[7]);
                sv.ctdl_va_gt.setDiem(Double.parseDouble(str[8]));
                sv.qtat_ht.setDiem(Double.parseDouble(str[9]));
                sv.nmmmh.setDiem(Double.parseDouble(str[10]));
                sv.gtatm.setDiem(Double.parseDouble(str[11]));
                sv.ktlt.setDiem(Double.parseDouble(str[12]));
                sv.tttattt.setDiem(Double.parseDouble(str[13]));
                sv.tcvptht.setDiem(Double.parseDouble(str[14]));
                sv.lthdt.setDiem(Double.parseDouble(str[15]));
                sv.cdcs.setDiem(Double.parseDouble(str[16]));
                sv.ktmtvhn.setDiem(Double.parseDouble(str[17]));
                list.add(sv);
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        khoa_ATTT.setListSVATTT(list);
    }

    public void WriteFileCSV_ATTT(Khoa_ATTT khoa_ATTT) {
        //ghi file
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_ATTT));
            for (SinhVienATTT student2 : khoa_ATTT.getListSVATTT()) {
                bw.append(student2.WriteCSV());
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //------------------------------------------ CNTT -------------------------------------------------------

    public void ReadFileCSV_CNTT(Khoa_CNTT khoa_CNTT) throws FileNotFoundException {
        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_FILE_ATTT));
        List<SinhVienCNTT> list = new ArrayList<>();
        String line;
        try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                SinhVienCNTT sv = new SinhVienCNTT(str[2], str[3], str[0], str[1], str[4], str[6], LocalDate.parse(str[5]), str[7]);
                sv.ctdl_va_gt.setDiem(Double.parseDouble(str[8]));
                sv.mmt.setDiem(Double.parseDouble(str[9]));
                sv.khdl.setDiem(Double.parseDouble(str[10]));
                sv.ptuddd.setDiem(Double.parseDouble(str[11]));
                sv.ktlt.setDiem(Double.parseDouble(str[12]));
                sv.hdh.setDiem(Double.parseDouble(str[13]));
                sv.qldapm.setDiem(Double.parseDouble(str[14]));
                sv.lthdt.setDiem(Double.parseDouble(str[15]));
                sv.cdcs.setDiem(Double.parseDouble(str[16]));
                sv.pmnvdd.setDiem(Double.parseDouble(str[17]));
                list.add(sv);
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        khoa_CNTT.setListSVCNTT(list);
    }

    public void WriteFileCSV_CNTT(Khoa_CNTT khoa_CNTT) {
        //ghi file
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_CNTT));
            for (SinhVienCNTT student2 : khoa_CNTT.getListSVCNTT()) {
                bw.append(student2.WriteCSV());
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
  //--------------------------------------------- DTVT -----------------------------------------------
    
        public void ReadFileCSV_DTVT(Khoa_DTVT khoa_DTVT) throws FileNotFoundException {
        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_FILE_DTVT));
        List<SinhVienDTVT> list = new ArrayList<>();
        String line;
        try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                SinhVienDTVT sv = new SinhVienDTVT(str[2], str[3], str[0], str[1], str[4], str[6], LocalDate.parse(str[5]), str[7]);
                sv.cnmmt.setDiem(Double.parseDouble(str[8]));
                sv.ktd.setDiem(Double.parseDouble(str[9]));
                sv.thvht.setDiem(Double.parseDouble(str[10]));
                sv.tts.setDiem(Double.parseDouble(str[11]));
                sv.ktlt.setDiem(Double.parseDouble(str[12]));
                sv.csdktd.setDiem(Double.parseDouble(str[13]));
                sv.ktvxl.setDiem(Double.parseDouble(str[14]));
                sv.dts.setDiem(Double.parseDouble(str[15]));
                sv.htvt.setDiem(Double.parseDouble(str[16]));
                sv.tkvms.setDiem(Double.parseDouble(str[17]));
                list.add(sv);
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        khoa_DTVT.setListSVDTVT(list);
    }

    public void WriteFileCSV_DTVT(Khoa_DTVT khoa_DTVT) {
        //ghi file
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_DTVT));
            for (SinhVienDTVT student2 : khoa_DTVT.getListSVDTVT()) {
                bw.append(student2.WriteCSV());
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
