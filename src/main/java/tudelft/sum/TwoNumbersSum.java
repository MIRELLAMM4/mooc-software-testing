package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {

        Collections.reverse(first);
        Collections.reverse(second);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.max(first.size(), second.size()); i++) {
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;
            int total = firstVal + secondVal + complement;

            complement = total >= 10 ? 1 : 0;
            if (complement == 1) {
                total -= 10;
            }

            result.add(total);
        }

        if (complement == 1) {
            result.add(1);
        }

        Collections.reverse(result);
        return result;
    }
}

