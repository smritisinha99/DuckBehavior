//An abstract class representing a squeak sound for a quack behavior.
public abstract class Squeak implements QuackBehavior{
    @Override
    public void squeak() {
        System.out.println("Squeak Squeak Squeak...");
        //Outputs squeak sound
    }
}
