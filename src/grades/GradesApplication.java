package grades;

import util.Input;

import java.util.*;

public class GradesApplication extends Student {
    static Map<String, Student> students;

    private static void init() {
        students = new HashMap<>();

        Student travis = new Student ("travisVela");
        travis.addGrade(90);
        travis.addGrade(99);
        travis.addGrade(88);

        Student mike = new Student ("mikeFlores");
        mike.addGrade(80);
        mike.addGrade(100);
        mike.addGrade(75);

        Student james = new Student ("jamesLampkins");
        james.addGrade(86);
        james.addGrade(99);
        james.addGrade(93);

        Student amanda = new Student ("amandaGolden");
        amanda.addGrade(77);
        amanda.addGrade(88);
        amanda.addGrade(92);

        students.put("travisVela", travis);
        students.put("mikeFlores", mike);
        students.put("jamesLampkins", james);
        students.put("amandaGolden", amanda);

//        System.out.println(travis.getName() + " grade average is " + travis.getGradeAverage(travis.getGrades()));
//        System.out.println(mike.getName() + " grade average is " + mike.getGradeAverage(mike.getGrades()));
//        System.out.println(james.getName() + " grade average is " + james.getGradeAverage(james.getGrades()));
//        System.out.println(amanda.getName() + " grade average is " + amanda.getGradeAverage(amanda.getGrades()));
    }
    private static void welcome() {
        System.out.print("\nWelcome!!\n\n");
        System.out.print("Here are the gitHub user names of our students:\n\n");
        for (String key : students.keySet()) {
            System.out.print("| " + key + " |" );
        }
    }
    private static void outputStudentRecord(String key) {
        System.out.printf("Name: %s - Github username: %s%nCurrent Average: %f%n%n", students.get(key).getName(),  key, students.get(key).getGradeAverage());
    }

    public static void main(String[] args) {

        init();
        welcome();
        Input input = new Input();
        boolean keepGoing = true;

        do {
            System.out.println("\nWhat student would you like to see more information on?\n");
            String answer = input.getString();
            System.out.println(answer);
            if (students.containsKey(answer)) {
                outputStudentRecord(answer);
            } else {
                System.out.printf("Sorry, no student found with the github username of \"%s\".", answer);
            }

            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
            System.out.println();

        } while (keepGoing);

    }

}

