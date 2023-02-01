package co.simplon.eventParadise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.eventParadise.entities.Event;

public interface EventRepository
	extends JpaRepository<Event, Long> {

}
