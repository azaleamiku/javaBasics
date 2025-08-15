public class CtrlFlowDemo {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or Lower");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Round " + i);
        }

        int day = 5;
        switch (day) {
            case 1 -> System.out.println("Mon");
            case 2 -> System.out.println("Tue");
            default -> System.out.println("Other day");
        }
    }
}