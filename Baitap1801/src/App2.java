import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner1Scanner = new Scanner(System.in);
        float D, Dx,Dy, x, y;
        System.out.println("a1*x + b1*y = c1");
        System.out.println("a2*x + b2*y = c2");
        System.out.println("Nhap a1: ");
        int a1 = scanner1Scanner.nextInt();
        System.out.println("Nhap b1: ");
        int b1 = scanner1Scanner.nextInt();
        System.out.println("Nhap c1: ");
        int c1 = scanner1Scanner.nextInt();
        System.out.println("Nhap a2: ");
        int a2 = scanner1Scanner.nextInt();
        System.out.println("Nhap b2: ");
        int b2 = scanner1Scanner.nextInt();
        System.out.println("Nhap c2: ");
        int c2 = scanner1Scanner.nextInt();
        
        D = a1*b2 - a2*b1;
        Dx = c1*b2 - c2*b1;
        Dy = a1*c2 - a2*c1;

        if (D == 0) {
            if (Dx + Dy == 0)
                System.out.println("He pt co vo so nghiem. ");
            else 
                System.out.println("He pt vo nghiem. ");
        }
        else {
            x = Dx / D;
            y = Dy / D;
            System.out.println("He pt co nghiem la: " + "x = " + x + " va y = " +y);
        }
    }
}
    
