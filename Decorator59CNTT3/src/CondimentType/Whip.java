/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CondimentType;

import BeverageType.Beverage;

/**
 *
 * @author huuph
 */
public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 8 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +" Whip"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
