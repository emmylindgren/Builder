package se.umu.cs.emli;

/**
 * Interface containing the different methods a dogBuilder should contain.
 * @author Emmy Lindgren, id19eln.
 */
public interface AbstractDogBuilder {
    Dog.DogBuilder setName(String name);
    Dog.DogBuilder setType(String type);
    Dog.DogBuilder setAge(int age);
    Dog.DogBuilder addToy(String toyName);
    Dog getDog();
    Dog.DogBuilder reset();
}
