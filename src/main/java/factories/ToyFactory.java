/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import toyproducts.Toy;

/**
 *
 * @author Admin
 */
public abstract class ToyFactory {
    public Toy produceToy(){
        Toy toy = createToy();
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy();
}
