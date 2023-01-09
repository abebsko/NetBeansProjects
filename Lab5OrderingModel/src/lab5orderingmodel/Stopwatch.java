/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5orderingmodel;

import java.util.ArrayList;

/**
 *
 * @author seyib
 */
public class Stopwatch {

    private static long starttime, endtime;
    private static boolean running;

    // Transformer: sets starttime to current system time in milliseconds and running to true
    public static void start() {
        starttime = System.currentTimeMillis();
        running = true;
    }

    // Transformer: sets endtime to current system time in milliseconds and running to false
    public static void stop() {
        endtime = System.currentTimeMillis();
        running = false;
    }

    //Accessor: returns the elapsed time
    public static double getTimeInSeconds() {
        long now = System.currentTimeMillis();
        if (running) {
            return (now - starttime) / 1000.0;
        } else {
            return (endtime - starttime) / 1000.0;
        }
    }

    //Accessor: returns the elapsed time in format H:M:S
    public static String getTimeInHMS() {
        long now = System.currentTimeMillis();
        long elapsed;
        if (running) {
            elapsed = (now - starttime);
        } else {
            elapsed = (endtime - starttime);
        }
        long totalSec = elapsed / 1000;
        long hour = totalSec / 3600;
        long min = totalSec % 3600;
        long sec = totalSec % 60;
        return hour + ":" + min + ":" + sec;
    }

    private static String convertStoHMS(long s) {
        long hour = s / 3600;
        s = s % 3600;
        long min = s / 60;
        s = s % 60;
        return hour + ":" + min + ":" + s;
    }

    public static void main(String[] args) {
        Stopwatch.start();
        ArrayList<Order> orders = new ArrayList();
        String st = "";
        for (int i = 0; i < 20000; i++) {
            st += i;
        }
        orders.add(new Order(st, st));
        st = "";
        for (Order order : orders) {
            System.out.println(order);
        }

        Stopwatch.stop();

        System.out.println(
                "Time elapsed in second " + Stopwatch.getTimeInSeconds());
        System.out.println(
                "Time elapsed in H:M:S " + Stopwatch.getTimeInHMS());
    }
}
