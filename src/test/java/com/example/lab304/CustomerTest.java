package com.example.lab304;

import com.example.lab304.model.Aircraft;
import com.example.lab304.model.Customer;
import com.example.lab304.model.Flight;
import com.example.lab304.repositories.AircraftRepository;
import com.example.lab304.repositories.CustomerRepository;
import com.example.lab304.repositories.FlightRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CustomerTest {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AircraftRepository aircraftRepository;

    @Autowired
    FlightRepository flightRepository;

    @Test
    void create_user_OK(){
        Customer customer = customerRepository.save(new Customer("Alejandro", 3, 500));
        Optional<Customer> customerOptional = customerRepository.findById(customer.getId());
        assertTrue(customerOptional.isPresent());
        assertEquals(500, customerOptional.get().getTotalMileage());
    }

    @Test
    void find_by_name_isOk(){
        Customer customer = customerRepository.save(new Customer("Max", 3, 500));
        assertEquals(500, customerRepository.findByName("Max").get().getTotalMileage());

    }

    @Test
    void find_aicraftModel_startsWith(){
        Aircraft aircraft = aircraftRepository.save(new Aircraft("Boeing747", 230));
        Optional<Aircraft> optionalAircraft = aircraftRepository.findByAircraftModelContaining("Boeing");
        assertTrue(optionalAircraft.isPresent());
    }

    @Test
    void find_flight_greater_than(){
        Flight flight = flightRepository.save(new Flight("AZ7984", "Boeing111", 4560));
        List<Flight> flightList = flightRepository.findByFligthMilleageGreaterThan(4000);
        assertEquals("AZ7984", flightList.get(0).getFlightNumber());
        assertEquals(1, flightList.size());
    }


}
