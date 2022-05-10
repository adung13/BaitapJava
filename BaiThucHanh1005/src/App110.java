import java.util.ArrayList;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) {
        ArrayList<Integer> songuyen = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap vao so phan tu cua ArrayList : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            number = sc.nextInt();
            songuyen.add(number);
        }
        int max = songuyen.get(0);

        for (int i = 1; i < songuyen.size(); i++) {
            if (songuyen.get(i).compareTo(max) > 0) {
                max = songuyen.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arraylist la : " + max);
        
        
        System.out.print("Nhap a: ");
        int a = sc.nextInt(); 
        for (int i = 0; i < songuyen.size(); i++) {
            if (songuyen.get(i)== a) {
                songuyen.remove(songuyen.get(i));
                System.out.println("Xoa cac phan tu co gia tri = "+ a+" ra khoi arrayList ");

            }
        }     
         
    System.out.println("Cac phan tu co trong arraylist sap xep tu nho den lon la : ");
    songuyen.sort((o1, o2) -> o1 - o2);
    System.out.println(songuyen);
    }
            
        
}