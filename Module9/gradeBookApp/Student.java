/*The class has private instance variables firstName, lastName, course, and grade representing 
the attributes of a student.

The class provides two constructors: a default constructor and a parameterized constructor 
that accepts values for all the attributes.

Getter and setter methods are provided for each attribute to access and modify the values.

The toString method is overridden to provide a string representation of the Student object. 
It returns a string that includes the values of the attributes. */

package SK_CIS_505.Module9.gradeBookApp;

public class Student {
    private String firstName;
        private String lastName;
        private String course;
        private String grade;

        public Student() {
        }

        public Student(String firstName, String lastName, String course, String grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        
     
        @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Course='" + course + '\'' +
                ", Grade='" + grade + '\'' +
                '}';

    }
       
}