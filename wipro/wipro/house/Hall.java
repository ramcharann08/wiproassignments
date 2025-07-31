package house;
import static java.lang.System.out;

public class Hall {
	public void enterRoom() {
        // Using import static for System.out
        out.println("This is the first room while entering the house");
    }

    // Static import to allow using out.println without System
    static {
        importStatic();
    }
    private static void importStatic() {
        // This method is empty and only exists to clarify static imports are needed.
    }
}




