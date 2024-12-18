public class Cat extends Animal implements Swimmable
{
    public Cat(String Name, Integer Age)
    {
        super(Name, Age);
    }
    @Override
    public void makeSound()
    {
        System.out.println("Мяу");
    }

    @Override
    public void swim() {

    }

}
