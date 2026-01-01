package com.ticket.booking.service;

import com.ticket.booking.entity.Flight;

import java.util.List;

public interface FlightService {
    Flight saveFlight(Flight flight);

    List<Flight> getAllFlights();
}
