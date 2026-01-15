package RegexPractise;

import java.util.ArrayList;
import java.util.List;

public class MaximumScore_1 {

    public static void main(String[] args) {

        int[] scores = {10, 45, 32, 60, 27};
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 35)
                indexes.add(i);
        }

        System.out.println(indexes);
    }

}

