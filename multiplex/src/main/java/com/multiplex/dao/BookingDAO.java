package com.multiplex.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.entities.Booking;

public interface BookingDAO extends JpaRepository<Booking,Integer>{

}