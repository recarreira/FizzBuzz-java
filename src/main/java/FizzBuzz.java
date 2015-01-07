/**
 * Created by rcarreira on 1/7/15.
 */
public class FizzBuzz {

    public static void main(String args[]){
        for (int i = 1; i <= 100; i++){
            System.out.println(transformNumber(i));
        }
    }

    public static String transformNumber(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 ==0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
