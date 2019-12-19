package test;

import app.event.Event;
import app.person.Teacher;

public class EventTest {
  public static void main(String[] args) {
    Teacher[] professores = new Teacher[2];
    String[] academicTraining = { "ufal asdsad", "ifal asdjsiad" };
    professores[0] = new Teacher("joasfasf", "333", "2018-09-10",
        "email@gmail.com", academicTraining);
    professores[1] = new Teacher("asdojasodj", "22", "1231", "asdasd",
        academicTraining);

    Event evento = new Event("Tema", "descrição do evento", "2019-09-19",
        "2019-09-19", "14:30", "15:30", "address", professores);

  }
}