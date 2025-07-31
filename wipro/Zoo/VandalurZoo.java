package Zoo;

import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;

	public class VandalurZoo {
	    public static void main(String[] args) {
	        Lion lion = new Lion("Golden", 190, 8);
	        Tiger tiger = new Tiger("Orange-Black", 220, 6);
	        Deer deer = new Deer("Brown", 80, 4);
	        Monkey monkey = new Monkey("Grey", 30, 5);
	        Elephant elephant = new Elephant("Grey", 5400, 25);
	        Giraffe giraffe = new Giraffe("Yellow-Brown", 900, 12);

	        System.out.println("Characteristics of animals in Vandalur Zoo:");
	        lion.printCharacteristics();
	        System.out.println();
	        tiger.printCharacteristics();
	        System.out.println();
	        deer.printCharacteristics();
	        System.out.println();
	        monkey.printCharacteristics();
	        System.out.println();
	        elephant.printCharacteristics();
	        System.out.println();
	        giraffe.printCharacteristics();
	    }
	}

