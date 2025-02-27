
class Parent {

    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    void show() { // Overriding method
        System.out.println("Child class method");
    }
}

public class raju {

    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.show(); // Calls Child class method
    }
}
