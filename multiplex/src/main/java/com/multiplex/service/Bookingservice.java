package com.multiplex.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.http.ResponseEntity;

import com.multiplex.entities.Booking;
@Service
public interface Bookingservice {
	public Booking addBooking(Booking booking);
	public Booking cancelBooking(BigInteger bookid) throws BookingNotFoundException;
	public Booking viewBooking(BigInteger bookid) throws BookingNotFoundException;
	public Booking updateBooking(Booking book);
	public List<Booking> viewBookings();
	public Booking getBookingById(int bookid);
	public List<Booking> getBooking();

	}