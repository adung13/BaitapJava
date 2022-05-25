import java.util.LinkedList;
import java.util.Scanner;

import java.util.Scanner;
import java.util.LinkedList;

public class App111 {
    public static void main(String[] args) {
    int sum = 0, count = 0;    
    double TBC;
LinkedList<Integer> linkedListInt = new LinkedList<>();
Scanner sc = new Scanner(System.in);   

System.out.println("Nhap vao so phan tu: ");
int n = sc.nextInt();

for(int i=0; i<=linkedListInt.size(); i++)
{
    System.out.println("Nhap phan tu thu" + i + ":");
    int number = sc.nextInt();
    linkedListInt.add(number);
}

for(int i=0; i<=linkedListInt.size(); i++)
{
    if(linkedListInt.get(i)%2==0)
       {
           sum= sum + linkedListInt.get(i);
           count++;
       }

}

TBC = (double)sum/count;
System.out.println("Trung binh cong cac so chan trong danh sach la: " + TBC);

    }
}
