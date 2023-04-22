package com.addressBook.repository;

import com.addressBook.model.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class AddressRepository {

    private final List<Address> addresses = new ArrayList<>();

    public AddressRepository() {
        addresses.add(new Address(
                UUID.randomUUID().toString(),
                "Jane",
                "Smith",
                "Fika Avenue 14",
                "",
                "11359",
                "Stockholm",
                "Sweden"
        ));
        addresses.add(new Address(
                UUID.randomUUID().toString(),
                "Sven",
                "Svensson",
                "Karl Johans Gata 28",
                "Lgh. 5",
                "11359",
                "Helsingborg",
                "Sweden"
        ));
        addresses.add(new Address(
                UUID.randomUUID().toString(),
                "Catness",
                "Wingårdh",
                "Kattsgatan 5",
                "Lgh. 9",
                "11359",
                "Gothenburg",
                "Sweden"
        ));
    }

    public List<Address> getAllAddresses() {
        return addresses;
    }

    public Address createAddress(Address address) {
        addresses.add(address);
        return address;
    }

    // Returns address by id
    public Address getAddressById(String id) {
        for (Address address : addresses) {
            if (address.getId().equals(id)) {
                return address;
            }
        }
        return null;
    }

    // Returns address with associated first name
    public Address getAddressByFirstName(String firstName) {
        for (Address address : addresses) {
            if (address.getFirstName().equals(firstName)) {
                return address;
            }
        }
        return null;
    }

    // Returns address with associated street name
    public Address getAddressByStreet(String addressLine1) {
        for (Address address : addresses) {
            if (address.getAddressLine1().equals(addressLine1)) {
                return address;
            }
        }
        return null;
    }

    // Deletes address with associated id
    public Address deleteAddress(String id) {
        for (Address address : addresses) {
            if (address.getId().equals(id)) {
                addresses.remove(address);
            }
        }
        return null;
    }

    // Replaces the address with associated id, need new
    // address object since we do not have form data
    public Address updateAddress(String id, Address updatedAddress) {
        for (Address address : addresses) {
            if (address.getId().equals(id)) {
                address.setFirstName(updatedAddress.getFirstName());
                address.setLastName(updatedAddress.getLastName());
                address.setAddressLine1(updatedAddress.getAddressLine1());
                address.setAddressLine2(updatedAddress.getAddressLine2());
                address.setPostalCode(updatedAddress.getPostalCode());
                address.setCity(updatedAddress.getCity());
                address.setCountry(updatedAddress.getCountry());
                return address;
            }
        }
        return null;
    }
}
