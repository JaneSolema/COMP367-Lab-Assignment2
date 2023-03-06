package com.comp367.welcome;
import java.time.LocalTime;

public class App {
	public static void main(String[] args) {
        String name = "John"; // replace with your own name or use user input
        LocalTime now = LocalTime.now();
        String message;
        
        if (now.isBefore(LocalTime.NOON)) {
            message = "Good morning, " + name + ", Welcome to COMP367";
        } else {
            message = "Good afternoon, " + name + ", Welcome to COMP367";
        }
        
        System.out.println(message);
    }
}