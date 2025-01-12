package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryFlightRepository implements FlightRepository {

	 private final Map<Integer, Flight> flights;
	    private final Map<Integer, FlightBooking> bookings;
	    private int bookingId;

	    public InMemoryFlightRepository() {
			this.flights = new HashMap<>();
			this.bookings = new HashMap<>();
			this.bookingId = 1;

			flights.put(1, new Flight(1, "AA123", "New York", "London", 500.0, 100, 50));
			flights.put(2, new Flight(2, "BA456", "London", "New York", 600.0, 100, 30));

			System.out.println(flights.get(1));
	    }

	    @Override
	    public List<Flight> searchFlights(String origin, String destination) {
	        List<Flight> result = new ArrayList<>();
	        for(Flight flight : flights.values()){
				if(flight.getOrigin() != null && flight.getOrigin().equalsIgnoreCase(origin)&&
						flight.getDestination() != null && flight.getDestination().equalsIgnoreCase(destination)){
					result.add(flight);
				}
			}
	        return result;
	    }

	    @Override
	    public Flight getFlightById(int id) {
	        return flights.get(id);
	    }

	    @Override
	    public void bookFlight(FlightBooking booking) {
	    	// your code goes here
			Flight flight = booking.getFlight();
			int seatsAvailable = flight.getAvailableSeats();

			if(seatsAvailable>=booking.getNumTickets()){
				flight.setAvailableSeats(seatsAvailable - booking.getNumTickets());
				booking.setId(bookingId++);
				bookings.put(booking.getId(), booking);
			}
	    }
}
