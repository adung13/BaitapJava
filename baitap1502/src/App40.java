import java.util.Scanner;

public class App40 {
    

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        switch(a) {
            case 2:
                System.out.println("Thu hai");
                break;
            case 3:
                System.out.println("Thu ba");
                break;
            case 4:
                System.out.println("Thu tu");
                break;
            case 5:
                System.out.println("Thu nam");
                break;
            case 6:
                System.out.println("Thu sau");
                break;
            case 7:
                System.out.println("Thu bay");
                break;
            case 8:
                System.out.println("Thu chu nhat");
                break;
            default:
                System.out.println("khong co thu " + a);
        }

    }
}
