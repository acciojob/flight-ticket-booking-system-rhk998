package com.driver;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightBookingController {

	   private final FlightBookingService flightBookingService;

	    public FlightBookingController(FlightBookingService flightBookingService) {
	        this.flightBookingService = flightBookingService;
	    }

	    @GetMapping
	    public List<Flight> searchFlights(@RequestParam String origin, @RequestParam String destination) {
	        return flightBookingService.searchFlights(origin, destination);
	    }

	    @GetMapping("/{id}")
	    public Flight getFlightById(@PathVariable int id) {
	        return flightBookingService.getFlightById(id);
	    }

	    @PostMapping("/book")
	    public ResponseEntity<String> bookFlight(@RequestBody FlightBooking booking) {
	        return ResponseEntity.ok("Booking successful");
	    }
}
