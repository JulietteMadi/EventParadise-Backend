package co.simplon.eventParadise.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventParadise.dtos.EventCreateDto;
import co.simplon.eventParadise.services.EventService;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class EventController {

    private EventService service;

    public EventController(EventService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody EventCreateDto inputs) {
	service.create(inputs);
    }

}
