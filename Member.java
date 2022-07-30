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
public class Member extends Passenger{
int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
        
    }
    
    public void setyearsOfMembership(int years){
        this.yearsOfMembership = years;
    }
    
    public int getyearsOfMembership(){
        return this.yearsOfMembership;
    }
    
    
    /**
     *
     * @param p
     * @return
     */
    @Override
    public double applyDiscount(double p)
    {
        if(yearsOfMembership > 5)
        {
            p = p - 0.5*p;
            return p;
        }
        
        else if(yearsOfMembership > 1 && yearsOfMembership <= 5)
        {
            p = p - 0.1*p;
            return p;
        }
        
        else
            return p;
        
    }
    
}
