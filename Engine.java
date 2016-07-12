package OOP.Prog_ua_30Group.Cars;

/**
 * Created by Aleks on 7/12/16.
 */
public class Engine extends Car {

    private String fueltype;     //  gas,patrol,diesel,electro
    boolean engine_capacity;     //  litres 2.0
    int enginepower;             //  150 hp


    public String getFueltype() {
        return fueltype;
    }

    public boolean isEngine_capacity() {
        return engine_capacity;
    }

    public int getEnginepower() {
        return enginepower;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "fueltype='" + fueltype + '\'' +
                ", engine_capacity=" + engine_capacity +
                ", enginepower=" + enginepower +
                '}';
    }
}


