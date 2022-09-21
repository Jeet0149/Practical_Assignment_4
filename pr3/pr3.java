// Name : Vansjaliya Jeet Rajeshbhai
// ID : 21CE149
// Write a program that raises two exceptions. Specify two‘catch’ clauses for the two
// exceptions. Each ‘catch’ block handles a different typeof exception. For example the
// exception could be ‘ArithmeticException’ andrrayIndexOutOfBoundsException’.
// Display a message in the ‘finally’ block.
package pr3;

public class pr3 {
    public static void main(String[] args) {
        int[] a = new int[2];
        try {
            System.out.println("element three of array is: " + a[3]); // printing the third element
        }
        // catch blocks will run accordingly by checking which type of exception is
        // there

        catch (ArithmeticException e) {
            System.out.println("Exception throw ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throw ArrayIndexOutOfBoundsException");
        }

        // finally will always executed if there is any try block

        finally {
            a[1] = 20;
            System.out.println("Element value: " + a[1]);
            System.out.println("The finally statement isexecuted");
        }
    }
}
