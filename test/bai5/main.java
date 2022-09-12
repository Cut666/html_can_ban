package test.bai5;

import baitap.buoi6.theMuonSach;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= null;
        sc = new Scanner(System.in);
        QuanLySV ql= null;
        ql = new QuanLySV();
        try {
            int i=0;
            while (true) {

                System.out.println("Thong tin ho so sinh vien");
                System.out.println("Nhap so 1: nhap thong tin sinh vien");
                System.out.println("Nhap so 2: danh sach sinh vien");
                System.out.println("Nhap so 3: Thoat ung dung");
                String line = sc.nextLine();

                switch (line) {
                    case "1": {
                        System.out.println("Nhap ten lop: ");
                        String tenLop= sc.nextLine();
                        System.out.print("Nhap ho ten: ");
                        String tenSinhVien = sc.nextLine();
                        System.out.print("Nhap tuoi:");
                        String tuoiSinhVien = sc.nextLine();
                        System.out.print("Nhap que: ");
                        String queSinhVien = sc.nextLine();
                        SinhVien sinhVien = new SinhVien(tenSinhVien,tuoiSinhVien,queSinhVien);
                        Lop lop = new Lop(tenLop, sinhVien);
                        ql.themSV(lop);
                        System.out.println(lop.toString());
                        break;
                    }
                    case "2":{
                        ql.hienThi();
                        break;
                    }
                    case "3": {
                        return;
                    }
                    default:
                        System.out.println("Invalid");
                        continue;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
