package goodvsevil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts) {
        Map<Integer, Integer> goodRacesWorth = getGoodRacesWorth();
        Map<Integer, Integer> evilRacesWorth = getEvilRacesWorth();
        int goodWorth = getWorth(goodAmounts, goodRacesWorth);
        int evilWorth = getWorth(evilAmounts, evilRacesWorth);
        if (goodWorth == evilWorth) {
            return tie();
        } else if (goodWorth > evilWorth) {
            return goodWins();
        } else {
            return evilWins();
        }
    }

    public static String goodWins() {
        return "Battle Result: Good triumphs over Evil";
    }

    public static String evilWins() {
        return "Battle Result: Evil eradicates all trace of Good";
    }

    public static String tie() {
        return "Battle Result: No victor on this battle field";
    }

    private static Map<Integer, Integer> getGoodRacesWorth() {
        Map<Integer, Integer> racesWorth = new HashMap<>();
        racesWorth.put(1, 1);
        racesWorth.put(2, 2);
        racesWorth.put(3, 3);
        racesWorth.put(4, 3);
        racesWorth.put(5, 4);
        racesWorth.put(6, 10);
        return racesWorth;
    }

    private static Map<Integer, Integer> getEvilRacesWorth() {
        Map<Integer, Integer> racesWorth = new HashMap<>();
        racesWorth.put(1, 1);
        racesWorth.put(2, 2);
        racesWorth.put(3, 2);
        racesWorth.put(4, 2);
        racesWorth.put(5, 3);
        racesWorth.put(6, 5);
        racesWorth.put(7, 10);
        return racesWorth;
    }

    private static int getWorth(String amounts, Map<Integer, Integer> racesWorth) {
        int[] amountsIntArray = Stream.of(amounts.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < amountsIntArray.length; i++) {
            int raceWorth = racesWorth.get(i + 1);
            amountsIntArray[i] = amountsIntArray[i] * raceWorth;
        }
        return Arrays.stream(amountsIntArray).sum();
    }

}
