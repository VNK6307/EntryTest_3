import java.util.ArrayList;

public class Digits {
    public static ArrayList<Character> digitsProcessing(ArrayList<Character> sourceArray) {
        int summa = 0;
        int digitInText;
        int digitsCounter = 0;
        for (int i = 0; i < sourceArray.size(); i++) {
            if (sourceArray.get(i) >= '0' && sourceArray.get(i) <= '9') {
                digitsCounter++;
                digitInText = sourceArray.get(i) - '0';
                summa = summa + digitInText;
                sourceArray.remove(i);
            }
        }

        if (digitsCounter > 0) {
            sourceArray.add(' ');
            String sumOfDigits = String.valueOf(summa);
            char[] digitsOfSum = sumOfDigits.toCharArray();

            for (char ch : digitsOfSum) {
                sourceArray.add(ch);
            }
        }
        return sourceArray;
    }
}