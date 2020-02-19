package com.example.molveno.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private TablesRepository tablesRepository;


    @GetMapping("/reservation")
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @GetMapping("/restauranttables")
    public List<RestaurantTables> getTables(){
        return tablesRepository.findAll();
    }

    @PostMapping("/reservation")
    public void addReservation(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @PostMapping("/restauranttables")
    public void addTable(@RequestBody RestaurantTables restaurantTables){
        tablesRepository.save(restaurantTables);
    }

    @DeleteMapping("/reservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationRepository.deleteById(id);
    }

    @DeleteMapping("/restauranttables/{id}")
    public void deleteTable(@PathVariable Long id){
        tablesRepository.deleteById(id);
    }
}
