package com.solera.reservationseureka.reservations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class ReservationModel implements Serializable {
    @Id
    private int idReserva;
    private int numVuelo;
    private int idUsuario;
    private int posicionAsiento;
}