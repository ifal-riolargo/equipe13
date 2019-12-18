package test;

import app.person.Teacher;
import app.information.Course;
import app.information.Article;

public class TeacherTest {
  public static void main(String[] args) {
    String[] academicTraining = { "ufal - mestrado", "ifal - doutorado" };

    Teacher professor = new Teacher("Josivaldo", "333", "2019-08-12",
        "jj@gmail.com", academicTraining);

  }
}