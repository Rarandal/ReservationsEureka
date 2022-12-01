package com.solera.reservationseureka.reservations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationEndpoint {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/Reservations")
    public List<ReservationModel> getAllReservations() {
        return (reservationService.getAllReservations());
    }

    @GetMapping("/Reservation/{id}")
    public ReservationModel getReservation(@PathVariable long id) {
        return (reservationService.getReservationById(id));
    }

    @PostMapping("/createReservation")
    public ReservationModel add(@RequestBody ReservationModel reservationModel) {
        reservationService.addReservation(reservationModel);
        return reservationModel;
    }
    @DeleteMapping("/deleteReservation/{id}")
    public String delete(@PathVariable Long id) {
        return reservationService.deleteReservation(id) ? "ok" : "failed";
    }
}
