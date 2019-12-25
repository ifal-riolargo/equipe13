package app.person;

public abstract class Person {
  private String name = "";
  private String birth = "";
  private String email = "";

  public Person(String name, String birth, String email) {
    this.name = name;
    this.birth = birth;
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirth() {
    return this.birth;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}