import Animal.Dog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Gosho",4,"German Shepherd", 30);

        System.out.println(dog.produceSound());
        System.out.println(dog.getBreed() + ", at age " + dog.getAge());


    }
}
