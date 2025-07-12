package part2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printMedicationNames(List<? extends Medication> medications){
        for (Medication medication: medications){
            System.out.println(medication.getName());
        }
    }

    public static void addPainKillers(List<? super Medication> painKillerList){
        painKillerList.add(new PainKiller("Ibuprofen"));
        painKillerList.add(new PainKiller("Acetaminophen"));
        painKillerList.add(new PainKiller("Aspirin"));
    }

    public static void main(String[] args) {
        List<Medication> meds = Arrays.asList(new Medication("Saline"), new Medication("Vitamin C"));
        List<PainKiller> painKillers = Arrays.asList(new PainKiller("Ibuprofen"), new PainKiller("Aspirin"));
        List<Antibiotic> antibiotics = Arrays.asList(new Antibiotic("Amoxicillin"));

        printMedicationNames(meds);
        printMedicationNames(painKillers);
        printMedicationNames(antibiotics);
    }
}
