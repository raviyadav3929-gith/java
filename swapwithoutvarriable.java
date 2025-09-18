import java.util.Scanner;

public class swapwithoutvarriable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ener the number:");
     int num1= sc.nextInt();
     int num2= sc.nextInt();
     System.out.println("before swapping:"+num1+""+num2);
     num1 = num1+num2;
     num2 = num1-num2;
     num1 = num1-num2;
     System.out.println("afte swapping:"+num1+""+num2);
    }
}
