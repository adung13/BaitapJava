import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class App88 {

    public static void main(String[] args) {
        HashMap<String, String> hasMapCity = new HashMap<>();
        hasMapCity.put("QN", "Quảng Ngãi");
        hasMapCity.put("QN", "Quảng Nam");
        hasMapCity.put("QN", "Quảng Ninh");
        hasMapCity.put("HCM", "Hồ Chí Minh");

        System.out.println("Danh sách các thành phố trong hasMapCity: ");
        Set<Map.Entry<String, String>> setCity = hasMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QN" + hasMapCity.get("QN"));
        System.out.println("NT" + hasMapCity.get("NT"));
        if (hasMapCity.containsValue("Thành phố Hồ Chí Minh"));
        System.out.println("Có Thành phố Hồ Chí Minh trong hasMapCity");
    }
}