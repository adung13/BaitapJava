  
    import java.util.Scanner;
public class App8 {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int max=0,n;
            do
            {
                System.out.println("nhap so: ");
                n=sc.nextInt();
                if(n%5==0 && n>max)
                {
                    max=n;
                }
            }while(n!=0);
            System.out.println("so lon nhat chia het cho 5 là: "+max);
            sc.close();
        }
    }
