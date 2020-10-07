// განსაზღვრეთ კლასი A: მთელი ტიპის x ცვლადით. კონსტრუქტორით, 3
// მეთოდით.
// კონსტრუქტორი 1: ბეჭდავს „Hello“;
// მეთოდი 1: შეაქვს x ცვლადში მონაცემი კლავიატურიდან;
// მეთოდი 2: ბეჭდავს x+12-ს;
// მეთოდი 3: ადგენს x ლუწია თუ კენტი;
// განსაზღვრეთ კლასი A შვილობილის კლასი B: დაამატეთ მთელი ტიპის y
// ცვლადი, 2 მეთოდი.
// მეთოდი 1: შეაქვს y ცვლადში მონაცემი კლავიატურიდან;
// მეთოდი 2: აბრუნებს x+y გამოსახულების მნიშვნელობას;



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