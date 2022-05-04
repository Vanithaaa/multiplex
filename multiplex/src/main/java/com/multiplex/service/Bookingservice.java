package com.multiplex.service;

import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.http.ResponseEntity;

import com.multiplex.entities.Booking;

import com.multiplex.exceptions.NotFoundException;



@Service
public interface Bookingservice {

	public List<Booking> getBooking();
  
	public Booking getBookingById(int book_id) throws NotFoundException;
	
	public Booking addBooking(Booking booking);
	public void deleteBookingById(int book_id);
	public Booking updateBooking(Booking booking);
}