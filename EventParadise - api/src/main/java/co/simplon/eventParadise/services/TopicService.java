package co.simplon.eventParadise.services;

import java.util.Collection;

import co.simplon.eventParadise.dtos.TopicViewDto;

public interface TopicService {
    Collection<TopicViewDto> getAll();
}
