package wipro1;

public class Wipro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalStudents = 90;
        int boys = 45;

        int gradeATotal = totalStudents / 2;   
        int gradeABoys = 20;

        int gradeAGirls = gradeATotal - gradeABoys;
        System.out.println("Girls who got grade 'A': " + gradeAGirls);

        }

}