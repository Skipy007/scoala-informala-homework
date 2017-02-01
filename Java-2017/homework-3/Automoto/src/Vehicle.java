/**
 * Created by Skipy on 1/14/2017.
 */
public interface Vehicle {
    void start();
    void drive(double km);
    void shiftGear(String upDown);
    int getCurrentGear();
    void stop();
}
