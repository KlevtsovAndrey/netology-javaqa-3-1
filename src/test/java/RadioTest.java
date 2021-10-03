import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void defaultNumberOfRadioStationsShouldBeEqualTo10() {
        Radio radio = new Radio();
        assertEquals(10, radio.getNumberOfRadioStations());
    }

    @Test
    public void changedNumberOfRadioStationsShouldBeEqualTo100() {
        Radio radio = new Radio(100);
        assertEquals(100, radio.getNumberOfRadioStations());
    }

    @Test
    public void nextStationShouldBeEqualTo9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.next();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationShouldBeEqualTo16() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        radio.next();
        assertEquals(16, radio.getCurrentRadioStation());
    }


    @Test
    public void nextStationShouldBeEqualTo0() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(99);
        radio.next();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationShouldNotBeEqualTo11() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.next();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationShouldNotBeEqualToMinus1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.next();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationShouldBeEqualTo99() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationShouldBeEqualTo8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prev();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationShouldNotBeEqualTo11() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.prev();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationShouldNotBeEqualToMinus1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.prev();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void increasedVolumeShouldBeEqualTo1(){
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increasedVolumeShouldBeEqualTo5(){
        Radio radio = new Radio();
        for (int i = 0; i < 5; i++) {
            radio.increaseVolume();
        }
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void increasedVolumeShouldNotBeHigherThan10(){
        Radio radio = new Radio();
        for (int i = 0; i < 110; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreasedVolumeShouldBeEqualTo4(){
        Radio radio = new Radio();
        for (int i = 0; i < 5; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void decreasedVolumeShouldNotBeHigherThan0(){
        Radio radio = new Radio();
        for (int i = 0; i < 3; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getCurrentVolume());
    }

}