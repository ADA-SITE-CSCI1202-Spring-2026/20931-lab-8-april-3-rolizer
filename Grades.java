import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {

        HashMap<String, Double> studentGPA = new HashMap<>();

        studentGPA.put("Batman", 3.8);
        studentGPA.put("Superman", 2.7);
        studentGPA.put("Venom", 2.8);
        studentGPA.put("Deadpool", 1.9);
        studentGPA.put("Tony", 3.9);
        studentGPA.put("Hulk", 2.3);

        double maxGPA = 0;

        for (double gpa : studentGPA.values()) {
            if (gpa > maxGPA) {
                maxGPA = gpa;
            }
        }
        System.out.println("The highest GPA is " + maxGPA);
        System.out.println("The students with highest GPA: ");

        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() == maxGPA) {
                System.out.println(entry.getKey());
            }
        }

        double sum = 0;
        int count = 0;
        for (double gpa : studentGPA.values()) {
            sum += gpa;
            count++;
        }

        double average = sum / count;

        System.out.println("The average GPA is " + average);

        int belowAverage = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < average) {
                belowAverage++;
            }
        }

        System.out.println("The numbere of students below the average Gpa: " + belowAverage);

    }
}
