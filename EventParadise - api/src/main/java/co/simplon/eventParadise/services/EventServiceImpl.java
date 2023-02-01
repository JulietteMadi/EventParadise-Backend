package co.simplon.eventParadise.services;

import org.springframework.stereotype.Service;

import co.simplon.eventParadise.dtos.EventCreateDto;
import co.simplon.eventParadise.entities.Event;
import co.simplon.eventParadise.entities.Location;
import co.simplon.eventParadise.entities.Topic;
import co.simplon.eventParadise.repositories.EventRepository;
import co.simplon.eventParadise.repositories.LocationRepository;
import co.simplon.eventParadise.repositories.TopicRepository;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository events;
    private LocationRepository locations;
    private TopicRepository topics;

    public EventServiceImpl(EventRepository events,
	    LocationRepository locations,
	    TopicRepository topics) {
	this.events = events;
	this.locations = locations;
	this.topics = topics;
    }

    @Override
    public void create(EventCreateDto inputs) {
	Event event = new Event();
	event.setName(inputs.getName());
	event.setDate(inputs.getDate());
	Long locationId = inputs.getLocationId();
	Location location = locations
		.getReferenceById(locationId);
	event.setLocation(location);
	Long topicId = inputs.getTopicId();
	Topic topic = topics.getReferenceById(topicId);
	event.setTopic(topic);
	event.setPrice(inputs.getPrice());
	event.setDescription(inputs.getDescription());
	this.events.save(event);
    }

}
