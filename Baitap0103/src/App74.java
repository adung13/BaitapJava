public class App74 {
    public static void main(String[] args) throws Exception {
        int[] array = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Kết quả là:"+sum);
    }
}