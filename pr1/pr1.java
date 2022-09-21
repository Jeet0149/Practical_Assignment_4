// Name : Vansjaliya Jeet Rajeshbhai
// ID : 21CE149
// WAP to show the try - catch block to catch thedifferent types of exception.
package pr1;

class pr1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            System.out.println("Value is : " + a / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exceptioncalled");
        }
        try {
            int[] abc = new int[3];
            System.out.println(abc[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException called");
        }
        try {
            Object o = new Object();
            String s = (String) o;
        } catch (ClassCastException e) {

            System.out.println("ClassCast Exceptioncalled");
        }

        try {
            String s = null;
            if (s.equals("abcd")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception called");
        }

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(-1);
                } catch (Exception e) {
                    System.out.println("IllegalArgument Exception called");

                }
            }
        });
        t1.setName("Test Thread");
        t1.start();

        try {
            int[] abc = new int[-4];
            System.out.println(abc[4]);
        } catch (NegativeArraySizeException e) {
            System.out.println("NegetiveArraySize Exception called");
        }
    }
}
