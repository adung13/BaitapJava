import java.util.Scanner;
import java.util.LinkedList;
public class App41 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("tháng 1");
        linkedList.add("tháng 2");
        linkedList.add("tháng 3");
        linkedList.add("tháng 4");
        linkedList.add("tháng 5");
        linkedList.add("tháng 6");
        linkedList.add("tháng 7");
        linkedList.add("tháng 8");
        linkedList.add("tháng 9");
        linkedList.add("tháng 10");
        linkedList.add("tháng 11");
        linkedList.add("tháng 12");
        
        System.out.println("Nhập vào chỉ số phần tử cần lấy:");
        int index = scanner.nextInt();
    
    if ((index < 0) || (index > (linkedList.size()-1 ))) {
        System.out.println("Chí số phải lớn hơn 0 và nhỏ hơn" + (linkedList.size()-1));

    } else {
        String node = linkedList.get(index);
        System.out.println("Phần tử có chỉ số =" + index + " trong linkedList là " + node);
    }
    String firstNode = linkedList.getFirst();
    String lastNode = linkedList.getLast();

    System.out.println("\nPhần tử đầu tiên trong danh sách là " + firstNode + " ; Phần tử cuối cùng trong danh sách là" + lastNode);
    }
}