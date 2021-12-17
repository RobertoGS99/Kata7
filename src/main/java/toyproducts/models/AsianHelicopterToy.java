package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import factories.SerialNumberGenerator;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;

public class AsianHelicopterToy implements Toy {
    private final Integer serialNumber;
    private final ComponentFactory componentFactory;
    private RotorBlade rotorBlade;
    private Engine engine;
    private final String type = "Helicopter";
    
    public AsianHelicopterToy() {
        this.serialNumber = SerialNumberGenerator.getInstance().next();
        this.componentFactory = new AsianComponentFactory();
    }
    
    public void pack(){
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is packed.\n");
    }
    
    public void label(){
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is labelled.\n");
    }

    @Override
    public void prepare() {
        this.engine = componentFactory.createEngine();
        this.rotorBlade = componentFactory.createRotorBlade();
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is prepared.\n");
    }
    
}
