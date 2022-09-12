package test.bai5;

import java.util.ArrayList;
import java.util.List;

public class QuanLySV {
    private List<Lop>theList=new ArrayList<Lop>();
    public void themSV (Lop lop){
        theList.add(lop);
    }
    public void hienThi(){
        System.out.println(theList);
        return;
    }

}
