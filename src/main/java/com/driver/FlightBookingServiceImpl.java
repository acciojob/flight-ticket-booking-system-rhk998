package com.driver;

import java.util.List;

public class FlightBookingServiceImpl implements FlightBookingService {
	 private final FlightRepository flightRepository;

	    public FlightBookingServiceImpl(FlightRepository flightRepository)
		{
	        this.flightRepository = flightRepository;
	    }

	    @Override
	    public List<Flight> searchFlights(String origin, String destination) {
	        // Delegate the call to the repository
	        return flightRepository.searchFlights(origin, destination);
	    }

	    @Override
	    public Flight getFlightById(int id) {
	        return flightRepository.getFlightById(id);
	    }

	    @Override
	    public void bookFlight(FlightBooking booking) {
	    	flightRepository.bookFlight(booking);
	    }
}
