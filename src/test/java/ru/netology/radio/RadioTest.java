package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);  // установка номера радиостанции
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setUnderMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5); // установка номера радиостанции ниже минимального
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setAboveMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(15); // установка номера радиостанции выше максимального
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinLeftLimitNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1); // проверка граничных значений
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLeftLimitNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(0); // проверка граничных значений
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxLeftLimitNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(1); // проверка граничных значений
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinRightLimitNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(8); // проверка граничных значений
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRightLimitNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(9); // проверка граничных значений
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxRightLimitNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(10); // проверка граничных значений
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);// переключение на следующую станцию
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAboveMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);// переключение на следующую станцию выше максимальной
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);// переключение на предыдущую станцию
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationUnderMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);// переключение на предыдущую станцию меньше минимальной
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxStationNumber() {
        Radio radio = new Radio(30); // максимальное количество станций
        radio.setCurrentStation(20);

        int expected = 20;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        int expected = 30;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinLeftLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLeftLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxLeftLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinRightLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRightLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxRightLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseAboveMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(199);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void withoutParameters() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getStationsCount());
        Assertions.assertEquals(9, radio.maxStation);
    }

    @Test
    public void withParameters() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(20, radio.getStationsCount());
        Assertions.assertEquals(19, radio.maxStation);
    }

    @Test
    public void negativeNumberStations() {
        Radio radio = new Radio(-3);
        Assertions.assertEquals(10, radio.getStationsCount());
        Assertions.assertEquals(9, radio.maxStation);
    }

    @Test
    public void setStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(3);
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void setStationBelowZero() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setStationAboveMax() {
        Radio radio = new Radio(8);
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(4);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(8);
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }
}

