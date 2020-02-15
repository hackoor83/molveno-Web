package com.example.molveno.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @PostMapping
    public void addReervation(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
    }
}
