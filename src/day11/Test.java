package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 2 4 4 0
 0 0 0 2 0 0
 0 0 1 2 4 0
  */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[6][6];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);
    }
}
