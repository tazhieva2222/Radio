package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    
    
     @Test
    public void createRadio() {
        String expected = "Uzer";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void validateChangeFields() {
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());
    }

 
    @Test
    public void atMaxRadioStationPressNextStation() {
        radio.setMaxRadioStation(10);
        radio.pressNextStation();
        assertEquals(0,radio.getMinRadioStation());
    }
 
    @Test
    public void atMinRadioStationPressPrevStation() {
        radio.setMinRadioStation(0);
        radio.pressPrevStation();
        assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void changeOverLastRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressNextStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressPrevStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void OverInitialRadioStation() {
        radio.setCurrentRadioStation(11);
        radio.getMaxRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void UnderInitialRadioStation() {
        radio.setCurrentRadioStation(-1);
        radio.getMinRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    // ?????????????????? ??????????????????
    @Test
    public void volumeOverMax() {
        radio.setCurrentVolume(11);
        radio.getMaxVolume();
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void atMaxVolumePlusVolume() {
        radio.setMaxVolume(10);
        radio.pressPlusVolume();
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void atMinVolumeMinusVolum() {
        radio.setMinVolume(0);
        radio.pressMinusVolume();
        assertEquals(0, radio.getMinVolume());

    }
    
    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentVolume(-11);
        radio.getMinVolume();
        assertEquals(0, radio.getMinVolume());

    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(4);
        radio.pressPlusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(4);
        radio.pressMinusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

}
