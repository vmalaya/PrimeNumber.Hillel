import java.util.Scanner;

/**
 * Created by Валентина on 19.05.2017.
 */
public class Program {
    public static void main(String[] arg)
    {
    System.out.println("Please input number");
    Scanner scanner =  new Scanner(System.in);
    int number = scanner.nextInt();

       if(isPrime(number) == true){
        System.out.println("Number is prime");
    }
       else {
        System.out.println("Number is not prime");
    }

}
    public static boolean isPrime(int number) {
        boolean flag = true ;
       if (number == 2) {
           flag = true;
           return flag;
       }
        for (int i = 3; i <  (number/2); i++){
            if (number % i == 0) {
                flag =  false;
                break;
            }
            else {
                flag = true;
            }
        }
        return flag;
    }
}

