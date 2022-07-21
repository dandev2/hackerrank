package day29;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    /*
    입력 : n,k
    문제 : 1~n까지 중에서 모든 두 숫자의 조합으로
     &연산자 수행 후 최댓값 중 k보다 작은 값 출력
     */
    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int res = 0;
        for(int i=1; i<=N; i++) { // 1~N까지 순회하면서
            for(int j=i+1; j<=N; j++) { // j=i+1로 시작하는 것이 중요
                int ans = i&j; // &연산 수행하고
                if(ans>res && ans<K) {
                    // if문 통해  1~n까지 중에서 모든 두 숫자의 조합 최댓값 중
                    // k보다 작은 값을 res(출력변수)에 담음.
                    res = ans;
                }
            }
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
