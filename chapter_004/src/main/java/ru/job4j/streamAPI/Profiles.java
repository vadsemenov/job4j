package ru.job4j.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Задача про адресса клиентов.
 * Stream API
 */
public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress()).collect(Collectors.toList());
    }
}
