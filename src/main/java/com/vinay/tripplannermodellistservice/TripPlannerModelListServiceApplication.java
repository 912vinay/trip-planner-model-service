package com.vinay.tripplannermodellistservice;

import com.vinay.trip.client.config.TripPlannerFeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.vinay.trip"})
public class TripPlannerModelListServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripPlannerModelListServiceApplication.class, args);
	}

}
