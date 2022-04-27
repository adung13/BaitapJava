package Shapes;

import java.util.Scanner;


public class Point {
    private String ten;
    private double hoanh;
    private double tung;
public Point() {}

public String getTenDiem() {
    return ten;
}
public double getTungDo() {
    return tung;
}
public double getHoanhDo() {
    return hoanh;
}
public void setTenDiem(String ten) {
    this.ten = ten;
}
public void setTungDo(Double tung) {
    this.tung = tung;
}
public void setHoanhDo(Double hoanh) {
    this.hoanh = hoanh;
}
public Point(String ten, Double tung, Double hoanh) {
    setTenDiem(ten);
    setTungDo(tung);
    setHoanhDo(hoanh);
}
public void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ten diem: ");
    ten = sc.next();
    System.out.println("Nhap hoanh do: ");
    hoanh = sc.nextDouble();
    System.out.println("Nhap tung do:");
    tung = sc.nextDouble();
}
public void hienthi() {
    System.out.println( ten + "(" +tung + "," + hoanh + ")");
}

public double tinhKC(Point d2){
    return Math.sqrt((hoanh-d2.hoanh)*(hoanh-d2.tung)+(tung-d2.tung)*(tung-d2.tung));
}
}