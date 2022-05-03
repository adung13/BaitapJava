import java.util.LinkedList;
public class App38 {
    public static void main (String [] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("JAVA");
        list.add("C++");
        list.add("PHP");
        list.add("JAVA");

        System.out.println("\nví dụ sử dụng phương pháp addAll(");
        System.out.println("-----------------------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA");
        showList(listA);
        
        System.out.println("\nví dụ sử dụng phương pháp retainAll()");
        System.out.println("---------------------------------");

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("JAVA");
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nví dụ sử dụng phương pháp removeAll()");
        System.out.println("-----------------------------------");
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);
    }
    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");    
        }
        System.out.println();
    }
}