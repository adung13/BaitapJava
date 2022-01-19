import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Double a, b, c, delta;
        System.out.println("Nhap a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        c = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        double d = b*b - 4*a*c;
        double x1;
        double x2;

        if (d > 0) {
            x1 = (float) ((-b + Math.sqrt(d)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(d)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (d == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
    