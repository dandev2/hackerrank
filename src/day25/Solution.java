package day25;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int count = 0;
            int num = Integer.parseInt(br.readLine());

            if(num == 1) {
                System.out.println("Not prime");
            }else{
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
                if(count == 0) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }

        }
    }
}