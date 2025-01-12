package com.driver;

public class Flight {
	 private int id;
	    private String flightNumber;
	    private String origin;
	    private String destination;
	    private double price;
	    private int capacity;
	    private int availableSeats;

	    public Flight() {
	        // your code goes here
	    }

	    public Flight(int id, String flightNumber, String origin, String destination, double price, int capacity, int availableSeats) {
	    	// your code goes here
	    }

	    // Getters and Setters

	    public int getId() {
	    	// your code goes here
	        return id;
	    }

	    public String getFlightNumber() {
	    	// your code goes here
	        return flightNumber;
	    }
	    public String getOrigin() {
	    	// your code goes here
	        return origin;
	    }

	    public String getDestination() {
	    	// your code goes here
	        return destination;
	    }
	    public double getPrice() {
	    	// your code goes here
	        return price;
	    }
	    public int getCapacity() {
	    	// your code goes here
	        return capacity;
	    }
	    public int getAvailableSeats() {
	    	// your code goes here
	        return availableSeats;
	    }


	public void setId(int id) {
		this.id = id;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
}
