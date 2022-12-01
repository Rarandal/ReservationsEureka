package com.solera.reservationseureka.reservations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class ReservationModel implements Serializable {
    private int IdReserva;
    private int NumVuelo;
    private int IdUsuario;
    private int PosicionAsiento;
}