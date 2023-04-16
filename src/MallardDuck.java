public class MallardDuck extends Duck{
    // Constructor to initialize the behaviors for Mallard Duck
    MallardDuck(){
        flyBehavior= new FlyWithWings() {
            @Override
            public void flyNoWay() {
            }
        };
        quackBehavior= new Quack() {
            @Override
            public void squeak() {
            }
            @Override
            public void muteQuack() {
            }
        };
        swimBehavior= new Swim() {
            @Override
            public void floating() {
            }
            @Override
            public void sink() {
            }
        };
    }
    // Implementation of the abstract display method
    @Override
    void display() {
        System.out.println("I am Mallard Duck");
    }
}