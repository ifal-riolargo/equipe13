package app.person;

public class Instructor extends Person {
  private String formation = "";

  public Instructor(String name, String birth, String email, String formation) {
    super(name, birth, email);

    this.formation = formation;
  }

  public String getFormation() {
    return this.formation;
  }

  public void setFormation(String formation) {
    this.formation = formation;
  }
}