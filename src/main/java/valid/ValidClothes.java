package valid;

import entity.Color;

public class ValidClothes {
    public static boolean isValidSize(int value) {
        return value >= 0;
    }

    public static boolean isValidColor(String colorStr) {
        Color[] colors = Color.values();
        for (Color color : colors) {
            if (color.toString().equalsIgnoreCase(colorStr)) {
                return true;
            }
        }
        return false;
    }
}
