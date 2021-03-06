//package day14;
//
//import org.w3c.dom.ls.LSOutput;
//
//public abstract class Animal {
//    private int age; // VS private int age;
//
//
//    public Animal(int age) {
//        this.age = age;
//        System.out.println("An animal has been created!");
//    }
//
//    // f(x) = x + 5
//    // f(z, d) = z + d
//    public void doSomething(String thing) {
//        System.out.println("I'm doing " + thing);
//    }
//
//    public abstract void eat();
//
//    public void sleep() {
//        System.out.println("An animal is sleeping.");
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        Cat c = new Cat();
//        d.eat();
//        c.eat();
//        d.sleep();
//        c.sleep();
//
//        // Casting
//        Object dog = new Dog();
//        Dog realDog = (Dog) dog;
//        realDog.ruff();
//
//        Object str = "est";
//        String realS = (String) str;
//        realS.getBytes();
//
//        // What happens when...
//        Dog doggy = new Dog();
//        if(doggy instanceof Animal) {
//            Animal animal = (Animal) doggy;
//            animal.sleep();
//        }
//        doggy.sleep();
//    }
//}
//
///*
//ABSTRACT METHODS : DON'T HAVE A BODY
//
// */