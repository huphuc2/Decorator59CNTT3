/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CondimentType;

import BeverageType.Beverage;
import java.util.ArrayList;

/**
 *
 * @author huuph
 */
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
    
    
}
