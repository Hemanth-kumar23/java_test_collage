
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {      // <-- Overriding Animal's sound()
        System.out.println("Dog barks");
    }
}

class Overriding {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Output: Dog barks
    }
}
