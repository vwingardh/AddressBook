package com.addressBook.model;


import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressTest {
    @Test
    void create_new_address() {
        Address address = new Address(
                UUID.randomUUID().toString(),
                "Jane",
                "Smith",
                "Testing 123",
                "",
                "11359",
                "Stockholm",
                "Sweden"
        );

        assertNotNull(address);
        assertEquals("Jane", address.getFirstName());
        assertEquals("Smith", address.getLastName());
        assertEquals("Testing 123", address.getAddressLine1());
        assertEquals("", address.getAddressLine2());
        assertEquals("11359", address.getPostalCode());
        assertEquals("Stockholm", address.getCity());
        assertEquals("Sweden", address.getCountry());
    }
}
