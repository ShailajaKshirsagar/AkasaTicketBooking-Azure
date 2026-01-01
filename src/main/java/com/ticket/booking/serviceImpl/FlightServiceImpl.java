package com.ticket.booking.serviceImpl;

import com.ticket.booking.entity.Flight;
import com.ticket.booking.repository.FlightRepo;
import com.ticket.booking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepo flightRepo;

    @Override
    public Flight saveFlight(Flight flight) {
        Flight flight1 = flightRepo.save(flight);
        System.out.println("Flight saved with name : " +flight1.getName());
        return flight1;
    }

    @Override
    public List<Flight> getAllFlights() {
        return this.flightRepo.findAll();
    }
}
