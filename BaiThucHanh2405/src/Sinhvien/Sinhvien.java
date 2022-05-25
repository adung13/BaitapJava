package Demo;
import java.util.Scanner;

public class SinhVien {
public String id,name;
public int lop;
Scanner sc = new Scanner(System.in);
    public SinhVien() {
    }

    public SinhVien(String a, String b, Integer c) {
        this.id = a;
        this.name = b;
        this.lop = c;
    }

    public void nhap(){
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("NAME: ");
        name = sc.nextLine();
        System.out.println("CLASS: ");
        lop = sc.nextInt();
    }

  
    public String xuat(){
        return "ID = " +  id + ", NAME =" + name + ", CLASS =" + lop;
    }

}