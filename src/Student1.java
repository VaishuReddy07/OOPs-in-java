class Student1 {

    String name;
//    Constructor runs automatically when object is created.
    Student1() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
    }
}
//Constructor with Parameters
class Student2 {

    String name;
    int age;

    Student2(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2("Dedeepya", 24);

        s1.display();
    }
}