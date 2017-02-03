/**
 * Created by Skipy on 1/14/2017.
 */
public abstract class Toyota {
    double fuelInTank;
    String serialNumber;
    int weelWith;
    String fuelType;
    public Toyota(double fuelInTank, String serialNumber, int weelWith, String fuelType) {
        this.fuelInTank=fuelInTank;
        this.serialNumber=serialNumber;
        this.weelWith = weelWith;
        this.fuelType = fuelType;
    }
}
