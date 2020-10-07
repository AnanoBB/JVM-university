public class Main {

    public static void main(String[] args) {
        C myObj = new C();
        myObj.getValues();
        System.out.println("Last digit:  " + myObj.Last());
        System.out.println("First digit: " + myObj.First());
        System.out.println("Sum of digits: " + myObj.Sum());
        System.out.println("Multiplication: " + myObj.Multiplication1());
        System.out.println("Sum: " + myObj.Multiplication2());
    }
}