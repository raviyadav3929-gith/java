import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter year: ");
        int n= sc.nextInt();
        if(n%4==0){
            System.out.println("LEAP YEAR");
        }
        System.out.println("NOT ALEAP YEAR");
    }
    
}
