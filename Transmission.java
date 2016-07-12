package OOP.Prog_ua_30Group.Cars;

/**
 * Created by Aleks on 7/12/16.
 */
public class Transmission extends Car {

    private String TransmissionType; //manual ,auto
    private int numberofgears;


    public String getTransmissionType() {
        return TransmissionType;
    }

    public int getNumberofgears() {
        return numberofgears;
    }


    @Override
    public String toString() {
        return "Transmission{" +
                "TransmissionType='" + TransmissionType + '\'' +
                ", numberofgears=" + numberofgears +
                '}';
    }
}
