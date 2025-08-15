public class List {
    public static void main(String[] args) {

        //Print all

        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"};
        
        for (int c = 0; c < colors.length; c++) {
            System.out.println(colors[c]);
        }
        
        //Addition for loop

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
            System.out.println(sum);

        //Largest Number

        int[] scores = {78, 92, 85, 63, 99};

        int max = scores[0];

        for (int s = 0; s < scores.length; s++) {
            if(scores[s] > max) {
                max = scores[s];
            }
        }
        System.out.println(max);

        //Even nos.

        int[] nums = {4, 7, 12, 9, 16, 3};
        int evenCount = 0;

        for (int e = 0; e < nums.length; e++) {
            if (nums[e] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount); 


        //Reverse Order Print

        String[] animals = {"Dog", "Cat", "Bird", "Fish"};
 
        for (int a = animals.length - 1; a >= 0; a--) {
            System.out.println(animals[a]);
        }

    }
}