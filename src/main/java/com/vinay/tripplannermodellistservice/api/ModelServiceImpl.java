package com.vinay.tripplannermodellistservice.api;


import com.vinay.trip.client.TripPlannerFeignClient;
import com.vinay.trip.client.config.TripPlannerFeignConfiguration;
import com.vinay.trip.model.Trip;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ModelServiceImpl implements ModelService {

    @Autowired
    TripPlannerFeignClient tripPlanner;

    @Override
    public ResponseEntity<List<Trip>> getModelService(String country) {
        log.info("Inside getModelService {}", country);
        return new ResponseEntity<>(tripPlanner.getTripsByCountry(country), HttpStatus.OK);
    }
}
