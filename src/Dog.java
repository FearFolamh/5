public class Dog extends Animal implements Swimmable
{

    public Dog(String Name, Integer Age)
    {
        super(Name, Age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Гав");
    }

    @Override
    public void swim() {
        System.out.println("Песик плавает");

    }
}
