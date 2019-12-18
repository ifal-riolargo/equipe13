package app.person;

import app.information.Course;

public class Student extends Person {
  private String registration;
  private Course[] courses;

  /**
   * 
   * @param name
   * @param cpf
   * @param dateBirth
   * @param email
   * @param registration
   * @param courses
   */
  public Student(String name, String cpf, String dateBirth, String email,
      String registration, Course[] courses) {
    super(name, cpf, dateBirth, email);
    this.registration = registration;
    this.courses = courses;
  }

  /**
   * @return the registration
   */
  public String getRegistration() {
    return registration;
  }

  /**
   * @param registration
   *                       the registration to set
   */
  public void setRegistration(String registration) {
    this.registration = registration;
  }

  /**
   * @return the courses
   */
  public Course[] getCourses() {
    return courses;
  }

  // course [C]RUD

  /**
   * 
   * @param text
   * @return course or null
   */
  public Course retrieveCourse(String text) {
    for (Course course : this.courses) {
      if (course.getTitle().indexOf(text) != -1
          || course.getDescription().indexOf(text) != -1)
        return course;
    }

    return null;
  }

  /**
   * 
   * @param text
   * @param newTitle
   * @param newDescription
   * @return boolean
   */
  public boolean updateCourse(String text, String newTitle,
      String newDescription) {

    Course course = this.retrieveCourse(text);
    if (course == null)
      return false;

    int updates = 0;

    if (newTitle != "") {
      course.setTitle(newTitle);
      updates++;
    }

    if (newDescription != "") {
      course.setDescription(newDescription);
      updates++;
    }

    return updates != 0;
  }

  /**
   * 
   * @param text
   */
  public void deleteCourse(String text) {
    for (int i = 0; i < courses.length - 1; i++) {
      if (courses[i] == null)
        break;
      if (courses[i].getTitle() == text
          || courses[i].getDescription() == text) {
        for (int j = i; j < courses.length - 1; j++) {
          courses[j] = courses[j + 1];
        }
      }
    }
    courses[courses.length - 1] = null;
  }

  /**
   * 
   * @return void
   */
  public void listCourses() {
    for (Course course : this.courses) {
      if (course == null) {
        break;
      }

      System.out.println(course.getTitle());
    }
  }

}
