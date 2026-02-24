package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void RadioAll() {
        Radio radio = new Radio(2, 7, 3, 99);
        Assertions.assertEquals(2, radio.getMinStation());
        Assertions.assertEquals(7, radio.getMaxStation());
        Assertions.assertEquals(2, radio.getCurrentStation());
        Assertions.assertEquals(3, radio.getMinVolume());
        Assertions.assertEquals(99, radio.getMaxVolume());
        Assertions.assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void testRadioStation() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(10, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void currentStation1() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation2() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation3() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation4() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation5() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation6() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStation7() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(3);
        radio.nextStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation1() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation1() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume1() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume2() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume3() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume4() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume5() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolume() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolume1() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolume2() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioVolume() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioVolume1() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(49);
        radio.decreaseVolume();
        int expected = 48;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioVolume3() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

