package co.simplon.eventParadise.services;

import java.util.Collection;

import co.simplon.eventParadise.dtos.LocationViewDto;

public interface LocationService {
    Collection<LocationViewDto> getAll();
}
