package OOP.Prog_ua_30Group.Cars;

/**
 * Created by Aleks on 7/12/16.
 */
public class Car {

    int id;
    private int developer;
    private int model;
    int color;
    private int create_year;
    boolean mileage;


    public int getId() {
        return id;
    }

    public int getDeveloper() {
        return developer;
    }

    public int getModel() {
        return model;
    }

    public int getColor() {
        return color;
    }

    public int getCreate_year() {
        return create_year;
    }

    public boolean isMileage() {
        return mileage;
    }


    public void setMileage(boolean mileage) {
        this.mileage = mileage;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", developer=" + developer +
                ", model=" + model +
                ", color=" + color +
                ", create_year=" + create_year +
                ", mileage=" + mileage +
                '}';
    }
}
