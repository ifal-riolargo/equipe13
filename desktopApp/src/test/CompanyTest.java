package test;

import app.company.Company;
import app.towatch.Course;
import app.towatch.Event;

public class CompanyTest {
  public static void main(String[] args) {
    Company kubbleware = new Company("KubbleWare");

    Course[] courses = new Course[6];
    courses[0] = new Course("Meu Curso é fera", "Esse curso deixará vc preparado pra td", "02-08-2020", "02-10-2020",
        "vai ser online", "4002-8922", "myEmail@gmail.com");

    courses[1] = new Course("Curso de java javoso", "Esse curso de java e o melior que tem", "12-12-2020", "14-10-2022",
        "vai ser online", "2112-4333", "myasdEmail@gmail.com");

    courses[2] = new Course("PHP ehhhh brabo", "So as braba", "30-12-2020", "30-12-2021", "agencia caixa", "4002-8922",
        "myasdsadEmail@gmail.com");

    courses[3] = new Course("Pythoooon é fera", "Python e top mano slk deixará vc preparado pra td", "02-08-2020",
        "02-10-2020", "vai ser online", "4002-8922", "myEmail@asdasdgmail.com");

    courses[4] = new Course("Meuasdasd Curso é fera", "Esse curso deixará vc preparado pra td", "02-08-2020",
        "02-10-2020", "vai ser online", "4002-8922", "myEmail@gmaiasdasdl.com");

    courses[5] = new Course("Soh rojaum", "Venho lancando a braba", "02-08-2020", "02-10-2020", "vai ser online",
        "4002-8922", "myEmail@gmail.com");

    // ok
    for (Course course : courses)
      kubbleware.addCourse(course);

    // ok
    kubbleware.showCourses();
    System.out.println("+====+");

    // // ok
    // kubbleware.showCourse("Esse");
    // System.out.println("+====+");

    // // ok
    // kubbleware.deleteCourse("Soh Rojaum");
    // kubbleware.showCourses();

    // ok
    // kubbleware.updateCourse("Soh", "", "Lancastes a braba?", "", "", "", "", "");
    // kubbleware.deleteCourse("braba");
    // kubbleware.showCourses();

    // // ok
    // Event[] events = new Event[6];
    // events[0] = new Event("Meu Curso é fera", "Esse curso deixará vc preparado
    // pra td", "02-08-2020", "02-10-2020",
    // "vai ser online", "4002-8922", "myEmail@gmail.com");

    // events[1] = new Event("Curso de java javoso", "Esse curso de java e o melior
    // que tem", "12-12-2020", "14-10-2022",
    // "vai ser online", "2112-4333", "myasdEmail@gmail.com");

    // events[2] = new Event("PHP ehhhh brabo", "So as braba", "30-12-2020",
    // "30-12-2021", "agencia caixa", "4002-8922",
    // "myasdsadEmail@gmail.com");

    // events[3] = new Event("Pythoooon é fera", "Python e top mano slk deixará vc
    // preparado pra td", "02-08-2020",
    // "02-10-2020", "vai ser online", "4002-8922", "myEmail@asdasdgmail.com");

    // events[4] = new Event("Meuasdasd Curso é fera", "Esse curso deixará vc
    // preparado pra td", "02-08-2020",
    // "02-10-2020", "vai ser online", "4002-8922", "myEmail@gmaiasdasdl.com");

    // events[5] = new Event("Soh rojaum", "Venho lancando a braba", "02-08-2020",
    // "02-10-2020", "vai ser online",
    // "4002-8922", "myEmail@gmail.com");

    // // ok
    // for (Event event : events)
    // kubbleware.addEvent(event);

    // // ok
    // kubbleware.showEvents();
    // System.out.println("---===---");

    // // ok
    // kubbleware.showEvent("Esse");

    // // ok
    // kubbleware.deleteEvent("PHP");

    // // ok
    // kubbleware.updateEvent("Esse", "nome agr e esse", "", "", "", "", "", "");
    // kubbleware.showEvents();

  }
}