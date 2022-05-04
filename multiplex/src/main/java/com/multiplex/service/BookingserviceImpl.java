package com.multiplex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.multiplex.dao.BookingDAO;
import com.multiplex.entities.Booking;

import com.multiplex.exceptions.NotFoundException;
//import com.Multiplex.exceptions.EmptyInputException;

@Service
public class BookingserviceImpl implements Bookingservice{
	@Autowired
	private BookingDAO bookingDao;

	@Override
	public List<Booking> getBooking() {
		
		return bookingDao.findAll();
			
	}

	@Override
	public Booking getBookingById(int book_id) throws NotFoundException{
		Booking booking;
		if(bookingDao.findById(book_id).isEmpty()) {
			throw new NotFoundException();
		}
		else {
			booking=bookingDao.findById(book_id).get();
		}
		
		return booking;
	}

	@Override
	public Booking addBooking(Booking booking){
		bookingDao.save(booking);
		return booking;
	}

	@Override
	public void deleteBookingById(int bookingid) {
		
		Booking obj = bookingDao.getById(bookingid);
		bookingDao.delete(obj);
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingDao.save(booking);
		return booking;
	}
	
}