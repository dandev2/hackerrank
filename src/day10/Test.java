package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        br.close();
        int count = 0;
        int max =0;
        while(n>0) {
            if(n%2==1) {
                count++;
                if(count > max) max = count;
            }
            else count = 0;
            n /= 2;
        }
        System.out.println(max);
    }
}
