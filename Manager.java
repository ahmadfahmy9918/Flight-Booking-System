/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Manager {
    Flight[] flights;
    Ticket[] issuedTickets;
    static int counter = 0;
    
    
    //public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice)
    public void createFlights()
    {
        flights = new Flight [4];
        issuedTickets = new Ticket [100];
        flights[0] = new Flight(11, "Toronto", "San Francisco", "03/13/2020", 176, 260.5);
        flights[1] = new Flight(12, "California", "Vancouver", "01/12/2020", 190, 380.5);
        flights[2] = new Flight(13, "Paris", "Tokyo", "02/14/2020", 180, 390.5);
        flights[3] = new Flight(14, "New York", "Hellsinki", "03/13/2020", 888, 217.5);
        System.out.println("---------------------------------------------------------");
         for(Flight y: flights){
             System.out.println(y.toString());
             System.out.println("---------------------------------------------------------");
         
         }
    }
    
    public void displayAvailableFlights(String origin, String destination)
    {
        for(Flight y: flights){
            if(y.numberOfSeatsLeft != 0 && y.origin.equals(origin) && y.destination.equals(destination))
            {
                System.out.println(y.toString());
            }
        }
    }
    
    public Flight getFlight(int flightNumber)
    {
        for(Flight y: flights){
            if(y.flightNumber == flightNumber)
            {
                return y;
            }
        }
        
        return null;
    }
    
    
    public void bookSeat(int flightNumber, Passenger p)
    {
        double ticketPrice;
        boolean check = false;
        Ticket passTicket = new Ticket(null, null, 0);
        
        for(Flight y: flights){
            if(y.flightNumber == flightNumber)
            {
               y.bookASeat();
               if(y.bookASeat() == true)
               {
                   check = true;
                   ticketPrice = p.applyDiscount(y.getOriginalPrice());
                   
                   passTicket.setFlight(y);
                   passTicket.setPassenger(p);
                   passTicket.setPrice(ticketPrice);
                   
                   System.out.println(passTicket.toString() + ", Your Price: $" + ticketPrice + ", Ticket Number: " + passTicket.tickNumber);
                   
                   issuedTickets[counter++] =  passTicket;
                   
               }
            
               else
                  System.out.println("No avialable seats");
               
            }
            
            
            

     }
        
        if(check == false) 
            System.out.println("No flight's with matching flight number");
       
        
    
   }
    
    
    
    
    public static void main(String[] args)
    {
        String book, person;
        int age, memberS, flightnum;
        Manager Ahmad = new Manager();
        Ahmad.createFlights();
        Passenger p;
        Scanner scan = new Scanner(System.in);
        Scanner info = new Scanner(System.in);
        
        
        System.out.println("Would you like to book a flight enter 'yes' for yes, and 'no' for no");
        book =  scan.nextLine();
        while(book.equals("yes")){
            System.out.println("Are you a member for yes input 'yes' and for no input 'no'");
            book = scan.nextLine();
            
            
            if(book.equals("yes")){
                System.out.println("Enter your name, age, years of membership and flight number");
                person = info.next();
                age = info.nextInt();
                memberS = info.nextInt();
                flightnum = info.nextInt();
                p = new Member(person,age, memberS);
                Ahmad.bookSeat(flightnum, p);
                
            }
            else{
                System.out.println("Enter you Name, age, flight number");
                person = info.next();
                age = info.nextInt();
                flightnum = info.nextInt();
                p = new NonMember(person, age);
                Ahmad.bookSeat(flightnum, p);
            }
           
            System.out.println("Would you like to book a flight enter 'yes' for yes and 'no' for no");
            book =  scan.nextLine();
            
            
        }
        
        
        Ahmad.displayAvailableFlights("Toronto","San Francisco");
        
        System.out.println(Ahmad.getFlight(13));
    }
    
    
    
    
}
