
class stingmethod {

    public static void main(String[] args) {
        System.out.println("String Demo:");

        String s1 = new String("specs");
        String s2 = "sips";
        String s3 = "";

        System.out.println("The string s1 = " + s1);
        System.out.println("The string s2 = " + s2);

        System.out.println("Character at index 2: " + s2.charAt(2));
        System.out.println("The length of s1 = " + s1.length());

        System.out.println("Substring beginning at index 2 = " + s1.substring(2));
        System.out.println("Substring from 1 to 4 = " + s1.substring(1, 4));

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

        System.out.println("The length of string s3: " + s3.length());
        System.out.println("Is s3 empty? " + s3.isEmpty());

        String s4 = s1.concat(s2);
        System.out.println("Concatenation of s1 and s2: " + s4);

        System.out.println("Replacing 's' with 'S' in s1: " + s1.replace('s', 'S'));
        System.out.println("Upper case s1: " + s1.toUpperCase());
        System.out.println("Lower case s2: " + s2.toLowerCase());
    }
}
