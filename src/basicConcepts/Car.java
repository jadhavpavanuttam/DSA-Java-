package basicConcepts;


//Member Inner Class Example
public class Car {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isModel() {
        return isModel;
    }

    public void setModel(boolean model) {
        isModel = model;
    }

    private String model;
    private boolean isModel;


    public Car(String model) {
        this.model = model;
        this.isModel = false;
    }

    class Engine {
        void start() {
            if (isModel) {
                isModel = true;
                System.out.println("Car Has Started...");
            } else {
                System.out.println("Model Engine is already started...");
            }
        }

        void stop() {
            if (!isModel) {

            }
        }
    }
}
