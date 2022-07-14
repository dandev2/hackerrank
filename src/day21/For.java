package day21;

public class For {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<5; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        for(int a: arr) {
            System.out.print(a);
        }
    }
}
