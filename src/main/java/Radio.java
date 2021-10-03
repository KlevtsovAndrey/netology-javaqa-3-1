public class Radio {
    private int numberOfRadioStations;
    private int currentRadioStation;
    private int currentVolume;
    private final int minRadioStation = 0;


    public Radio() {
        this.numberOfRadioStations = 10;
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getMaxRadioStation() {
        return numberOfRadioStations - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < minRadioStation) {
            return;
        }
        if (newRadioStation > getMaxRadioStation()) {
            return;
        }
        this.currentRadioStation = newRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    private void setCurrentVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadioStation < getMaxRadioStation()) {
            currentRadioStation = currentRadioStation + 1;
        }
        else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        else {
            currentRadioStation = getMaxRadioStation();
        }
    }

    public void decreaseVolume() {
        int minVolume = 0;
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
        else  {
            setCurrentVolume(minVolume);
        }
    }

    public void increaseVolume() {
        int maxVolume = 100;
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
        else  {
            setCurrentVolume(maxVolume);
        }
    }
}
