
public class defaultcon {

    String name;
    int age;

    // Default constructor with values
    public defaultcon() {
        this.name = "John Doe";
        this.age = 25;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        defaultcon p = new defaultcon();
        p.display();
    }
}
