package co.simplon.eventParadise.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.eventParadise.dtos.LocationViewDto;
import co.simplon.eventParadise.entities.Location;

public interface LocationRepository
	extends JpaRepository<Location, Long> {
    Collection<LocationViewDto> findAllProjectedBy();
}
