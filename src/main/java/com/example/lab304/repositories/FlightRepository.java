package com.example.lab304.repositories;

import com.example.lab304.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {

    List<Flight> findByFligthMilleageGreaterThan(int x);
}
