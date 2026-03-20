import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After Removing AC Chair: " + passengerBogies);

        System.out.println("Contains Sleeper? " + passengerBogies.contains("Sleeper"));
    }
}