// Polymorphism
// Method Overloading

class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


// Method Overriding

class Animal2 {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Animal2 {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


public class Student5 {

    public static void main(String[] args) {

        MathOperation m = new MathOperation();

        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));

        Dog2 d = new Dog2();

        d.sound();
    }
}