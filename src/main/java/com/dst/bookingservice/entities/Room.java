package com.dst.bookingservice.entities;

import com.dst.bookingservice.enums.RoomTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    int number;
    int level;
    @Enumerated(EnumType.ORDINAL)
    RoomTypeEnum type;

    boolean isBeachView;

    boolean isBooked;

    @ManyToMany
    List<Reservation> reservationList;



}
