import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) {
        LinkedList<Integer> songuyen = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap vao so phan tu cua ArrayList : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            number = sc.nextInt();
            songuyen.add(number);
        }
        LinkedList<Integer> sochan = new LinkedList<Integer>();
        for (int i = 0; i < songuyen.size(); i++) {
            if(songuyen.get(i) %2 == 0){
                sochan.add(songuyen.get(i));
            }
        }
        float sum = 0;
        for(int i= 0; i < sochan.size(); i++){
            sum = sum + sochan.get(i);
        }
        System.out.println("Trung  binh cong cac so nguyen duong chan = "+sum/sochan.size());

    }
}