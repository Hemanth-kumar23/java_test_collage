
enum Level {
    LOW, MEDIUM, HIGH
}

class enumti {

    public static void main(String[] args) {
        Level l = Level.HIGH;
        System.out.println("Selected Level: " + l);

        // Simple messages for each level
        System.out.println("Is it LOW? " + (l == Level.LOW));
        System.out.println("Is it MEDIUM? " + (l == Level.MEDIUM));
        System.out.println("Is it HIGH? " + (l == Level.HIGH));

        // Printing all levels
        System.out.println("\nAvailable Levels:");
        for (Level level : Level.values()) {
            System.out.println(level);
        }

        // Changing level and printing again
        l = Level.MEDIUM;
        System.out.println("\nUpdated Level: " + l);
    }
}
