package com.starwars.planets.domain.service.planet;

import com.starwars.planets.domain.model.planet.Planet;
import com.starwars.planets.port.adapters.repositories.planet.PlanetRepositoryMongoDB;
import org.springframework.stereotype.Service;

@Service
public class PlanetDomainService implements PlanetService {

    private final PlanetRepositoryMongoDB planetRepositoryMongoDB;

    public PlanetDomainService(PlanetRepositoryMongoDB planetRepositoryMongoDB) {
        this.planetRepositoryMongoDB = planetRepositoryMongoDB;
    }

    public Planet save(Planet planet) {
        return planetRepositoryMongoDB.save(planet);
    }

}