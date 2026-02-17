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
        radio.setCurrentVolume(105);
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
}

