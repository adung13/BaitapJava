import java.util.HashMap;
import java.util.TreeMap;
public class App78{
    public static void main(String[] args) {
        HashMap<Integer, Float> hasMap1 = new HashMap<>();
        HashMap<String, String> hasMap2 = new HashMap<>(10);
        HashMap<Double, Double> hasMap3 = new HashMap<>(4, 0.75f);
        HashMap<Float, Integer> hasMap4 = new HashMap<>(new TreeMap<>());
    }
}