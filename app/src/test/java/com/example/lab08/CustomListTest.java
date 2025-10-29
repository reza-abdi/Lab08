package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));

    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Yellowknife", "NT");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City city1 = new City("Regina", "SK");
        City city2 = new City("Toronto", "ON");
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(2, list.countCities());
    }
}
