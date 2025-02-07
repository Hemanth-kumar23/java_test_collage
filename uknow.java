
public class uknow {

    String name;

    uknow(String name) {
        this.name = name; // 'this' refers to the instance variable
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
        uknow e1 = new uknow("John");
        e1.display();
    }
}
