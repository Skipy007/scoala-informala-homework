/**
 * Created by Skipy on 1/14/2017.
 */
public class AppStart {
    public static void main(String[] args){

       //Dacia Logan
        System.out.println("                                      Now driving Dacia Logan");
        Car car = new Logan(27, "DLRO2015092719A");
        car.drive(0.1);
        car.start();
        car.drive(0.1);
        car.shiftGear("+");
        car.drive(0.01);// drives 0.01 KMs
        car.shiftGear("+");
        car.drive(0.02);
        car.shiftGear("+");
        car.drive(0.5);
        car.shiftGear("+");
        car.drive(0.5);
        car.shiftGear("+");
        car.drive(0.5);
        car.shiftGear("+");
        car.drive(10);
        car.shiftGear("-");
        car.drive(0.5);
        car.shiftGear("-");
        car.drive(0.1);
        car.stop();
        System.out.println("The car has: "+car.getAvailableFuel()+" Liters left in tank ("+ car.FuelTankSize()+" Liters)!");
        System.out.println("Avarage fuel consumption for this trip was: "+ car.getAverageFuelConsumption() +" Liters per 100 Km!");
        System.out.println("Trip was: "+ car.tripKm() +" Km long!");
       //Dacia Sandero
        System.out.println("                                      Now driving Dacia Sandero");
        car = new Sandero(15,"DSARO2016102115B");
        car.start();
        car.shiftGear("+");
        car.drive(0.1);
        car.shiftGear("+");
        car.drive(0.5);// drives 0.01 KMs
        car.shiftGear("+");
        car.drive(1.9);
        car.shiftGear("-");
        car.drive(0.8);
        car.shiftGear("-");
        car.drive(0.1);
        car.shiftGear("-");
        car.drive(0.0);
        car.shiftGear("+");
        car.drive(0.3);
        car.stop();
        System.out.println("The car has: "+car.getAvailableFuel()+" Liters left in tank ("+ car.FuelTankSize()+" Liters)!");
        System.out.println("Avarage fuel consumption for this trip was: "+ car.getAverageFuelConsumption() +" Liters per 100 Km!");
        System.out.println("Trip was: "+ car.tripKm() +" Km long!");
        //Toyota Supra
        System.out.println("                                      Now driving Toyota Supra");
        car = new Supra(80,"TOYJAP19930922300B", 255, "BENZINE" );
        car.start();
        car.shiftGear("+");
        car.drive(0.1);
        car.shiftGear("+");
        car.drive(0.5);// drives 0.01 KMs
        car.shiftGear("+");
        car.drive(2.5);
        car.shiftGear("+");
        car.drive(1.2);
        car.shiftGear("+");
        car.drive(3);
        car.shiftGear("+");
        car.drive(10);
        car.shiftGear("-");
        car.drive(70);
        car.stop();
        System.out.println("The car has: "+car.getAvailableFuel()+" Liters left in tank ("+ car.FuelTankSize()+" Liters)!");
        System.out.println("Avarage fuel consumption for this trip was: "+ car.getAverageFuelConsumption() +" Liters per 100 Km!");
        System.out.println("Trip was: "+ car.tripKm() +" Km long!");
        System.out.println("                                      Now driving Toyota Yaris");
        car = new Yaris(3,"TOYMAKER930922300C", 195, "DIESEL" );
        car.start();
        car.shiftGear("+");
        car.drive(0.1);
        car.shiftGear("+");
        car.drive(0.5);// drives 0.01 KMs
        car.shiftGear("+");
        car.drive(10);
        car.shiftGear("+");
        car.drive(9);

       // car.stop();
        System.out.println("The car has: "+car.getAvailableFuel()+" Liters left in tank ("+ car.FuelTankSize()+" Liters)!");
        System.out.println("Avarage fuel consumption for this trip was: "+ car.getAverageFuelConsumption() +" Liters per 100 Km!");
        System.out.println("Trip was: "+ car.tripKm() +" Km long!");

        }
}
