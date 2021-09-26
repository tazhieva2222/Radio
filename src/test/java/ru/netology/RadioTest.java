package ru.netology;

import jdk.jfr.DataAmount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldInFields() {
        Radio radio = new Radio("User", 9, 10, 0, 4, 100, 0, 50, true);

                assertEquals("User", radio.getName());
        assertEquals(9, radio.getNumberRadioStation());
        assertEquals(10, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(4, radio.getCurrentRadioStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(50, radio.getCurrentVolume());
        assertTrue(radio.isOn());

    }
}

