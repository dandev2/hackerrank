package day16;

public class ExceptionsPractice {
    public static void main(String[] args) {
//        int[] intArray = new int[10];
//        System.out.println(intArray[10]);

        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown" + e);
        } finally {
            System.out.println("Finally clause");
        }

//        System.out.println("Finally Finished try-catch");


        /**
         * 1. checked Exceptions
         * - occurs at compile time(syntax)
         * 2. unchecked Exceptions
         * - occurs at the time your program is executed(logic)
         */

        /**
         * try-catch block
         * try {
         *  do this until we get an exception
         *  } catch(type_of_error e) {
         *      do this if we get type_of_error
         *      in the try
         * }
         */

    }
}
