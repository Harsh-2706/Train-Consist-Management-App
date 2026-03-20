import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG103");

        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}