public class Pigeon extends Bird {
    private String species;

    public Pigeon(){
    }
    public Pigeon(String name, int age, double weight, String featherColor, String species){
        super(name,age,weight,featherColor);
        this.species=species;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species) {
        this.species=species;
    }

    @Override
    public void eat(){
        System.out.println("Pigeon eating");
    }
    @Override
    public void getVoice() {
        System.out.println("Pigeon cooing");
    }
    public void fly(){
        System.out.println("Pigeon flying");
    }
    @Override
    public String toString() {
        return "Pigeon [name=" +getName() + ",age=" +getAge() +"weight=" +getWeight() +"featherColor=" +getFeatherColor() +",species=" +species +"]";
    }
}
