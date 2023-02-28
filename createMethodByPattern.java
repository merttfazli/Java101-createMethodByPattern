import java.util.Scanner;

public class createMethodByPattern {
    public static void Pattern(int number){
        System.out.print(number+" ");
        if (number<=0){
         return;
        }
        Pattern(number-5);
        System.out.print(number+" ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int number =scan.nextInt();
        Pattern(number);
    }
}
