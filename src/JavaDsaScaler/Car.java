package JavaDsaScaler;

import java.util.Objects;

public class Car {
    int tyre;
    String name;
    String gear;

    //  public String Car(int tyre,String name,String gear)
//    {
//        this.tyre=tyre;
//        this.name=name;
//        this.gear=gear;
//        return this.tyre+" "+this.gear+" "+this.name;
//
//    }
    Car(int tyre, String name, String gear) {
        this.tyre = tyre;
        this.name = name;
        this.gear = gear;
    }

    @Override
    public String toString() {
        return this.tyre + " " + this.gear + " " + this.name;
    }

    @Override
    public boolean equals(Object o1) {
        if (this.tyre == 0) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;
        Car c = (Car) o1;
        return c.getClass().equals(c.gear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gear) + Objects.hash(name);
    }

}
