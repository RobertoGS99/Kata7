/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

/**
 *
 * @author Admin
 */
public class AsianCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy() {
        return new AsianCarToy();
    }
    
}
