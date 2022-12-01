package com.solera.reservationseureka.reservations;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public interface ReservationService {
    List<ReservationModel> getAllReservations();

    ReservationModel getReservationById(@PathVariable long id);

    boolean addReservation(ReservationModel reservationModel);

    boolean deleteReservation(@PathVariable Long id);
}
