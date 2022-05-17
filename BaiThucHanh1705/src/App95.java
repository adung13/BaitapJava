import java.util.LinkedHashMap;
import java.util.Set;

public class App95 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedhm = new LinkedHashMap<Integer, String>();
        linkedhm.put(1, "Java");
        linkedhm.put(2, "C++"); 
        linkedhm.put(3, "PHP");
        linkedhm.put(4, "Python");
        System.out.println("Before remove: ");
        show(linkedhm);

        linkedhm.remove(2);
        System.out.println("After remove: ");
        show(linkedhm);
}
    public static void show(LinkedHashMap<Integer, String> linkedhm) {
        Set<Integer> keySet = linkedhm.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedhm.get(key));
        }
    }
}