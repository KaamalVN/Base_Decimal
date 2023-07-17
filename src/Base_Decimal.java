import java.util.Scanner;

public class Base_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base = scanner.nextInt();
        int result=0,i=0;
        while(number>0){
            result+=(number%10)*(Math.pow(base,i));
            number/=10;
            i++;
        }
        System.out.println(result);
    }
}
