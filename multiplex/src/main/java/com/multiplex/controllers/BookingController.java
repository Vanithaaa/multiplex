package com.multiplex.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.multiplex.entities.Booking;
import com.multiplex.service.Bookingservice;

@RestController
public class BookingController {

	@Autowired

	private Bookingservice bookingservice;

	@RequestMapping("/booking")
	public String booking() {
		return "this is booking list";
	}
	@GetMapping("/bookings")
	public List<Booking> getBooking() {
		return this.bookingservice.getBooking();
	}
	
	 @GetMapping(value="/bookings/{book_id}")
	 public ResponseEntity getBookingById(@PathVariable ("book_id") int book_id) {
		  	return new ResponseEntity(bookingservice.getBookingById(book_id),HttpStatus.OK);
		  	
	  }
	
	  @PostMapping("/bookings")
	  public Booking addBooking(@RequestBody Booking booking)  {  
		  return this.bookingservice.addBooking(booking);
	  }
	  
	  @PutMapping("/bookings")
	  public Booking updateBooking(@RequestBody Booking booking)
	 {
		  return this.bookingservice.updateBooking(booking); 
		  } 
	  
	  @DeleteMapping("/bookings/{book_id}")
	  public void deleteBookingById(@PathVariable int book_id) {
		   this.bookingservice.deleteBookingById(book_id);
		  } 
	
}