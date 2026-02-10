package com.flight.booking.clients;

import com.flight.booking.dto.Flights;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        name = "flight-service",
        url = "${flight.service.url}"
)
public interface FlightServiceClient {

    @PutMapping("/flights/update/availableSeat")
    Flights updateAvailableSeats(
            @RequestParam int flightNumber,
            @RequestParam int availableSeats
    );

    @GetMapping("/flights/getDetails/{flightNumber}")
    Flights getDetails(@PathVariable int flightNumber);

    @GetMapping("/flights/check-availability/{flightNumber}")
    Boolean isSeatAvailable(@PathVariable int flightNumber);
}
