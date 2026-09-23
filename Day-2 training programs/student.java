class student {

    public static void main(String[] args) {

        String name = "sasi";
        int age = 19;
        int marks = 85;
        int energy = 7;
        String mood = "Happy";
        float attendance = 90.5f;

        // Method 1: Skip Class
        skipClass();

        // Check Energy
        if (energy < 5) {
            System.out.println("Student is tired and needs rest.");
        } else {
            System.out.println("Student is energetic and ready to learn.");
        }

        // Method 2: Take Test
        takeTest();

        // Check Marks
        if (marks >= 90) {
            System.out.println("Student has scored an A grade.");
        } else if (marks >= 80) {
            System.out.println("Student has scored a B grade.");
        } else if (marks >= 70) {
            System.out.println("Student has scored a C grade.");
        } else if (marks >= 60) {
            System.out.println("Student has scored a D grade.");
        } else {
            System.out.println("Student has failed the test.");
        }

        // Method 3: Check Mood
        checkMood();

        if (mood.equals("Happy")) {
            System.out.println("Student is in a good mood.");
        }

        // Method 4: Take Attendance
        takeAttendance();

        // Check Attendance
        if (attendance >= 75) {
            System.out.println("Student has good attendance.");
        } else {
            System.out.println("Student has poor attendance.");
        }

        // Display Student Details
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Energy: " + energy);
        System.out.println("Student Mood: " + mood);
        System.out.println("Student Attendance: " + attendance);
        System.out.println("Student Marks: " + marks);
    }

    // Method for skipping class
    static void skipClass() {
        System.out.println("Student skipped the class.");
    }

    // Method for taking test
    static void takeTest() {
        System.out.println("Student is taking the test.");
    }

    // Method for checking mood
    static void checkMood() {
        System.out.println("Checking student's mood...");
    }

    // Method for attendance
    static void takeAttendance() {
        System.out.println("Attendance is being checked.");
    }
}