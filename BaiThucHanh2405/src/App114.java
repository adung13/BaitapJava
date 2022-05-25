import Sinhvien.Sinhvien;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;
public class App114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int lop;
        Map<Integer, SinhVien> lh = new HashMap<Integer, SinhVien>();
        System.out.println("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            lh.put(i, sv);
        }
        Set<Map.Entry<Integer, SinhVien>> sinhvien = lh.entrySet();
        System.out.println("Nhap ten lop: ");
        lop = sc.nextInt();
        for(Map.Entry<Integer, SinhVien> hm : sinhvien){
            if(lh.getOrDefault(key, defaultValue))
        }

    }
}