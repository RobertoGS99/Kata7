/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.american.AmericanEngine;
import toyproducts.components.american.AmericanRotorBlade;
import toyproducts.components.american.AmericanWheel;

/**
 *
 * @author Admin
 */
public class AmericanComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        Wheel wheel = new AmericanWheel();
        return wheel;
    }

    @Override
    public Engine createEngine() {
        Engine engine = new AmericanEngine();
        return engine;
    }

    @Override
    public RotorBlade createRotorBlade() {
        RotorBlade rotorBlade = new AmericanRotorBlade();
        return rotorBlade;
    }
    
}
