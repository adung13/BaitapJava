import java.util.Scanner;
 class App2 {  public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap vao canh thu nhat a : ");double a = sc.nextDouble();
        System.out.println("nhap vao canh thu hai b : ");double b = sc.nextDouble();
        System.out.println("nhap vao canh thu ba c :");double c = sc.nextDouble();
        if ((a+b>c)&&(a+c>b)&&(b+c>a))
        
            System.out.println(" day la ba canh cua mot tam giac!");
        if ((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a))  System.out.println("(tam giac nay la tam giac vuông)");
        if ((a==b)&&(b==c))  System.out.println("(day la tam giac deu)");
        else if ((a==b)||(b==c)||(c==a))
        {
            System.out.println("(day la tam giac cân)");
        }
        
        else  System.out.println("day khong phai la ba canh cua 1 tam giac");
        
        
    }
}
    

