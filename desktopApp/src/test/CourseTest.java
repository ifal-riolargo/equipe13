package test;

import app.towatch.Course;
import app.person.Instructor;

public class CourseTest {
  public static void main(String[] args) {
    Instructor[] instructors = new Instructor[6];
    instructors[0] = new Instructor("Josafá Veríssimo", "02-08-2002", "josafa@gmail.com",
        "doutor em ciências da computação");
    instructors[1] = new Instructor("Jenrique Joarez", "21-03-1999", "hendoRick@gmail.com", "técnico em redes");
    instructors[2] = new Instructor("Jenzo Hanzo", "29-10-1985", "enzo@gmail.com", "mestre em sistemas da informção");
    instructors[3] = new Instructor("HEehehh", "29-10-1985", "enzo@gmail.com", "mestre em ninjutso");
    instructors[4] = new Instructor("O Cara", "29-10-1985", "enzo@gmail.com", "the information at hands");
    instructors[5] = new Instructor("Hanzo Hazashi", "19-10-1985", "enzo@gmail.com", "esse eo  cara");

    Course myCourse = new Course("curso de java", "jsf do basico ao avançado", "02-01-2020", "02-07-2020", "online",
        "4002-8922", "email@do.curso");

    // ok
    for (Instructor i : instructors)
      myCourse.addInstructor(i);

    // ok
    // myCourse.showInstructors();
    // System.out.println("+=====+");

    // ok
    // myCourse.showInstructor("Jasdsdo");
    // myCourse.showInstructor(2);

    // myCourse.updateInstructor("Jo", "novoNomeDoRapaiz", "oxe tu eh isso eh");
    // myCourse.updateInstructor("Jo", "novoNomeDoCara");
    myCourse.updateInstructor(5, "josephhhhhh", "oxe joasdad");
    // myCourse.showInstructors();

    // ok
    myCourse.deleteInstructor("Josafá Veríssimo");
    myCourse.deleteInstructor(5);

  }
}