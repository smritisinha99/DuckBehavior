public abstract class Quack implements QuackBehavior {
    // Implements the quack() method from the QuackBehavior interface
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack...");
        // Outputs the sound of a quack
    }
}