package Shapes;

import java.util.Scanner;
public class Quadrilateral extends Point{
    private Point A;
    private Point B;
    private Point C;
    private Point D;
    public Quadrilateral() {}
    public Quadrilateral(Point d1, Point d2, Point d3, Point d4) {
        A = d1;
        B = d2;
        C = d3;
        D = d4;
    }
    public double a () {
        double a = A.tinhKC(B);
        return (a);
    }
    public double b () {
        double b = B.tinhKC(C);
        return (b);
    }
    public double c () {
        double c = C.tinhKC(D);
        return (c);
    }
    public double d () {
        double d = D.tinhKC(A);
        return (d);
    }
    public static void main(String[] args) {
        Point A=new Point();
        A.nhap();
        Point B=new Point();
        B.nhap();
        Point C=new Point();
        C.nhap();
        Point D=new Point();
        Quadrilateral qua= new Quadrilateral(A,B,C,D);
        if(Math.pow(qua.a(), 2) + Math.pow(qua.b(), 2) == Math.pow(qua.c(), 2)&&
                Math.pow(qua.a(), 2) + Math.pow(qua.c(), 2) == Math.pow(qua.b(), 2)&&
                Math.pow(qua.b(), 2) + Math.pow(qua.c(), 2) == Math.pow(qua.a(), 2)){
            if (qua.a()==qua.b() && qua.a()==qua.c() && qua.a()==qua.d()){
                System.out.println("Hinh vuong");
            }
            else System.out.println("Hinh chu nhat");
        } else System.out.println("Tu giac!");
    }}