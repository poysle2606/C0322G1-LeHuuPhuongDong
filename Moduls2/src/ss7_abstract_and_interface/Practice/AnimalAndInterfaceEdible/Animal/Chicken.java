package ss7_AbstractAndInterface.Practice.AnimalAndInterfaceEdible.Animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: ò ó o o o";
    }

    @Override
    public String howToEat() {
        return "Eat: rice";
    }
}
