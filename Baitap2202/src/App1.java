import java.util.Scanner;
public class App1 {
 
        public static int USCLN(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return USCLN(b, a % b);
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            
            System.out.print("Nhap vao so nguyen a = ");
            int a = sc.nextInt();
            System.out.print("Nhap vao so nguyen b = ");
            int b = sc.nextInt();
    
            System.out.println("Uoc so chung lon nhat la: " + USCLN(a, b));
            
        }
}
