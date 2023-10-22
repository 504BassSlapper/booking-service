package com.dst.bookingservice.service.impl;

import com.dst.bookingservice.helper.InitialisationHelper;
import com.dst.bookingservice.repository.ReservationRepository;
import com.dst.bookingservice.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitServiceImpl  implements InitService {
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    InitialisationHelper initialisationHelper;

    @Override
    public void populateDatabase() {
        reservationRepository.saveAll(initialisationHelper.buildDataSet());
    }
}
