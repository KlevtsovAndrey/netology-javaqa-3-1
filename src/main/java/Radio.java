public class Radio {
    public int currentRadioStation;
    public int currentVolume;
    private final int minRadioStation = 0;
    private final int maxRadioStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
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
        if (currentRadioStation < maxRadioStation) {
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
        int maxVolume = 10;
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
        else  {
            setCurrentVolume(maxVolume);
        }
    }
}
