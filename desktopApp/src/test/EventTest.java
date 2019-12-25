package test;

import app.towatch.Event;
import app.person.Instructor;

public class EventTest {
  public static void main(String[] args) {
    Instructor[] instructors = new Instructor[6];
    instructors[0] = new Instructor("Josafá Veríssimo", "02-08-2002", "josafa@gmail.com",
        "doutor em ciências da computação");
    instructors[1] = new Instructor("Jenrique Joarez", "21-03-1999", "hendoRick@gmail.com", "técnico em redes");
    instructors[2] = new Instructor("Jenzo Hanzo", "29-10-1985", "enzo@gmail.com", "mestre em sistemas da informção");
    instructors[3] = new Instructor("HEehehh", "29-10-1985", "enzo@gmail.com", "mestre em ninjutso");
    instructors[4] = new Instructor("O Cara", "29-10-1985", "enzo@gmail.com", "the information at hands");
    instructors[5] = new Instructor("Hanzo Hazashi", "19-10-1985", "enzo@gmail.com", "esse eo  cara");

    Event myEvent = new Event("curso de java", "jsf do basico ao avançado", "02-01-2020", "02-07-2020", "online",
        "4002-8922", "email@do.curso");

    // ok
    for (Instructor i : instructors)
      myEvent.addInstructor(i);

    // ok
    // myEvent.showInstructors();
    // System.out.println("+=====+");

    // ok
    // myEvent.showInstructor("Jasdsdo");
    // myEvent.showInstructor(2);

    // myEvent.updateInstructor("Jo", "novoNomeDoRapaiz", "oxe tu eh isso eh");
    // myEvent.updateInstructor("Jo", "novoNomeDoCara");
    myEvent.updateInstructor(5, "josephhhhhh", "oxe joasdad");
    // myEvent.showInstructors();

    // ok
    myEvent.deleteInstructor("Josafá Veríssimo");
    myEvent.deleteInstructor(5);

  }
}