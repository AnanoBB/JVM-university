 class Main {

    public static void main(String[] args) {
	    A myObj = new A();
	    myObj.getValues();
	    myObj.Second();
	    myObj.Third();
	    B secObj = new B();
		secObj.inputValue();
		System.out.println("Sum of two elements is: " + secObj.Sum() );
    }
}
