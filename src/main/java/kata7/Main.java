/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata7;

import business.ToyBusiness;
import factories.ToyFactory;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ToyFactory carToyFactory = new AsianCarToyFactory();
        ToyFactory helicopterToyFactory = new AsianHelicopterToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", carToyFactory);
        toyBusiness.add("helicopter", helicopterToyFactory);
        while(true){
            System.out.println("Introduce command:                        ('exit for exit')");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            
            if(nextLine.equals("exit")){
                break;
            }else if(nextLine.equals("car")){
                toyBusiness.produceToy(nextLine);
            }else if(nextLine.equals("helicopter")){             
                toyBusiness.produceToy(nextLine);
            }else {
                System.out.println("Command unknown");
            }
        }
        System.out.println("Client aplication finalized");
    }
}
