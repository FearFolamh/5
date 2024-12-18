public class Bird extends Animal implements  Swimmable {
    public Bird(String Name, Integer Age) {
        super(Name, Age);
    }
    @Override
    public void makeSound()
    {
        System.out.println("Чик-чирик");
    }

    @Override
    public void swim() {

    }

}
