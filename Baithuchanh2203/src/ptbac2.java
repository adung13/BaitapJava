import java.util.Scanner;

public class ptbac2 {
        float a, b, c, x1, x2, delta;
        public void nhapa(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap a: ");
            a = scanner.nextFloat();
            scanner.close();
        }
        
         public void nhapb() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap b: ");
            b = scanner.nextFloat();
            scanner.close();
        }
        public void nhapc() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap c: ");
            c = scanner.nextFloat();
            scanner.close();
        }
        public void tinhdelta(){
            delta = b * b - 4 * a * c ;
        }
        public void indelta() {
            System.out.println("delta =" + delta);
        }
        public void giaiptb2(){
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                x1 = x2 = (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep x1 = x2= " + x1);
            } else {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
            }
        }

    }