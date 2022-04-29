package com.multiplex.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.dao.BookingDAO;
import com.multiplex.entities.Booking;

@Service
public class BookingserviceImpl implements Bookingservice{
	@Autowired
	private BookingDAO bookingDao;

	public List<Booking> getBooking() {
		// TODO Auto-generated method stub
		return bookingDao.findAll();
	}

	@SuppressWarnings("deprecation")
	public Booking getBookingById(int bookid) {
		// TODO Auto-generated method stub
		return bookingDao.getOne(bookid);
	}

	@Override
	public Booking addBooking(Booking book) {
		// TODO Auto-generated method stub
		bookingDao.save(book);
		return book;
	}

	public void deleteBookingById(int bookid) {
		// TODO Auto-generated method stub
		Booking obj = bookingDao.getOne(bookid);
		bookingDao.delete(obj);
	}

	@Override
	public Booking updateBooking(Booking book) {
		// TODO Auto-generated method stub
		bookingDao.save(book);
		return book;
	}

	@Override
	public Booking cancelBooking(BigInteger bookingid) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking viewBooking(BigInteger bookingid) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewBookings() {
		// TODO Auto-generated method stub
		return null;
	}	
}