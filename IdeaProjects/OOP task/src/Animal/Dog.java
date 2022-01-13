package Animal;

public class Dog extends  Animal{

    private  String breed;

    private  int weight;


    public Dog (String  name, int age,String breed,int weight){
        super(name,age);

        this.breed = breed;

        this.weight =weight;

    }

    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        if (breed.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.breed = breed;
    }

    public  int getWeight(){
        return  weight;
    }

    public  void setWeight(int weight)
    {
        if (weight < 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.weight = weight;
    }

    @Override
    public String produceSound() {
        return "Woof woof";
    }

    @Override
    public String sleep() {
        return "I'm sleeping, don't teasing me!";
    }
}
