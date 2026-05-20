
//Encapsulation
class Student3 {

    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Student3 s1 = new Student3();

        s1.setName("Dedeepya");

        System.out.println(s1.getName());
    }
}
