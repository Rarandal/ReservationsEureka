package com.solera.reservationseureka.reservations;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends MongoRepository<ReservationModel, Long> {
}
