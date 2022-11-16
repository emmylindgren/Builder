package se.umu.cs.emli;

import java.util.ArrayList;
import java.util.List;

/**
 * Dog class to keep information about different dogs.
 * The only way to create an instance of a dog is to use the
 * nested Builderclass for the class.
 */
public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys = new ArrayList<>();

    private Dog(){

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public List<String> getToys() {
        return toys;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Dog");
        builder.append(System.lineSeparator());
        if(type != null){
            builder.append("Of type: ").append(type);
            builder.append(System.lineSeparator());
        }
        if(name != null){
            builder.append("Name: ").append(name);
            builder.append(System.lineSeparator());
        }
        if(age != null){
            builder.append("Age: ").append(age);
            builder.append(System.lineSeparator());
        }
        if(!toys.isEmpty()){
            builder.append("Toys: ").append(toys);
        }
        return builder.toString();
    }

    /**
     * Builderclass for the dogclass. Create a dog
     * in different steps and only add what is needed for that instance.
     * Implements AbstractDogBuilder.
     */
    public static class DogBuilder implements AbstractDogBuilder{
        private Dog dog;

        public DogBuilder(){
            dog = new Dog();
        }

        @Override
        public DogBuilder setName(String name) {
            dog.name = name;
            return this;
        }

        @Override
        public DogBuilder setType(String type) {
            dog.type = type;
            return this;
        }

        @Override
        public DogBuilder setAge(int age) {
            dog.age = age;
            return this;
        }

        @Override
        public DogBuilder addToy(String toyName) {

            dog.toys.add(toyName);
            return this;
        }

        @Override
        public Dog getDog(){
            return dog;
        }

        @Override
        public DogBuilder reset(){
            this.dog = new Dog();
            return this;
        }
    }
}
