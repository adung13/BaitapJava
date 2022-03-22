import java.util.Scanner;

public class sinhvien{
    Scanner sc = new Scanner(System.in);
    String MaSinhVien;
    String HoTen;
    Boolean gioiTinh;
    String Diachi;
    String dob;
     
    void nhapMaSinhVien() {
        System.out.println("Hay nhap Ma Sinh Vien ");
        Scanner sc = new Scanner(System.in);
        MaSinhVien = sc.nextLine();
        sc.close();
    }

    void nhapHoTen() {
        System.out.println("Hay nhap Ho Ten ");
        Scanner sc = new Scanner(System.in);
        HoTen = sc.nextLine();
        sc.close();
    }

    void nhapgioiTinh() {
        System.out.println("Hay nhap gioi tinh ");
        Scanner sc = new Scanner(System.in);
        gioiTinh = sc.nextBoolean();
        sc.close();
    }

    void nhapDiaChi() {
        System.out.println("Hay nhap Dia chi  ");
        Scanner sc = new Scanner(System.in);
        Diachi = sc.nextLine();
        sc.close();
    }

    void nhapNgaysinh() {
        System.out.println("Hay nhap ngay sinh  ");
        Scanner sc = new Scanner(System.in);
        dob = sc.nextLine();
        sc.close();
    }

    void inMaSinhVien() {
        System.out.println("Ma sinh vien cua ban la " + MaSinhVien);
    }

    void inHoTen() {
        System.out.println("Ho ten cua ban la " + HoTen);
    }

    void ingioiTinh() {
        System.out.println("Gioi tinh cua ban la " + gioiTinh);
    }

    void inDiaChi() {
        System.out.println("Dia chi cua ban la " + Diachi);
    }

    void inNgaySinh() {
        System.out.println("Ngay sinh cua ban la " + dob);
    }
  
}