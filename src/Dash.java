import java.util.ArrayList;

public class Dash {
    public static ArrayList<Character> changePlaces(ArrayList<Character> sourceArray) {
        if ((sourceArray.get(0) == '-') || (sourceArray.get(sourceArray.size() - 1) == '-')) {
            System.out.println("Невозможно поменять символы местами, так как символ '-' является первым или последним элементом строки.");
        } else {
            for (int i = 1; i < sourceArray.size() - 1; i++) {
                if (sourceArray.get(i) == '-') {
                    char tempBefore = sourceArray.get(i - 1);
                    char tempAfter = sourceArray.get(i + 1);
                    sourceArray.set(i + 1, tempBefore);
                    sourceArray.set(i - 1, tempAfter);
                    sourceArray.remove(i);
                }
            }// for
        }
        return sourceArray;
    }
}