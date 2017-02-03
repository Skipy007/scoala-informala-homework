/**
 * Created by Skipy on 1/14/2017.
 */
public class Sandero extends Dacia implements Car {
    boolean started = false;
    protected int maxGear = 4, currentGear = 0;
    protected double tankSize = 35, coef = 0, maxConsum = 0.20, drivenKm = 0, literConsum = 0, lPer100Km = 0;
    public Sandero(double fuelInTank, String serialNumber) {
        super(fuelInTank, serialNumber);
    }
    @Override
    public void start() {
        if (fuelInTank > 0) {
            started = true;
            literConsum = 0;
            drivenKm = 0;
            currentGear = 0;
            lPer100Km = 0;
            drivenKm = 0;
            System.out.println("Car has started!");
        } else {
            System.out.println("Out Of GAS, Car wont Start");
        }
    }
    @Override
    public void drive(double km) {
        if (started) {
            double driveConsum = 0;
            if (currentGear == 0) {
                System.out.println("To move car please Shift GEAR up!");
            } else {
                coef = maxConsum - (currentGear * (maxConsum / maxGear)) + (maxConsum / maxGear);
                driveConsum = coef * km;
                setAvailableFuel(driveConsum);
                drivenKm = drivenKm + km;
                literConsum = literConsum + driveConsum;
                System.out.println("Car set in gear:"+getCurrentGear() + ". Driven for :"+km + " Km");
            }
        } else {
            System.out.println("Please start car first!");
        }
    }
    @Override
    public void stop() {
        if (started) {
            System.out.println("The car has stopped!");
            started = false;}

    }
    @Override
    public void shiftGear(String upDown) {
        if (upDown.equals("+") && currentGear+1 <= maxGear) {
            currentGear++;
        }
        if (upDown.equals("-") && currentGear >= 1) {
            currentGear--;
        }

    }
    @Override
    public int getCurrentGear() {
        return currentGear;
    }
    @Override
    public double getAvailableFuel() {
        return fuelInTank;
    }
    @Override
    public double getAverageFuelConsumption() {
        lPer100Km = (100*literConsum)/drivenKm;
        return lPer100Km;
    }
    private void setAvailableFuel(double consum){
        if ((getAvailableFuel() - consum)>=0) {
            fuelInTank = getAvailableFuel() - consum;
        }
        else {
            fuelInTank=0;
            System.out.println("Out of FUEL!");
            stop();
        }
    }
    @Override
    public double tripKm() {
        return drivenKm;
    }
    public double FuelTankSize(){
        return tankSize;
    }
}
