package com.dst.bookingservice;

import com.dst.bookingservice.entities.Reservation;
import com.dst.bookingservice.enums.ReservcationStatus;
import com.dst.bookingservice.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
		return args -> {
			reservationRepository.save(Reservation.builder()
					.price(120.23)
					.title("4 rooms Cottage")
					.reservcationStatus(ReservcationStatus.CREATED).build());

		};
	}
}
