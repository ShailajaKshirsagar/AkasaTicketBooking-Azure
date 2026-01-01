package com.ticket.booking.controller;

import com.ticket.booking.entity.Flight;
import com.ticket.booking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/save")
    public ResponseEntity<String> saveFlight(@RequestBody Flight flight){
        Flight flight1 = this.flightService.saveFlight(flight);
        String msg = "Flight saved with id" + flight1.getId();
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Flight>> getALlFlight(){
        List<Flight> allFlights = this.flightService.getAllFlights();
        return new ResponseEntity<>(allFlights, HttpStatus.FOUND);
    }
}
