package app.towatch;

import app.person.Instructor;
import java.util.Arrays;

public class Course {
  private String name = "";
  private String description = "";
  private String startDate = "";
  private String endDate = "";
  private String address = "";
  private String phone = "";
  private String email = "";
  private Instructor[] instructors;

  public Course(String name, String description, String startDate, String endDate, String address, String phone,
      String email) {

    this.name = name;
    this.description = description;
    this.startDate = startDate;
    this.endDate = endDate;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.instructors = new Instructor[0];
  }

  public Course(String name, String description, String startDate, String endDate, String address, String phone,
      String email, Instructor[] instructors) {

    this.name = name;
    this.description = description;
    this.startDate = startDate;
    this.endDate = endDate;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.instructors = instructors;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getStartDate() {
    return this.startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return this.endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // CRUD -- Instructor

  // Create
  public void addInstructor(Instructor instructor) {
    final int NEW_LENGTH = this.instructors.length + 1;

    this.instructors = Arrays.copyOf(this.instructors, NEW_LENGTH);
    this.instructors[NEW_LENGTH - 1] = instructor;
  }

  private Instructor getInstructorByIndex(int index) {
    if (index < 0 || index >= this.instructors.length) {
      return null;
    }

    return this.instructors[index];
  }

  private Instructor[] getInstructorByName(String name) {
    Instructor[] instructors = new Instructor[this.instructors.length];
    int found = 0;

    for (Instructor instructor : this.instructors) {
      if (instructor.getName().indexOf(name) != -1)
        instructors[found++] = instructor;
    }

    instructors = Arrays.copyOf(instructors, found);

    return instructors;
  }

  // Retrieve
  public void showInstructor(String name) {
    if (this.instructors.length == 0) {
      System.out.println("Não há instrutores cadastrados.");
    } else {
      Instructor[] instructors = this.getInstructorByName(name);
      if (instructors.length == 0) {
        System.out.println("Não foi encontrado nenhum instrutor.");
      } else {
        for (Instructor instructor : instructors)
          System.out.println(instructor.getName() + " -=-=-" + instructor.getFormation());
      }
    }
  }

  // Retrieve
  public void showInstructor(int id) {
    if (this.instructors.length == 0) {
      System.out.println("Não há instrutores cadastrados");
    } else {
      Instructor instructor = this.getInstructorByIndex(id);
      if (instructor == null) {
        System.out.println("Id inválido");
      } else {
        System.out.println(instructor.getName() + " -=-=-" + instructor.getFormation());
      }
    }
  }

  // Retrieve All
  public void showInstructors() {
    if (instructors.length == 0) {
      System.out.println("Não há instrutores cadastrados");
    } else {
      for (Instructor instructor : instructors) {
        if (instructor == null)
          break;

        System.out.println(instructor.getName() + " =-=-= " + instructor.getFormation());
      }
    }
  }

  // Update
  public void updateInstructor(String oldName, String newName, String newFormation) {
    if (this.instructors.length == 0) {
      System.out.println("Não há instrutores cadastrados.");
    } else {
      Instructor[] instructors = this.getInstructorByName(oldName);
      if (instructors.length == 0) {
        System.out.println("Nenhum instrutor encontrado.");
      } else {
        Instructor instructor = instructors[0];

        if (newName != "")
          instructor.setName(newName);

        if (newFormation != "")
          instructor.setFormation(newFormation);
      }
    }
  }

  // Update
  public void updateInstructor(int id, String newName, String newFormation) {
    if (this.instructors.length == 0) {
      System.out.println("Não há instrutores cadastrados.");
    } else {
      Instructor instructor = this.getInstructorByIndex(--id);
      if (instructor == null) {
        System.out.println("Nenhum instrutor encontrado.");
      } else {
        if (newName != "")
          instructor.setName(newName);

        if (newFormation != "")
          instructor.setFormation(newFormation);
      }
    }
  }

  // Delete
  public void deleteInstructor(String name) {
    if (this.instructors.length == 0) {
      System.out.println("Não há instrutores cadastrados.");
    } else {
      for (int i = 0; i < this.instructors.length; i++) {
        if (this.instructors[i].getName().indexOf(name) != -1) {
          for (int j = i; j < this.instructors.length - 1; j++) {
            this.instructors[j] = this.instructors[j + 1];
          }
        }
      }
      this.instructors[this.instructors.length - 1] = null;
    }
  }

  public void deleteInstructor(int id) {
    if (this.instructors.length == 0) {
      System.out.println("Não há instrutores cadastrados.");
    } else {
      if (--id < 0 || id >= this.instructors.length) {
        System.out.println("Id inválido");
      } else {
        for (int j = id; j < this.instructors.length - 1; j++) {
          this.instructors[j] = this.instructors[j + 1];
        }
        this.instructors[this.instructors.length - 1] = null;
      }
    }
  }

}