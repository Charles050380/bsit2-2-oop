abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("\nPet Name: " + name + ", Age: " + age);
    }
}

class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}

class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }
}
interface Trainable {
    void performTrick();
}

class TrainableDog extends Dog implements Trainable {
    public TrainableDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Sits and shakes hands");
    }
}

class TrainableBird extends Bird implements Trainable {
    public TrainableBird(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Flies in circles and lands on perch");
    }
}
