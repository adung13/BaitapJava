import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        double a, b, min;
        Scanner scanner35Scanner = new Scanner(System.in);
             
        System.out.println("Nhập vào số bất kỳ: ");
        a = scanner35Scanner.nextDouble();
        b = scanner35Scanner.nextDouble();
        
        min = a < b ? a : b; 
        System.out.println("Gia tri nho nhat la:  " + min );

    }
}
