public class Radio {
    int currentRadioStation;
    int currentVolume;

    public void next() {
        if (currentRadioStation < 9 & currentRadioStation >= 0) {
            currentRadioStation = currentRadioStation + 1;
        }
        else if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation <= 9 & currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        else if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0 & currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        else if (currentVolume == 0) {
            currentVolume = 0;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 0 & currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        else if (currentVolume == 10) {
            currentVolume = 10;
        }
    }
}
