public class StringPractice {
    public static void main(String[] args) {

        
        String animal1 = "Cat";
        String animal2 = "Dog";

        // -- length()
        System.out.println("Length of animal1 (Cat): " + animal1.length());

        // -- concat()
        String combined = animal1.concat(" and ").concat(animal2);
        System.out.println("Combined animals: " + combined);

        // -- toUpperCase()
        System.out.println("Animal1 in uppercase: " + animal1.toUpperCase());

        // -- toLowerCase()
        System.out.println("Animal2 in lowercase: " + animal2.toLowerCase());

        // -- substring()
        System.out.println("Substring of 'Elephant' (0 to 4): " + "Elephant".substring(0, 4));

        // -- equals()
        String checkAnimal = "cat";
        System.out.println("Is 'Cat' equal to 'cat'? " + animal1.equals(checkAnimal));

        // -- replace()
        String newAnimal = animal2.replace('o', 'a');
        System.out.println("Dog after replace: " + newAnimal);

        // -- charAt()
        System.out.println("Character at index 1 in Cat: " + animal1.charAt(1));
    }
}
