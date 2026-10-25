package basicConcepts;

public class Test {
    public static void main(String[] args) {
        Car car=new Car("Tata Safari");
      Car.Engine engine=car.new Engine();   //Member Inner Class
        engine.start();
        engine.stop();


    }
}
