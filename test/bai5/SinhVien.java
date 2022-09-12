package test.bai5;

public class SinhVien {
    private String tenSinhVien;
    private String tuoiSinhVien;
    private String queSinhVien;
    public SinhVien(String tenSinhVien,String tuoiSinhVien, String queSinhVien){
        this.tenSinhVien=tenSinhVien;
        this.tuoiSinhVien=tuoiSinhVien;
        this.queSinhVien=queSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getTuoiSinhVien() {
        return tuoiSinhVien;
    }

    public void setTuoiSinhVien(String tuoiSinhVien) {
        this.tuoiSinhVien = tuoiSinhVien;
    }

    public String getQueSinhVien() {
        return queSinhVien;
    }

    public void setQueSinhVien(String queSinhVien) {
        this.queSinhVien = queSinhVien;
    }

    @Override
    public String toString() {
        return "{" +
                "tenSinhVien='" + tenSinhVien + '\'' +
                ", tuoiSinhVien='" + tuoiSinhVien + '\'' +
                ", queSinhVien='" + queSinhVien + '\'' +
                '}';
    }
}
