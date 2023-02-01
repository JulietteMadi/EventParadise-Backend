package co.simplon.eventParadise.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.eventParadise.dtos.TopicViewDto;
import co.simplon.eventParadise.entities.Topic;

public interface TopicRepository
	extends JpaRepository<Topic, Long> {
    Collection<TopicViewDto> findAllProjectedBy();
}
