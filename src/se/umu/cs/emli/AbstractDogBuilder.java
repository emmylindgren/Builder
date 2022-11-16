package se.umu.cs.emli;

public interface AbstractDogBuilder {
    Dog.DogBuilder setName(String name);
    Dog.DogBuilder setType(String type);
    Dog.DogBuilder setAge(int age);
    Dog.DogBuilder addToy(String toyName);
    Dog getDog();
    Dog.DogBuilder reset();
}
