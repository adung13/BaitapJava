import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) throws Exception {
    
        java.util.ArrayList<Character> arrListChar = new ArrayList<>();

        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');

       java.util.ListIterator<Character>   listIterator = arrListChar.listIterator();

       System.out.print("Cac phan tu co trong arrListchar la: ");
       while(listIterator.hasNext())
       {
           System.out.print(listIterator.next() + "\t");
       }

    }
}
