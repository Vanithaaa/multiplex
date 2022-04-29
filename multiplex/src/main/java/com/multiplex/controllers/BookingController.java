package com.multiplex.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@GetMapping("/booking")
	public List<Booking> getBooking() {
		return this.bookingservice.getBooking();
	}
	  @RequestMapping("/booking/{book_id}")
	  public Booking getBookingById(@PathVariable int book_id)  {
		  	return this.bookingservice.getBookingById(book_id);
		  }  
	  @PostMapping("/booking")
	  public Booking addBooking(@RequestBody Booking booking) {
		  
		  return this.bookingservice.addBooking(booking);
	  }
	  @PutMapping("/booking")
	  public Booking updateBooking(@RequestBody Booking booking)
	 {
		  return this.bookingservice.updateBooking(booking); 
		  }  
	  @DeleteMapping("/booking/{book_id}")
	  public void deleteBooking(@PathVariable int book_id) {
		   this.bookingservice.getBookingById(book_id);
		  } 
}
