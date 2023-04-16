public class RubberDuck extends Duck{
    RubberDuck(){
        // Set fly behavior to FlyNoWay instance
        flyBehavior= new FlyNoWay() {
            @Override
            public void flyWithWings() {
            }
        };
        // Set quack behavior to MuteQuack instance
        quackBehavior= new MuteQuack() {
            @Override
            public void quack() {
            }
            @Override
            public void squeak() {
            }
        };
        // Set swim behavior to Floating instance
        swimBehavior= new Floating() {
            @Override
            public void swim() {
            }
            @Override
            public void sink() {
            }
        };
    }
    // Override display method
    @Override
    void display() {
        System.out.println("I am Rubber Ducky");
    }
}