package com.addressBook.model;

import java.util.Objects;

public class Address {

    private String id;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String postalCode;
    private String city;
    private String country;

    public Address(String id, String firstName, String lastName, String addressLine1, String addressLine2, String postalCode, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(firstName, address.firstName) && Objects.equals(lastName, address.lastName) && Objects.equals(addressLine1, address.addressLine1) && Objects.equals(addressLine2, address.addressLine2) && Objects.equals(postalCode, address.postalCode) && Objects.equals(city, address.city) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, addressLine1, addressLine2, postalCode, city, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

