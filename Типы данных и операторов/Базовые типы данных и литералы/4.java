public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Arina";
        int age = 25;
        double height = 1.65;
        boolean isStudent = true;
        char grade = 'A';
        
        String result1 = "Name: " + name;                    // String + String
        String result2 = "Age: " + age;                 // String + int
        String result3 = "Height: " + height + " м";          // String + double + String
        String result4 = "Student: " + isStudent;           // String + boolean
        String result5 = "Grade: " + grade;                // String + char
        String result6 = age + " age, height " + height;      // int + String + double
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
