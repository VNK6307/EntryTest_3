import java.util.ArrayList;

public class Plus {
    public static ArrayList<Character> deletePluses(ArrayList<Character> sourceArray) {
        for (int i = 0; i < sourceArray.size(); i++) {
            if (sourceArray.get(i) == '+') {
                sourceArray.set(i, '!');
            }
        }
        return sourceArray;
    }
}
