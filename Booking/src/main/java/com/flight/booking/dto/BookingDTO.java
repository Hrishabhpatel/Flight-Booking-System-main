package com.flight.booking.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(description = "BookingDTO representing booking details")
public class    BookingDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Schema(description = "Email Id", example = "hrishabhpatel19@gmail.com")
    private String emailId;

    @Schema(description = "Flight Number", example = "1001")
    private int flightNumber;

    @Schema(description = "Passenger Name", example = "Hrishabh Patel")
    private String passengerName;

    @Schema(description = "Booking Date", example = "2026-01-12")
    private LocalDate bookingDate;

    @Schema(description = "Status")
    private String status;

    public BookingDTO() {
        this.status = "CONFIRMED";
    }

}
