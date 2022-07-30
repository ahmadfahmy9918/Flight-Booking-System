
package coe528.lab1;

/**
 *
 * @author ahmad
 */


public class Flight {
    int flightNumber;
    String origin;
    String destination;
    String departureTime;
    int capacity;
    int numberOfSeatsLeft;
    double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice)
    {
        if(origin.equals(destination) == true)
        {
            throw new IllegalArgumentException("Origin and destination can't be the same");
        }
        
        
    this.flightNumber = flightNumber;
    this.origin = origin;
    this.destination = destination; 
    this.departureTime = departureTime;
    this.capacity = capacity;
    this.originalPrice = originalPrice;
    numberOfSeatsLeft = capacity;
    }
    
    public boolean bookASeat()
    {
        if(numberOfSeatsLeft > 0)
        {
            numberOfSeatsLeft--;
            return true;
        }
        
        else
        {
           return false; 
        }
        
    }
    
    
    
    
    
    ////getters
    public int getFlightNumber()
    {
        return flightNumber;
    }
    
    public String getOrigin()
    {
        return origin;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public String getDepartureTime()
    {
        return departureTime;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public int getNumberOfSeatsLeft()
    {
        return numberOfSeatsLeft;
    }
    
    public double getOriginalPrice()
    {
        return originalPrice;
    }
    
    
    ///setters
    public void setFlightNumber(int flightNumber)
    {
            this.flightNumber = flightNumber;

    }
    
    public void setOrigin(String origin)
    {
        this.origin = origin;
    
    }
    
    public void setDestination(String destination)
    {
       this.destination = destination; 
   
    }
    
     public void setDepartureTime(String departureTIme)
    {
         this.departureTime = departureTime;
    
    }
    
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
        
    }
    
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft)
    {
        this.numberOfSeatsLeft = numberOfSeatsLeft; 
    }
    
    public void setoriginalprice(double originalPrice)
    {
         this.originalPrice = originalPrice; 
    }
    
 
    
    
   @Override
    public String toString()
	{
            String Flight = "Flight ";
            Flight = Flight + flightNumber + ", ";
            Flight = Flight + origin + " to ";
            Flight = Flight + destination + ", ";
            Flight = Flight + departureTime + ", ";
            Flight = Flight + "Original Price: $" + originalPrice;
           
            
            
            return(Flight);
		
	}
    
    
    
}



