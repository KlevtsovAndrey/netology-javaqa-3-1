public class Radio {
    public int numberOfRadioStations = 10;
    public int currentRadioStation;
    public int currentVolume;


    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        int maxRadioStation = numberOfRadioStations - 1;
        int minRadioStation = 0;
        if (newRadioStation < minRadioStation) {
            return;
        }
        if (newRadioStation > maxRadioStation) {
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
        int maxRadioStation = numberOfRadioStations - 1;
        int minRadioStation = 0;
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }
        else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prev() {
        int maxRadioStation = numberOfRadioStations - 1;
        int minRadioStation = 0;
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        else {
            currentRadioStation = maxRadioStation;
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
