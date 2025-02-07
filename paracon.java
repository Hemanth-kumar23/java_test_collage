
public class paracon {

    String name;
    int age;

    // Parameterized constructor
    paracon(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        paracon s1 = new paracon("Alice", 20); // Passing values to constructor
        s1.display();
    }
}
