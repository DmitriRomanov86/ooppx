package ru.netology.statistic;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void currentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        int actual = cond.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(3);
        int actual = cond.getCurrentVolume();
        int expected = 3;
        assertEquals(expected, actual);
    }

}