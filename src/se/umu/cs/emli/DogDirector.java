package se.umu.cs.emli;

public class DogDirector {
    private final Dog.DogBuilder dogBuilder;

    public DogDirector(Dog.DogBuilder dogBuilder){
        this.dogBuilder = dogBuilder;
    }

    public Dog makeHarry(){
        dogBuilder.reset().setAge(2).setName("Harry")
                .addToy("Bunny").addToy("Ball").setType("Dachshund");
        return dogBuilder.getDog();
    }

    public Dog makeAnna(){
        dogBuilder.reset().setName("Anna").setAge(5);
        return dogBuilder.getDog();
    }

}
