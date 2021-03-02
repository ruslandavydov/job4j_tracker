package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    private List<Profile> profiles = new ArrayList<>();

    @Before
    public void setProfiles() {
        profiles.add(new Profile(new Address("Moscow", "Volgina", 8, 92)));
        profiles.add(new Profile(new Address("Dzerzhinsk", "Udrisa", 11, 54)));
        profiles.add(new Profile(new Address("Bryansk", "Lenina", 13, 26)));
        profiles.add(new Profile(new Address("Moscow", "Volgina", 8, 92)));
    }

    @Test
    public void collect() {
        Profiles prof = new Profiles();
        List<Address> rsl = prof.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Bryansk", "Lenina", 13, 26));
        expected.add(new Address("Dzerzhinsk", "Udrisa", 11, 54));
        expected.add(new Address("Moscow", "Volgina", 8, 92));
        assertThat(rsl, is(expected));
    }
}
