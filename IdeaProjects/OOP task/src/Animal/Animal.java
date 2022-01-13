package Animal;

public abstract class Animal {

    //Create a class Animal, that has 2 properties (class fields) – age color
    //with behaviours (class methods) make sound and sleep.

    private  String name;

    private  int age;

     public  Animal (String name,int age){
         this.name = name;
         this.age = age;
     }

    public String getName() {
        return name;
    }


    public void setName(String name) {
         if (name.trim().isEmpty()){
             throw new IllegalArgumentException("Invalid input!");
         }
        this.name = name;
    }

    public  int getAge(){
         return  age;
    }

    public  void setAge(int age)
    {
        if (age < 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    protected  abstract  String produceSound();

    protected  abstract  String sleep ();
}
