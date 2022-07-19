package day25;

import java.util.HashMap;

public class RunTimePractice {
    public RunTimePractice() {
    }

    public static int findNumsOfRepetitions(String s, char c) {
        int sum = 0;

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c) {
                ++sum;
            }
        }

        return sum;
    }

    public static int[] findNumsOfRepetitionsv1(String s, char[] c) {
        int[] sums = new int[c.length];

        for(int i = 0; i < s.length(); ++i) {
            for(int j = 0; j < c.length; ++j) {
                if (s.charAt(i) == c[j]) {
                    int var10002 = sums[j]++;
                }
            }
        }

        return sums;
    }

    public static int[] findNumsOfRepetitionsv2(String s, char[] c) {
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap();

        int j;
        for(j = 0; j < s.length(); ++j) {
            if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), 1);
            } else {
                int sum = (Integer)map.get(s.charAt(j));
                map.put(s.charAt(j), sum + 1);
            }
        }

        for(j = 0; j < c.length; ++j) {
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = (Integer)map.get(c[j]);
            }
        }

        return sums;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("abca;lksdjf", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");
        char[] a = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f'};
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv1("abca;lksdjflksjdf'laksjdflkasjdflkasjdf'askdjfl'kasdjfal'ksdjfl'kasdjf'laksdjfl'kasjdf'laksdjf'lkasdjf'lkasjdf'lkajsd'flkjasd'lkfjads'lkfjas'lkdfjal'ksdfj'lkasdjf'lkasdjfl'kasdjfkl'asdjf'lkasdjf'lkasdjf'lkasdjf'laskdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv2("abca;lksdjflksjdf'laksjdflkasjdflkasjdf'askdjfl'kasdjfal'ksdjfl'kasdjf'laksdjfl'kasjdf'laksdjf'lkasdjf'lkasjdf'lkajsd'flkjasd'lkfjads'lkfjas'lkdfjal'ksdfj'lkasdjf'lkasdjfl'kasdjfkl'asdjf'lkasdjf'lkasdjf'lkasdjf'laskdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");
    }
}
