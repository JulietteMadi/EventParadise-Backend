package co.simplon.eventParadise.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventParadise.dtos.TopicViewDto;
import co.simplon.eventParadise.services.TopicService;

@RestController
@RequestMapping("/topics")
@CrossOrigin
public class TopicController {
    private TopicService service;

    public TopicController(TopicService service) {
	this.service = service;
    }

    @GetMapping
    public Collection<TopicViewDto> getAll() {
	return service.getAll();
    }

}
