import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static String flipCoin(Map<String, Double> outcomesProbabilities) {
        double randomValue = new Random().nextDouble();
        double cumulativeProbability = 0.0;

        for (Map.Entry<String, Double> entry : outcomesProbabilities.entrySet()) {
            cumulativeProbability += entry.getValue();
            if (randomValue < cumulativeProbability) {
                return entry.getKey();
            }
        }

        // If no outcome was selected (shouldn't happen in theory)
        throw new RuntimeException("Unable to generate an outcome based on probabilities.");
    }
    public static int RollDice(Map<Integer, Double> outcomesProbabilities) {
        double randomValue = new Random().nextDouble();
        double cumulativeProbability = 0.0;

        for (Map.Entry<Integer, Double> entry : outcomesProbabilities.entrySet()) {
            cumulativeProbability += entry.getValue();
            if (randomValue < cumulativeProbability) {
                return entry.getKey();
            }
        }

        // If no outcome was selected (shouldn't happen in theory)
        throw new RuntimeException("Unable to generate an outcome based on probabilities.");
    }


    public static void main(String[] args) {


        Map<String, Double> outcomesProbabilities_coin = new HashMap<>();
        ArrayList<String>outcome_coin= new ArrayList<>();
        Map<String, Integer> outcomes_summed_up_coin = new HashMap<>();
        outcomesProbabilities_coin.put("Heads", 0.35);
        outcomesProbabilities_coin.put("Tails", 0.65);


        ArrayList<Integer>outcome_dice= new ArrayList<>();
        Map<Integer, Integer> outcomes_summed_up_dice = new HashMap<>();
        Map<Integer, Double> outcomesProbabilities_dice = new HashMap<>();
        outcomesProbabilities_dice.put(1, 10*1.0/100);
        outcomesProbabilities_dice.put(2, 30*1.0/100);
        outcomesProbabilities_dice.put(3, 15*1.0/100);
        outcomesProbabilities_dice.put(4, 15*1.0/100);
        outcomesProbabilities_dice.put(5, 30*1.0/100);
        outcomesProbabilities_dice.put(6, 0.0);

        // Simulate rolling the die 1000 times
        for (int i = 0; i < 1000; i++) {
            int result = RollDice(outcomesProbabilities_dice);
            outcome_dice.add(result);
        }

        for(Integer x:outcome_dice){
            outcomes_summed_up_dice.put(x,outcomes_summed_up_dice.getOrDefault(x,0)+1);
        }



        // Simulate coin toss 1000 times
        for (int i = 0; i < 1000; i++) {
            String result = flipCoin(outcomesProbabilities_coin);
            outcome_coin.add(result);
        }
        for(String x:outcome_coin){
            outcomes_summed_up_coin.put(x,outcomes_summed_up_coin.getOrDefault(x,0)+1);
        }

        //for printing the results
        System.out.println(outcomes_summed_up_dice);
        System.out.println(outcomes_summed_up_coin);
    }
}
