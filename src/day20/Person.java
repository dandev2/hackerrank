package day20;

import static day20.HairColor.*;

public class Person {
    HairColor hairColor = BLACK;

    public Person() {
        int a = 5;
    }

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        peterParker.hairColor = PINK;

        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair Color of SpiderMan: " + spiderMan.hairColor);
    }
}
    