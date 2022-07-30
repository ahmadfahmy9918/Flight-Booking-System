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
public class Ticket {
    Passenger passenger;
    Flight flight;
    double price;
    static int tickNumber = 0;
    
    public Ticket(Passenger p, Flight flight, double price)
    {
        p = passenger;
        this.flight = flight;
        this.price = price;
        tickNumber++;
        
    }
    
    //getters
    public Passenger getPassenger()
    {
        return passenger;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public Flight getFlight()
    {
        return flight;
    }
    
    public int getTickNumber()
    {
        return tickNumber;
    }
    
    
    //setters
    public void setFlight(Flight flight)
    {
            this.flight = flight;

    }
    
    public void setPrice(double price)
    {
            this.price = price;

    }
    
    public void setPassenger(Passenger passenger)
    {
            this.passenger = passenger;

    }
    
    public void setTickNumber(int tickNumber)
    {
            this.tickNumber = tickNumber;
            
    }
    
    @Override
    public String toString()
	{
            String ticket = passenger.name + ", ";
            ticket = ticket + flight.toString();
            
            return(ticket);
		
	}
    
}
