/**
 * Created by rcarreira on 1/7/15.
 */
public class FizzBuzz {

    public String transformNumber(int number){
        if (number % 3 == 0){
            return "Fizz";
        }else if (number==5){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
