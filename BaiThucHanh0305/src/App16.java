import java.util.ArrayList;
public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("OPP");
        arrayListString.add("Ja");
        arrayListString.add("va");

        System.out.println("Cac phan tu trong arrL: ");
        for (int i = 0; i < arrayListString.size(); i++ )
           {
               System.out.println(arrayListString.get(i) + "\t");
           }
        
           arrayListString.set(5, "d");

        System.out.println("Cac phan tu sau khi thay doi: ");
        for (int i = 0; i < arrayListString.size(); i++ )
        {
            System.out.println(arrayListString.get(i) + "\t");
        }
    }
}
