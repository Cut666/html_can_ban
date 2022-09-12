package test.bai5;

import java.util.ArrayList;

public class Lop  {
    private String tenLop;
    public Lop(String tenLop, SinhVien sinhVien){
        this.tenLop=tenLop;
        this.sinhVien=sinhVien;

    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }
    private ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
    private SinhVien sinhVien;

    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "tenLop='" + tenLop + '\'' +
                ", sinhVien=" + sinhVien+
                '}';
    }
}

