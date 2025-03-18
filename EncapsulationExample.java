
class Student {

    private String name;

    public void setName(String name) { // Setter method
        this.name = name;
    }

    public String getName() { // Getter method
        return name;
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
         System.out.println("Student Name: " + s.getName());
    }
}
