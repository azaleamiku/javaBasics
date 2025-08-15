public class ArrayNames {
    public static void main(String[] args) {
        String[] names = {"Jian", "Rick", "Frederick", "Elzen", "Lyssa"};
        int[] grades = {100, 90, 80, 70, 60};


        for (int i = 0; i < names.length; i++ ) {

            if (grades[i] < 70) {
                System.out.println(names[i] + ": " + grades[i]);
                System.out.println(names[i] + " " + "Failed!");
                System.out.println();

            } else if (grades[i] >= 70) {
                System.out.println(names[i] + ": " + grades[i]);
                System.out.println(names[i] + " " + "Passed!");
                System.out.println();

            }
        }
    }
}