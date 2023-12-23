package com.example.DatabaseMapping.Repsositry;

import com.example.DatabaseMapping.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
