import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Number : ");
        int number = input.nextInt();
        int sum = 0;
        for(int i=1;i<number;i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(sum == number){
            System.out.println(number+" sayısı mükemmel bir sayıdır.");
        }
        else{
            System.out.println(number+" sayısı mükemmel bir sayı değildir.");
        }
    }
