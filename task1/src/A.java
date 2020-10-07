
import java.util.Scanner;

public class A {
    public A() {
       System.out.println("Hello");
    }
    static int x;
    void getValues () {
        Scanner user_input = new Scanner(System.in);
        try {
            System.out.println("Please enter X number: ");
            x = user_input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter valid number");
            getValues();
        }
    }

    void Second(){
        int sum = x + 12;
        System.out.println("sum is: " + sum);
    }

    void  Third(){
        String value = x % 2 == 0 ? "Even" : "Odd";
        System.out.println(value);
    }
}