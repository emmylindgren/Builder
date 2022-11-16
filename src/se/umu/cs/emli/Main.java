package se.umu.cs.emli;

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
