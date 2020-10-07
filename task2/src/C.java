// განსაზღვრეთ კლასი C: სამი მთელი ტიპის ცვლადით a, b, c; 6 მეთოდით;
// მეთოდი 1: ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან;
// მეთოდი 2: აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს;
// მეთოდი 3: აბრუნებს b-ს მნიშვნელობის პირველ ციფრს;
// მეთოდი 4: აბრუნებს c-ს მნიშვნელობის ციფრთა ჯამს;
// მეთოდი 5: ბეჭდავს მეთოდი 2-ის მნიშნველობისა და მეთოდი 3-ის
// მნიშვნელობის ნამრავლს;
// მეთოდი 6: ბეჭდავს მეთოდი 3-ის მნიშნველობისა და მეთოდი 5-ის
// მნიშვნელობის ჯამს.



import java.util.Scanner;

public class C {
    int a,b,c,sum;
    void getValues () {
        Scanner user_input = new Scanner(System.in);
      
            System.out.println("Enter first number: ");
            a = user_input.nextInt();
            System.out.println("Enter second number: ");
            b = user_input.nextInt();
            System.out.println("Enter third number: ");
            c = user_input.nextInt();
      
        
    }

    int Last() {
        return a % 10;
    }

    int First(){
        while (b >= 10)
            b /= 10;
        return b;
    }

    int Sum(){
        while (c != 0)
        {
            sum = sum + c % 10;
            c = c / 10;
        }
        return sum;
    }

    int Multiplication1 () {
        int ans = Last() * First();
        System.out.println("Method 5 answer: " + ans);
        return  ans;
    }

    int Multiplication21 () {
        int ans =  First() + Multiplication1();
        System.out.println("Method 6 answer: " + ans);
        return  ans;
    }
}