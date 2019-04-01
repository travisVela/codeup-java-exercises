package grades;

import java.util.*;

public class GradesApplication extends Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Student> students = new HashMap<>();

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


        System.out.print("\nWelcome!!\n\n");
        System.out.print("Here are the gitHub user names of our students:\n\n");
        for (String key : students.keySet()) {
            System.out.print("| " + key + " |" );
        }
        System.out.println("\n\nWhat student would you like to learn more information on?\n");
        String answer = sc.nextLine();
        while (!students.containsKey(answer)) {
            System.out.println("Sorry, no student found with github username " + answer);
            if (students.containsKey(answer)) {
                System.out.printf("Name: %s - Github Username: %s%nCurrent average: %f", );
            }
        }

    }

}

