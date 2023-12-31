package com.dst.bookingservice.entities;

import com.dst.bookingservice.enums.ReservcationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    double price;
    @Enumerated(EnumType.ORDINAL)
    ReservcationStatus reservcationStatus;

    // many reservations to many rooms
    @ManyToMany
    List<Room> room;


}
