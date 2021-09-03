import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextStationShouldBeEqualTo9() {
        Radio radio = new Radio();
        radio.currentRadioStation = 8;
        radio.next();
        assertEquals(9, radio.currentRadioStation);
    }

    @Test
    public void nextStationShouldBeEqualTo0() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.next();
        assertEquals(0, radio.currentRadioStation);
    }

    @Test
    public void nextStationShouldBeEqualTo1() {
        Radio radio = new Radio();
        radio.currentRadioStation = 0;
        radio.next();
        assertEquals(1, radio.currentRadioStation);
    }

    @Test
    public void prevStationShouldBeEqualTo9() {
        Radio radio = new Radio();
        radio.currentRadioStation = 0;
        radio.prev();
        assertEquals(9, radio.currentRadioStation);
    }

    @Test
    public void prevStationShouldBeEqualTo8() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.prev();
        assertEquals(8, radio.currentRadioStation);
    }

    @Test
    public void prevStationShouldBeEqualTo0() {
        Radio radio = new Radio();
        radio.currentRadioStation = 1;
        radio.prev();
        assertEquals(0, radio.currentRadioStation);
    }

    @Test
    public void increasedVolumeShouldBeEqualTo10(){
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        assertEquals(10, radio.currentVolume);
    }

    @Test
    public void increasedVolumeShouldBeEqualTo1(){
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.increaseVolume();
        assertEquals(1, radio.currentVolume);
    }

    @Test
    public void decreasedVolumeShouldBeEqualTo1(){
        Radio radio = new Radio();
        radio.currentVolume = 2;
        radio.decreaseVolume();
        assertEquals(1, radio.currentVolume);
    }

    @Test
    public void decreasedVolumeShouldBeEqualTo0(){
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        assertEquals(0, radio.currentVolume);
    }
}