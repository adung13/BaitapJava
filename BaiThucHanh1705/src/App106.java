import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class App106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
        System.out.println("Các entry có trong setTreeMap: ");
        System.out.println(setTreeMap);
    }
}