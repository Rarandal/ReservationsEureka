package com.solera.reservationseureka.reservations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public List<ReservationModel> getAllReservations() {
        List<ReservationModel> reservationModels = reservationRepository.findAll();
        return reservationModels;
    }

    @Override
    public ReservationModel getReservationById(@PathVariable long id) {
        return (ReservationModel) (reservationRepository.findById(id).orElse(null));
    }

    @Override
    public boolean addReservation(ReservationModel reservationModel) {
        try {
            reservationRepository.save(reservationModel);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteReservation(@PathVariable Long id) {
        try {
            ReservationModel model = reservationRepository.findById(id).get();
            reservationRepository.delete(model);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
