package com.dst.bookingservice.web;


import com.dst.bookingservice.entities.Reservation;
import com.dst.bookingservice.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/reserve")
    public List<Reservation> getReservation() {
        return reservationRepository.findAll();
    }
}
