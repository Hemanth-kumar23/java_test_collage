
public class thisKeyword {

    String name;

    thisKeyword(String name) {
        this.name = name; // 'this' refers to the instance variable
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
        thisKeyword e1 = new thisKeyword("John");
        e1.display();
    }
}
