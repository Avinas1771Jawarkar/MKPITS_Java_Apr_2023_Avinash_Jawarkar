package com.example.DatabaseMapping.Service;

import com.example.DatabaseMapping.Entity.Address;
import com.example.DatabaseMapping.Entity.Student;
import com.example.DatabaseMapping.Repsositry.AddressRepository;
import com.example.DatabaseMapping.Repsositry.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImplement implements AddressService {

    private AddressRepository addressRepository;

@Autowired
    public AddressServiceImplement(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Override
    public Address findid(Integer id) {
        return addressRepository.findById(id).get();
    }
}
