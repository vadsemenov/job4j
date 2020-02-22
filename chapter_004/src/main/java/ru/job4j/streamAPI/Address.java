package ru.job4j.streamAPI;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(this, address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city,street,home,apartment);
    }
}
