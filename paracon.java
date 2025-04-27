
public class paracon {

    String name;
    int age;

    // Parameterized constructor
    paracon(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    public static void main(String[] args) {
        paracon s1 = new paracon("Alice", 20); // Passing values to constructor
        s1.display();
    }
}
