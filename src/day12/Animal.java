//package day12;
//
//import org.w3c.dom.ls.LSOutput;
//
//public class Animal {
//    private int age; // VS private int age;
//
//    public Animal(int age) {
//        this.age = age;
//        System.out.println("An animal has been created!");
//    }
//
//    public void eat() {
//        System.out.println("An animal is eating");
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public static void main(String[] args) {
//        Animal a = new Animal(5);
//        Dog d = new Dog();
//        Cat c = new Cat();
//        d.ruff();
//        System.out.println(d.getAge());
//        c.meow();
//        a.eat();
//        d.eat();
//        c.eat();
//        d.run();
//        c.prance();
//
//        // What happens if..
//        Animal o = new Dog(); // 가능
////        Dog o = new Animal(); // 불가능
//
//
//    }
//}
