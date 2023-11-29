public class Mammal extends Animal {
    public Mammal() {
    }
    public  Mammal(String name, int age,double weight){
        super(name, age, weight);
    }
    @Override
    public void eat(){
        System.out.println("Mammal eating");
    }
    @Override
    public void getVoice(){
        System.out.println("Mammal making sound");
    }

    public void run(){
        System.out.println("Mammal running");
    }
    @Override
    public String toString(){
        return "Mammal [name="+getName() +",age=" +getAge() +",weight=" +getWeight() +"]";
    }
}


