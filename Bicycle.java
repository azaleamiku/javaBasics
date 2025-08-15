public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 0;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int newValue) {
        speed = speed + 1;
    }

    void applyBreaks(int decrement) {
        speed = speed - 1;
    }

    void printStates() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear );
    }
}