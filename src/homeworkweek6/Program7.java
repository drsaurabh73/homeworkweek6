package homeworkweek6;
import java.util.*;
public class Program7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double celsius = ((5 * (Fahrenheit - 32.0))/9.0);
        System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + celsius +  " in celsius");
    }

}
