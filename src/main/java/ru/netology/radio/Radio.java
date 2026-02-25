package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int stationsCount;
    final int maxStation;

    public Radio() {
        this.stationsCount = 10;
        this.maxStation = this.stationsCount - 1;
    }

    public Radio(int stationsCount) {
        if (stationsCount <= 0) {
            this.stationsCount = 10;
        } else {
            this.stationsCount = stationsCount;
        }
        this.maxStation = this.stationsCount - 1;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public int getStationsCount() {
        return stationsCount;
    }
}
