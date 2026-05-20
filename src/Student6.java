public class Student6 {

    abstract class Animal {

        abstract void sound();
    }

    class Dog extends Animal {

        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {

        Student6 obj = new Student6();

        Dog d = obj.new Dog();

        d.sound();
    }
}