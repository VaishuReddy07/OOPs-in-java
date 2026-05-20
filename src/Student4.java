// Inheritance

class Animal1 {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Student4 {

    public static void main(String[] args) {

        Dog1 d1 = new Dog1();

        d1.sound();
        d1.bark();
    }
}