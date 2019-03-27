import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        String[] daysOfTheWeek = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] numbers2 = new int[7];

        //assign numbers to new array using Arrays method with .length method
        numbers2 = Arrays.copyOf(numbers, numbers.length);

        //print the numbers2 nums
        System.out.println("The numbers for number2 array are: ");
        for (int num : numbers2) {
            System.out.println(num);
        }
        System.out.println();


        boolean[] trueFalse = {true, false};

        System.out.println(daysOfTheWeek[4] + " is the " + numbers[4] + "th day of the week\n");

        //cleaner but do not have access to iterator
        for (String day : daysOfTheWeek) {
            System.out.println(day);
        }

        System.out.println();

        //traditional for loop has access to the iterator
        for  (int i = 0; i < daysOfTheWeek.length; i++) {
            System.out.println("Day " + (i + 1)+ " = " + daysOfTheWeek[i]);
        }

        newArray();

    }

    private static void newArray() {
        System.out.println();
        System.out.println("NEW ARRAY STUFF");
        System.out.println("---------------");
//        create colors array
        String colors[] = {
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "indigo",
                "violet",
                "purple"
        };

//        print array
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

//        create colors2 array and use colors array length
        String[] colors2 = new String[colors.length];

//        fill colors2 with Arrays fill method
        Arrays.fill(colors2, "red");

//        print colors2 using iterator to reference the length of colors array
        for (int i = 0; i < colors.length; i++ ) {
            System.out.println((i + 1) + " " + colors2[i]);
        }
    }

}
