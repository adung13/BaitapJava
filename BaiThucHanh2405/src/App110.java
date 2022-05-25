import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) {
          int n;
         int number;
    ArrayList<Integer> arrayListInt = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhap so phan tu co trong ArrList: ");
    n = sc.nextInt();

    for (int i = 0; i <= n; i++)
    {
        System.out.println("Nhap phan tu thu" + i + ":");
        number = sc.nextInt();
        arrayListInt.add(number);
    }

    int max = arrayListInt.get(0);

    for (int i = 0; i <= arrayListInt.size(); i++)
    {
        if(arrayListInt.get(i).compareTo(max)>0)
        { max = arrayListInt.get(i); }

    }
    System.out.println("Phan tu lon nhat trong arrList la:" + max);
    
    System.out.println("Nhap phan tu can xoa: ");
    int a = sc.nextInt();
    for (int i=0; i<=arrayListInt.size(); i++)
    {
        if(arrayListInt.get(i)==a)
        {
            arrayListInt.remove(arrayListInt.get(i));
            System.out.print("Xoa phan tu co gia tri" + a + "ra");

        }
    }

    System.out.println("Cac phan tu sau khi sap xep: ");
    arrayListInt.sort((o1,o2) -> o1 - o2);
    System.out.println(arrayListInt);
}
}
