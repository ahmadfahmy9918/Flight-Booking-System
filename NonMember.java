/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author ahmad
 */
public class NonMember extends Passenger {

    public NonMember(String name, int age) {
        super(name, age);
    }

   
    /**
     *
     * @param p
     * @return
     */
    @Override
    public double applyDiscount(double p)
    {
        if(age > 65)
            return p - p*(0.1);
        
        else
            return p;
    }
}
