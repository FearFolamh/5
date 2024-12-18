public abstract class Animal
{

    private String Name;
    private Integer Age;

    public Animal(String Name, Integer Age)
    {
        this.Name=Name;
        this.Age=Age;

    }

    public abstract void makeSound();

}
