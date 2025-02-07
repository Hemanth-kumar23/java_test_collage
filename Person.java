
class Person {

    private String name; // Private variable (can't be accessed directly)

    // Setter method (to set value)
    public void setName(String newName) {
        name = newName;
    }

    // Getter method (to get value)
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice"); // Setting the name
        System.out.println("Person's Name: " + p.getName()); // Getting the name
    }
}
