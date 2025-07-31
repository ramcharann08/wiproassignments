package house;

import java.util.Arrays;

public class Kitchen {
    public void showAppliances() {
        // Initialize and print appliances array
        String[] appliances = {"Refrigerator", "Microwave", "Oven", "Toaster", "Dishwasher"};
        System.out.println("Kitchen appliances: " + Arrays.toString(appliances));

        // Copy array to a new array
        String[] appliancesCopy = Arrays.copyOf(appliances, appliances.length);
        System.out.println("Copied appliances: " + Arrays.toString(appliancesCopy));
    }
}