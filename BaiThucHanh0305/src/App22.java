import java.util.ArrayList;
import java.util.Scanner;
public class App22 {
        public static void main (String [] args) {
            ArrayList<Integer> arrListIteger = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int number;

            System.out.println("Nhập số phần tử của ArrayList:");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập số phần tử thứ " + i + ": ");
                number = scanner.nextInt();
                arrListIteger.add(number);
            }
            int max = arrListIteger.get(0);
            for (int i = 1; i < arrListIteger.size(); i++) {
                if(arrListIteger.get(i).compareTo(max) > 0) {
                    max = arrListIteger.get(i);
                }
            }
            System.out.println("Phần tử lớn nhất trong arrListIteger =" + max);
        }
}