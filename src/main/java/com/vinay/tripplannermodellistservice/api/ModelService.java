package com.vinay.tripplannermodellistservice.api;

import com.vinay.trip.model.Trip;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface ModelService {

    @RequestMapping(value = "modelServiceList/{country}",method =  RequestMethod.GET)
    public ResponseEntity<List<Trip>> getModelService(@PathVariable String country);
}
