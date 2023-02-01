package co.simplon.eventParadise.services;

import co.simplon.eventParadise.dtos.EventCreateDto;

public interface EventService {
    void create(EventCreateDto inputs);
}
