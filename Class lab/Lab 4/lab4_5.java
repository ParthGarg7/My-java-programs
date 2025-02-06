
public class lab4_5 {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Java Programming", "1111");
        course.displayCourseDetails();
    }
}

class Course {
    String course_Name;
    String course_Code;

    Course(String courseName, String courseCode) {
        this.course_Name = courseName;
        this.course_Code = courseCode;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + course_Name);
        System.out.println("Course Code: " + course_Code);
    }
}
