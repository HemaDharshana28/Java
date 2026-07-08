class Student {

    int id;
    String name;
    int age;
    // Default
    Student() {
        this(0, "Unknown", 0);
        System.out.println("Default constructor");
    }
    // 2 parameter 
    Student(int id, String name) {
        this(id, name, 18);
        System.out.println("Two parameter constructor");
    }
    // 3 parameter
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Three parameter constructor");
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
public class ConstructorChaining{
    public static void main(String[] args) {
        Student s = new Student(101, "Alice");
        s.display();
    }
}