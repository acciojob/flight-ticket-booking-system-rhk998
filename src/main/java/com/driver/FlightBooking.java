package com.driver;

public class FlightBooking {
	private int id;
    private Flight flight;
    private String passengerName;
    private int numTickets;

    public FlightBooking() {
    }

    public FlightBooking(int id, Flight flight, String passengerName, int numTickets) {
        this.id = id;
        this.flight = flight;
        this.passengerName = passengerName;
        this.numTickets = numTickets;
    }

    // Getters and Setters

    public int getId() {
    	// your code goes here
        return id;
    }
    public Flight getFlight() {
    	// your code goes here
        return flight;
    }

    public String getPassengerName() {
    	// your code goes here
        return passengerName;
    }
    public int getNumTickets() {
    	// your code goes here
        return numTickets;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }
}
