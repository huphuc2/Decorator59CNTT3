/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeverageType;

/**
 *
 * @author huuph
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 12; //To change body of generated methods, choose Tools | Templates.
    }
    
}
