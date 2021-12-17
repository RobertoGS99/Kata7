package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import factories.SerialNumberGenerator;
import java.lang.reflect.Array;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;

public class AmericanCarToy implements Toy {
    private final Wheel  wheels[] = new Wheel[4];
    private final ComponentFactory componentFactory;
    private Engine engine;
    private final Integer serialNumber;
    private final String type = "Car";
    
    public AmericanCarToy() {
        this.serialNumber = SerialNumberGenerator.getInstance().next();
        this.componentFactory = new AmericanComponentFactory();
    }
    
    @Override
    public void pack(){
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is packed.\n");
    }
    
    @Override
    public void label(){
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is labelled.\n");
    }

    @Override
    public void prepare() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i]=componentFactory.createWheel();
        }
        this.engine = componentFactory.createEngine();
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is prepared.\n");
    }
    
}
