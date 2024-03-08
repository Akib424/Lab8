package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import androidx.collection.ArraySet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList cityList;
    private City city;







    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        return new CustomList(null, new ArrayList<>());
    }



    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        CustomList list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }


















    @BeforeEach
    void setUp() {
        cityList = MockCityList();
        city = new City("New York", "USA");
        cityList.addCity(city);
    }


    @Test
    @DisplayName("Test if the city is in the list")
    void testHasCity() {
        Assertions.assertTrue(cityList.hasCity(city), "City should be in the list");
    }

    @Test
    @DisplayName("Test deleting a city from the list")
    void testDeleteCity() {
        cityList.delete(city);
        Assertions.assertFalse(cityList.hasCity(city), "City should be removed from the list");
    }

    @Test
    @DisplayName("Test the count of cities in the list")
    void testCountCities() {
        Assertions.assertEquals(1, cityList.countCities(), "Count should return the correct number of cities in the list");
    }


}
