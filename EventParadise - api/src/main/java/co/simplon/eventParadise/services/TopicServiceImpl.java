package co.simplon.eventParadise.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.eventParadise.dtos.TopicViewDto;
import co.simplon.eventParadise.repositories.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService {

    private TopicRepository topics;

    public TopicServiceImpl(TopicRepository topics) {
	this.topics = topics;
    }

    @Override
    public Collection<TopicViewDto> getAll() {
	return topics.findAllProjectedBy();
    }

}
