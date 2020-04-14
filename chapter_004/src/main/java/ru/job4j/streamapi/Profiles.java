package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Задача про адресса клиентов.
 * Stream API
 */
public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress())
                .sorted((ad1, ad2) -> ad1.getCity().compareTo(ad2.getCity()))
                .distinct().collect(Collectors.toList());
    }
}
