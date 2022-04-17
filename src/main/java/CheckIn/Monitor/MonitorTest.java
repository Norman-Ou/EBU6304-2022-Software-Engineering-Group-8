package CheckIn.Monitor;

import CheckIn.Monitor.Listeners;

public class MonitorTest {

    public static void main(String[] args) {
        Listeners listeners = new Listeners();
        listeners.firstOption();
        listeners.showBookedFlightInfo();
    }
}
