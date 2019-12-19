package test;

import app.information.Course;
import app.person.Student;
import app.person.Teacher;

public class StudentTest {
  public static void main(String[] args) {
    Course[] cursos = new Course[3];
    String[] bibliography = { "uma doiasd", "oasdosaod", "asasod" };

    Teacher[] professores = new Teacher[2];
    String[] academicTraining = { "ufal asdsad", "ifal asdjsiad" };
    professores[0] = new Teacher("joasfasf", "333", "2018-09-10",
        "email@gmail.com", academicTraining);
    professores[1] = new Teacher("asdojasodj", "22", "1231", "asdasd",
        academicTraining);

    cursos[0] = new Course("Titulo do curso de java", "conteudo desse curso",
        "descricao", bibliography, 400, 'A', "fila/path", professores);

    cursos[1] = new Course("Titulo do curso de node", "conteudo node curso",
        "descricao node", bibliography, 400, 'A', "fila/path", professores);

    Student josafa = new Student("Josafa", "123213", "2002-12-12", "email",
        "matricula", cursos);

    // [C]RUD
    // System.out.println(josafa.retrieveCourse(" ").getTitle());
    josafa.updateCourse("Titulo do curso de java", "novo Titulo", "novaDesc");
    josafa.deleteCourse("novo Titulo");

    josafa.listCourses();

  }
}
