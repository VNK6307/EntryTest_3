import java.util.ArrayList;

public class Spaces {

    public static ArrayList<Character> deleteSpaces(char[] sourceArray) {
        ArrayList<Character> arrayWithoutSpaces = new ArrayList<>();
        for (int i = 0; i < sourceArray.length; i++) {
            arrayWithoutSpaces.add(sourceArray[i]);
            if (sourceArray[i] == ' ') {
                for (int j = i + 1; j < sourceArray.length; j++) {
                    if (sourceArray[j] == ' ') {
                        continue;
                    }
                    arrayWithoutSpaces.add(sourceArray[j]);
                    i = j;
                    break;
                }
            }
        }
        return arrayWithoutSpaces;
    }
}