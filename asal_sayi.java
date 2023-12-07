import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Number :  ");
        int number = input.nextInt();
        int sayac = 0;
        for(int i=2;i<number;i++){
            if(number % i != 0){

            }
            else if(number % i == 0){

                sayac = sayac +1;
            }
        }
        if(sayac >= 1){
            System.out.println(number+" sayısı asal değildir.");
        }
        else if(sayac < 1){
            System.out.println(number+" sayısı asaldır.");
        }
    }
