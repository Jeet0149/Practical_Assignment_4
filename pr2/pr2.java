// Name : Vansjaliya Jeet Rajeshbhai
// ID : 21CE149
// WAP to generate user defined exception using “throw”and “throws” keyword.
package pr2;

import java.util.*;

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String s) {
        super(s);
    }
}

class pr2 {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n < 6) {
            try {
                throw new MyException("Value is less than  6");
            } catch (MyException e) {
                System.out.println(e);
            }
        }
    }
}