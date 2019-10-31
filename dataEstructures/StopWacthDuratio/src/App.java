package dataEstructures.StopWacthDuratio.src;

import java.time.Duration;

public class App {
    public static void main(String[] args) {
        Duration time = Duration.ofNanos(System.nanoTime());
        System.out.println("time = " + time.getNano());
        time = Duration.ofNanos(System.nanoTime());
        System.out.println("time = " + time.getNano());
        time = Duration.ofNanos(System.nanoTime());
        System.out.println("time = " + time.getNano());
        time = Duration.ofNanos(System.nanoTime());
        System.out.println("time = " + time.getNano());
    }
}
