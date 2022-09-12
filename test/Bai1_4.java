package test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai1_4 {
    public static void main(String[] args) {
        baiTap4();
    }
    public static void baiTap1(){
        System.out.println("bai tap 1: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 so nguyen bat ky: ");
        int i = sc.nextInt();
        int n=0;
        while (i>0){
            if(i%2!=0){
                n++;
            }
            i/=10;
        }
        if (n==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void baiTap2(){

    }
    public static void baiTap3(){
        System.out.println("bai tap 3");
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("[0][0-9]{9}");
        while (true){
            System.out.print("nhap so dt: ");
            String s = sc.nextLine();
            if(p.matcher(s).find()){
                System.out.println(s);
                break;
            }
            else {
                System.err.println("nhap lai\n VD:0123456789");
            }
        }
    }
    public static void baiTap4(){
        Scanner sc = new Scanner(System.in);
        int [] i = {1,2,3,-4,5};
        int n=0;
        for (int j =0; j<5;j++) {
            int g = i[j];
            if(g<0){
              n++;
            }
        }
        if (n>0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
