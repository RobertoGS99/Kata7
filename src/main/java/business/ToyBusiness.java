package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproducts.Toy;

public class ToyBusiness {
    private Map<String,ToyFactory> factories;

    public ToyBusiness(){
        this.factories = new HashMap();
    }
    
    public Toy produceToy(String type){
        return factories.get(type).produceToy();
    }

    public void add(String type, ToyFactory toyFactory) {
        factories.put(type, toyFactory);
    }
    
    /**
     switch (type){
            case("car"): 
                AmericanCarToy car = new AmericanCarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case("helicopter"):
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default: 
                return null;
        }
     */
}
