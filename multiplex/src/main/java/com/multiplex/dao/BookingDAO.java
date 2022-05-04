package com.multiplex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;

import com.multiplex.entities.Booking;

public interface BookingDAO extends JpaRepository<Booking,Integer>{


}