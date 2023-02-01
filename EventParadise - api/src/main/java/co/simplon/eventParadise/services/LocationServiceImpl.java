package co.simplon.eventParadise.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.eventParadise.dtos.LocationViewDto;
import co.simplon.eventParadise.repositories.LocationRepository;

@Service
public class LocationServiceImpl
	implements LocationService {
    private LocationRepository locations;

    public LocationServiceImpl(
	    LocationRepository locations) {
	this.locations = locations;
    }

    @Override
    public Collection<LocationViewDto> getAll() {
	return locations.findAllProjectedBy();
    }

}
