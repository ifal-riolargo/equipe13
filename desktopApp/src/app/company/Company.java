package app.company;

// import app.towatch.*
import app.towatch.Course;
import app.towatch.Event;

import java.util.Arrays;

public class Company {
  private String name;
  private Course[] courses = new Course[0];
  private Event[] events = new Event[0];

  public Company(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private Course[] getCoursesByText(String text) {
    Course[] courses = new Course[this.courses.length];
    int found = 0;

    if (this.courses.length != 0) {
      for (Course course : this.courses) {
        if (course.getName().indexOf(text) != -1 || course.getDescription().indexOf(text) != -1)
          courses[found++] = course;
      }
    }

    return Arrays.copyOf(courses, found);
  }

  private Event[] getEventsByText(String text) {
    Event[] events = new Event[this.events.length];
    int found = 0;

    if (this.events.length != 0) {
      for (Event event : this.events) {
        if (event.getName().indexOf(text) != -1 || event.getDescription().indexOf(text) != -1)
          events[found++] = event;
      }
    }

    return Arrays.copyOf(events, found);
  }
  // CRUD -- Courses

  // Create
  public void addCourse(Course course) {
    final int LENGTH = this.courses.length + 1;

    this.courses = Arrays.copyOf(this.courses, LENGTH);
    this.courses[LENGTH - 1] = course;
  }

  public boolean updateCourse(String text, String newName, String newDescription, String newStartDate,
      String newEndDate, String newAddress, String newPhone, String newEmail) {
    if (this.courses.length == 0) {
      System.out.println("Não há eventos cadastrados.");

      return false;
    } else {
      Course[] course = this.getCoursesByText(text);
      if (course.length == 0) {
        System.out.println("Nenhum curso foi encontrado.");

        return false;
      } else {
        if (newName != "")
          course[0].setName(newName);

        if (newDescription != "")
          course[0].setDescription(newDescription);

        if (newStartDate != "")
          course[0].setStartDate(newStartDate);

        if (newEndDate != "")
          course[0].setEndDate(newEndDate);

        if (newAddress != "")
          course[0].setAddress(newAddress);

        if (newPhone != "")
          course[0].setPhone(newPhone);

        if (newEmail != "")
          course[0].setEmail(newEmail);
      }

      return true;
    }
  }

  // Retrieve
  public void showCourse(String text) {
    if (this.courses.length == 0) {
      System.out.println("Não há cursos cadastrados.");
    } else {
      Course[] courses = this.getCoursesByText(text);

      if (courses.length == 0) {
        System.out.println("Nenhum curso encontrado.");
      } else {
        for (Course course : courses) {
          System.out.println(course.getName() + " -- " + course.getDescription());
        }
      }
    }
  }

  // Retrieve all
  public void showCourses() {
    if (this.courses.length == 0) {
      System.out.println("Nenhum curso cadastrado.");
    } else {
      for (Course course : this.courses) {
        if (course == null)
          break;
        System.out.println(course.getName() + " -- " + course.getDescription());
      }
    }
  }

  public boolean deleteCourse(String text) {
    if (this.courses.length == 0) {
      System.out.println("Não há cursos cadastrados.");

      return false;
    } else {
      for (int i = 0; i < this.courses.length - 1; i++) {
        if (this.courses[i].getName().indexOf(text) != -1 || this.courses[i].getDescription().indexOf(text) != -1) {
          for (int j = i; j < this.courses.length - 1; j++) {
            this.courses[j] = this.courses[j + 1];
          }
        }

        this.courses[this.courses.length - 1] = null;
      }

      return true;
    }
  }

  // CRUD -- Events

  // Create
  public void addEvent(Event event) {
    final int LENGTH = this.events.length + 1;

    this.events = Arrays.copyOf(this.events, LENGTH);
    this.events[LENGTH - 1] = event;
  }

  // Update
  public boolean updateEvent(String text, String newName, String newDescription, String newStartDate, String newEndDate,
      String newAddress, String newPhone, String newEmail) {
    if (this.events.length == 0) {
      System.out.println("Não há eventos cadastrados.");

      return false;
    } else {
      Event[] event = this.getEventsByText(text);
      if (event.length == 0) {
        System.out.println("Nenhum evento foi encontrado.");

        return false;
      } else {
        if (newName != "")
          event[0].setName(newName);

        if (newDescription != "")
          event[0].setDescription(newDescription);

        if (newStartDate != "")
          event[0].setStartDate(newStartDate);

        if (newEndDate != "")
          event[0].setEndDate(newEndDate);

        if (newAddress != "")
          event[0].setAddress(newAddress);

        if (newPhone != "")
          event[0].setPhone(newPhone);

        if (newEmail != "")
          event[0].setEmail(newEmail);
      }

      return true;
    }
  }

  // Retrieve
  public void showEvent(String text) {
    if (this.events.length == 0) {
      System.out.println("Não há eventos cadastrados.");
    } else {
      Event[] events = this.getEventsByText(text);

      if (events.length == 0) {
        System.out.println("Não há eventos cadastrados.");
      } else {
        for (Event event : events) {
          System.out.println(event.getName() + " -- " + event.getDescription());
        }
      }
    }
  }

  // Retrieve all
  public void showEvents() {
    if (this.events.length == 0) {
      System.out.println("Não há eventos cadastrados");
    } else {
      for (Event event : this.events) {
        if (event == null)
          break;
        System.out.println(event.getName() + " -- " + event.getDescription());
      }
    }
  }

  public boolean deleteEvent(String text) {
    if (this.events.length == 0) {
      System.out.println("Não há eventos cadastrados.");

      return false;
    } else {
      for (int i = 0; i < this.events.length - 1; i++) {
        if (this.events[i].getName().indexOf(text) != -1 || this.events[i].getDescription().indexOf(text) != -1) {
          for (int j = i; j < this.events.length - 1; j++) {
            this.events[j] = this.events[j + 1];
          }

          break;
        }
      }

      this.events[this.events.length - 1] = null;
      return true;
    }
  }
}