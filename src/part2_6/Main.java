package part2_6;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, String> beverageSugarMap = Map.ofEntries(
                Map.entry("Cold Brew Coffee", "0"),
                Map.entry("Iced Green Tea", "12"),
                Map.entry("Sparkling Water", "N/A"),
                Map.entry("Lemonade", "28"),
                Map.entry("Berry Smoothie", "N/A"),
                Map.entry("Chai Latte", "22"),
                Map.entry("Coconut Water", "15"),
                Map.entry("Apple Juice", "34"),
                Map.entry("Classic Soda", "40"),
                Map.entry("Orange Juice", "23"),
                Map.entry("Detox Green Smoothie", "16")
        );

        Stream<Map.Entry<String, Integer>> beverageMap = beverageSugarMap.entrySet()
                .stream()
                .flatMap(Main::parseSugarLevel);


        beverageMap
                .filter(stringStringEntry -> stringStringEntry.getKey().toLowerCase().contains("juice") || stringStringEntry.getKey().toLowerCase().contains("smoothie"))
                .filter(stringStringEntry -> stringStringEntry.getValue() < 30)
                .sorted(Comparator.comparing((Map.Entry<String, Integer> stringIntegerEntry) -> stringIntegerEntry.getValue())
                        .thenComparing(Map.Entry::getKey))
                .forEach(
                        stringStringEntry -> printResult(stringStringEntry.getKey(), stringStringEntry.getValue())
                );


    }

    public static Stream<Map.Entry<String, Integer>> parseSugarLevel(Map.Entry<String, String> entry) {
        Map<String, Integer> map = new HashMap<>();
        try {
            int value = Integer.parseInt(entry.getValue());
            map.put(entry.getKey(), value);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e.getMessage());
        }

        return map.entrySet().stream();
    }

    public static void printResult(String key, Integer value) {
        System.out.println(key + ": " + value);
    }
}
