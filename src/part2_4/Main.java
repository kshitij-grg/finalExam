package part2_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Question A
        Function<String, String> getUpperCase = String::toUpperCase;

        // Question B
        BiFunction<Double, Double, Double> getRent = Double::sum;

        // Question C
        BiFunction<Integer, Integer, Integer> sort = Integer::compare;

        // Question D
        BiFunction<String, String, String> fullName = (firstName, lastName) -> firstName + " " + lastName;

        // Question E
        BiFunction<String, String, String> getID = (propertyID, maintenanceNum) -> propertyID + "-" + maintenanceNum;

    }
}
