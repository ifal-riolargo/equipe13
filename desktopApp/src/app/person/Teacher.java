package app.person;

import app.information.Course;
import app.information.Article;

public class Teacher extends Person {
  private String[] academicTraining;

  public Teacher(String name, String cpf, String dateBirth, String email,
      String[] academicTraining) {
    super(name, cpf, dateBirth, email);

    this.academicTraining = academicTraining;
  }

  /**
   * @return the academicTraining
   */
  public String[] getAcademicTraining() {
    return academicTraining;
  }

  /**
   * @param academicTraining
   *                           the academicTraining to set
   */
  public void setAcademicTraining(String[] academicTraining) {
    this.academicTraining = academicTraining;
  }

}