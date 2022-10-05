package com.example.lab304.repositories;

import com.example.lab304.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, String> {

    Optional<Aircraft> findByAircraftModelContaining(String aircraftModel);
}
