import java.util.Scanner;
public class App6 {
    public static boolean SHH(int n) {
        int tong =0;
        for(int i=1; i<n;i++) {
            if(n%i==0) {
                tong+=i;
            }
        }
        if(tong==n) {
            return true;
        } else 
        return false;
    }
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap n:" );
            n= sc.nextInt();      
            System.out.println("cac so hoan hao nho hon "+n+" la: ");   
            for(int i=1;i<=n;i++) {
                if(SHH(i)==true) {
                    System.out.print(i+"\t");
                }
            }
            sc.close();
        }
    }

