public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE; //Integer is a wrapper class of primitive int type.
	    int myMaxIntValue = Integer.MAX_VALUE;

	    System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX Value " + (myMaxIntValue + 1)); //Overflowed to minimum value
    }
}
