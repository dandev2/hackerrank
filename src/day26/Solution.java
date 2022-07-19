package day26;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int rd = Integer.parseInt(st.nextToken());
        int rm = Integer.parseInt(st.nextToken());
        int ry = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int dd = Integer.parseInt(st1.nextToken());
        int dm = Integer.parseInt(st1.nextToken());
        int dy = Integer.parseInt(st1.nextToken());

        int count;
       if(ry>dy) {
           count = 10000;
       } else if (rm > dm && (ry >= dy)) {
           count = 500 * (rm - dm);
       }else if(rd > dd && (rm>=dm) && (ry>=dy)) {
           count = 15 * (rd - dd);
       }else {
           count = 0;
       }
        System.out.println(count);
    }

}