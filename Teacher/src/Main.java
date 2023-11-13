import java.util.*;

class Teacher {
    private String fullName;
    private int age;
    private List<Course> courses;

    public Teacher(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }
}

class Course {
    private String title;
    private int hours;

    public Course(String title, int hours) {
        this.title = title;
        this.hours = hours;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        // Adding teachers and courses
        Teacher teacher1 = new Teacher("John Doe", 35);
        Teacher teacher2 = new Teacher("Jane Smith", 28);
        teachers.add(teacher1);
        teachers.add(teacher2);

        Course course1 = new Course("Math", 40);
        Course course2 = new Course("History", 30);
        courses.add(course1);
        courses.add(course2);

        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher2.addCourse(course2);

        // Show all teachers and their courses
        System.out.println("Teachers and their courses:");
        for (Teacher teacher : teachers) {
            System.out.println("Teacher: " + teacher.getFullName() + ", Age: " + teacher.getAge());
            System.out.println("Courses:");
            for (Course course : teacher.getCourses()) {
                System.out.println("- " + course.getTitle() + ", Hours: " + course.getHours());
            }
            System.out.println();
        }

        // Show all courses
        System.out.println("All courses:");
        for (Course course : courses) {
            System.out.println("Course: " + course.getTitle() + ", Hours: " + course.getHours());
        }

        // Show all teachers
        System.out.println("All teachers:");
        for (Teacher teacher : teachers) {
            System.out.println("Teacher: " + teacher.getFullName() + ", Age: " + teacher.getAge());
        }

        // Remove a course from a teacher
        teacher1.removeCourse(course2);
        System.out.println("\nCourse removed from teacher1.");

        // Show teacher1's courses after removing
        System.out.println("\nTeacher1's courses after removing:");
        for (Course course : teacher1.getCourses()) {
            System.out.println("Course: " + course.getTitle() + ", Hours: " + course.getHours());
        }
    }
}