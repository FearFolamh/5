public class Main {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Бобик", 3);
        Cat cat1 = new Cat("Мурка", 2);
        Bird bird1 = new Bird("Кеша", 1);


        dog1.makeSound();
        cat1.makeSound();
        bird1.makeSound();

        // Приведение типов для вызова swim
        Swimmable swimmableDog = (Swimmable) dog1;
        Swimmable swimmableBird = (Swimmable) bird1;


        swimmableDog.swim();
        swimmableBird.swim();



    }
}