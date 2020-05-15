/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator59cntt3;

import BeverageType.Beverage;
import BeverageType.DarkRoast;
import CondimentType.Milk;
import CondimentType.Mocha;
import CondimentType.Soy;

/**
 *
 * @author huuph
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage b = new DarkRoast();
        b = new Milk(b);
        b = new Mocha(b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        b = new Soy(b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
    
}
