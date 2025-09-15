public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("============================");

        Pet dog = new Dog("Buddy", 3);
        dog.displayInfo();
        dog.makeSound();

        Pet cat = new Cat("Whiskers", 2);
        cat.displayInfo();
        cat.makeSound();

        Pet bird = new Bird("Tweety", 1);
        bird.displayInfo();
        bird.makeSound();

        System.out.println();

        PetService service = new PetService();
        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculateFee(true));
        System.out.println("Full service: $" + service.calculateFee(true, true));
        System.out.println("Emergency: $" + service.calculateFee("emergency"));

        System.out.println();

        System.out.println("Training Session Started!");
        System.out.println("=========================");
        Trainable tDog = new TrainableDog("Buddy", 3);
        Trainable tBird = new TrainableBird("Tweety", 1);

        tDog.performTrick();
        tBird.performTrick();
    }
}
