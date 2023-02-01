package co.simplon.eventParadise.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventParadise.dtos.LocationViewDto;
import co.simplon.eventParadise.services.LocationService;

@RestController
@RequestMapping("/locations")
@CrossOrigin
public class LocationController {
    private LocationService service;

    public LocationController(LocationService service) {
	this.service = service;
    }

    @GetMapping
    public Collection<LocationViewDto> getAll() {
	return service.getAll();
    }

}
