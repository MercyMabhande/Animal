public class Bird extends Animal {
    private String featherColor;

    public Bird() {
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Bird making sound");
    }

    @Override
    public String toString() {
        return "Bird [name=" + getName() + ",age=" + getAge() + ",weight=" + getWeight() + "featherColor=" + featherColor + "]";
    }
}





