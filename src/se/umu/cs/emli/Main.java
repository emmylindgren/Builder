package se.umu.cs.emli;

/**
 * Program for creating dogs. Dogs can only be created with
 * the dogBuilder. A dogDirector is used for simplifying making several instances of
 * the dogs Harry and Anna.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Builder for dogs!");

        DogDirector director = new DogDirector(new Dog.DogBuilder());
        Dog harry = director.makeHarry();
        Dog anna = director.makeAnna();

        System.out.println(harry);
        System.out.println(anna);
    }
}