package OOP.Prog_ua_30Group.Cars;

/**
 * Created by Aleks on 7/12/16.
 */
public class Body extends Car{
    protected String bodytype; //sedan,suv,van
    private int numberofdoors; //3,4,5


    @Override
    public String toString() {
        return "Body{" +
                "bodytype='" + bodytype + '\'' +
                ", numberofdoors=" + numberofdoors +
                '}';
    }
}
