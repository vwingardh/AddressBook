package com.addressBook.controller;


import com.addressBook.model.Address;
import com.addressBook.repository.AddressRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressRepository.getAllAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable String id) {
        return addressRepository.getAddressById(id);
    }

    @GetMapping("/name/{firstName}")
    public Address getAddressByFirstName(@PathVariable String firstName) {
        return addressRepository.getAddressByFirstName(firstName);
    }

    @GetMapping("/street/{addressLine1}")
    public Address getAddressByStreet(@PathVariable String addressLine1) {
        return addressRepository.getAddressByStreet(addressLine1);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressRepository.createAddress(address);
    }

    @DeleteMapping("/delete/{id}")
    public Address deleteAddress(@PathVariable String id) {
        return addressRepository.deleteAddress(id);
    }

    @PutMapping("/update/{id}")
    public Address updateAddress(@PathVariable String id, @RequestBody Address updatedAddress) {
        return addressRepository.updateAddress(id, updatedAddress);
    }
}
