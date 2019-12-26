package app.userinterface;

import java.util.Scanner;

import app.company.Company;
import java.io.IOException;
import app.person.Instructor;
import app.towatch.Course;
import app.towatch.Event;

public class Menu {
  private Scanner scanString = new Scanner(System.in);
  private Scanner scanInteger = new Scanner(System.in);

  private Company kubbleware = new Company("Kubbleware");
  private Instructor instructor = null;
  private boolean isVisitor = true;
  private String wellcomeMessage = "    Bem vindo à kubbleware, aqui você pode visualizar nossos cursos e eventos.";
  private String[] visitorChoices = { "Listar Cursos", "Listar Eventos", "Entrar como instrutor", "Sair" };
  private String[] instructorChoices = { "Listar Cursos", "Listar Eventos", "Adicionar Curso", "Adicionar Evento",
      "Atualizar Curso", "Atualizar Evento", "Deletar Curso", "Deletar Evento", "Buscar curso", "Buscar evento",
      "LogOff", "Sair" };
  private int borderLength = wellcomeMessage.length();

  private void cleanWindow() throws IOException, InterruptedException {
    if (System.getProperty("os.name").contains("Windows")) {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } else {
      new ProcessBuilder("clear").inheritIO().start().waitFor();
    }

    this.border(this.borderLength);
  }

  private void border(int borderLength) {
    for (int i = 0; i < borderLength + 4; i++) {
      if (i % 2 == 0) {
        System.out.print("-");
      } else {
        System.out.print("=");
      }
    }
    System.out.println();
  }

  private void showVisitorChoices() {
    for (int i = 0; i < this.visitorChoices.length; i++)
      System.out.println((i + 1) + ". " + this.visitorChoices[i]);
  }

  private int getVisitorChoice() {
    int option = scanInteger.nextInt();
    option -= 1;

    if (option >= 0 && option < this.visitorChoices.length) {
      return option;
    } else {
      return -1;
    }

  }

  private int doVisitorAction(int action) {
    switch (action) {
    case -1:
      System.out.println("Opção inválida");
      break;
    case 0:
      this.kubbleware.showCourses();
      break;
    case 1:
      this.kubbleware.showEvents();
      break;
    case 2:
      this.changeToInstructor();
      break;
    case 3:
      System.out.println("Saindo...");
      action = -2;
      break;
    }

    return action;
  }

  private void showInstructorChoices() {
    for (int i = 0; i < this.instructorChoices.length; i++)
      System.out.println((i + 1) + ". " + this.instructorChoices[i]);
  }

  private int getInstructorChoice() {
    int option = scanInteger.nextInt();
    option -= 1;

    if (option >= 0 && option < this.instructorChoices.length) {
      return option;
    } else {
      return -1;
    }

  }

  private int doInstructorAction(int action) {
    switch (action) {
    case -1:
      System.out.println("Opção inválida");
      break;
    case 0:
      this.kubbleware.showCourses();
      break;
    case 1:
      this.kubbleware.showEvents();
      break;
    case 2:
      System.out.print("Nome do curso: ");
      String courseName = scanString.nextLine();

      System.out.print("Descrição do curso: ");
      String courseDescription = scanString.nextLine();

      System.out.print("Data de inicio: ");
      String courseStartDate = scanString.nextLine();

      System.out.print("Data de finalização do curso: ");
      String courseEndDate = scanString.nextLine();

      System.out.print("Endereço do curso: ");
      String courseAddress = scanString.nextLine();

      System.out.print("Telefone: ");
      String coursePhone = scanString.nextLine();

      System.out.print("Email: ");
      String courseEmail = scanString.nextLine();

      Course course = new Course(courseName, courseDescription, courseStartDate, courseEndDate, courseAddress,
          coursePhone, courseEmail, this.instructor);
      this.kubbleware.addCourse(course);

      break;
    case 3:
      System.out.print("Nome do evento: ");
      String eventName = scanString.nextLine();

      System.out.print("Descrição do evento: ");
      String eventDescription = scanString.nextLine();

      System.out.print("Data de inicio: ");
      String eventStartDate = scanString.nextLine();

      System.out.print("Data de finalização do evento: ");
      String eventEndDate = scanString.nextLine();

      System.out.print("Endereço do evento: ");
      String eventAddress = scanString.nextLine();

      System.out.print("Telefone: ");
      String eventPhone = scanString.nextLine();

      System.out.print("Email: ");
      String eventEmail = scanString.nextLine();

      Event event = new Event(eventName, eventDescription, eventStartDate, eventEndDate, eventAddress, eventPhone,
          eventEmail);
      this.kubbleware.addEvent(event);

      break;
    case 4:
      this.kubbleware.showCourses();

      System.out.println();

      System.out.print("Nome ou descrição do curso para procurar a primeira ocorrência e editá-la: ");
      String courseTextToSearch = scanString.nextLine();

      System.out.print("Novo nome do curso[ENTER para não editar]: ");
      String newCourseName = scanString.nextLine();

      System.out.print("Nova descrição do curso[ENTER para não editar]: ");
      String newCourseDescription = scanString.nextLine();

      System.out.print("Nova data de inicio[ENTER para não editar]: ");
      String newCourseStartDate = scanString.nextLine();

      System.out.print("Nova data de fim[ENTER para não editar]: ");
      String newCourseEndDate = scanString.nextLine();

      System.out.print("Novo endereço[ENTER para não editar]: ");
      String newCourseAddress = scanString.nextLine();

      System.out.print("Novo telefone[ENTER para não editar]: ");
      String newCoursePhone = scanString.nextLine();

      System.out.print("Novo email[ENTER para não editar]: ");
      String newCourseEmail = scanString.nextLine();

      this.kubbleware.updateCourse(courseTextToSearch, newCourseName, newCourseDescription, newCourseStartDate,
          newCourseEndDate, newCourseAddress, newCoursePhone, newCourseEmail);
      break;
    case 5:
      this.kubbleware.showEvents();

      System.out.println();

      System.out.print("Nome ou descrição do evento para procurar a primeira ocorrência e editá-la: ");
      String eventTextToSearch = scanString.nextLine();

      System.out.print("Novo nome do evento[ENTER para não editar]: ");
      String newEventName = scanString.nextLine();

      System.out.print("Nova descrição do evento[ENTER para não editar]: ");
      String newEventDescription = scanString.nextLine();

      System.out.print("Nova data de inicio[ENTER para não editar]: ");
      String newEventStartDate = scanString.nextLine();

      System.out.print("Nova data de fim[ENTER para não editar]: ");
      String newEventEndDate = scanString.nextLine();

      System.out.print("Novo endereço[ENTER para não editar]: ");
      String newEventAddress = scanString.nextLine();

      System.out.print("Novo telefone[ENTER para não editar]: ");
      String newEventPhone = scanString.nextLine();

      System.out.print("Novo email[ENTER para não editar]: ");
      String newEventEmail = scanString.nextLine();

      this.kubbleware.updateEvent(eventTextToSearch, newEventName, newEventDescription, newEventStartDate,
          newEventEndDate, newEventAddress, newEventPhone, newEventEmail);
      break;
    case 6:
      String courseTextToDelete = scanString.nextLine();
      this.kubbleware.deleteCourse(courseTextToDelete);

      break;
    case 7:
      String eventTextToDelete = scanString.nextLine();
      this.kubbleware.deleteEvent(eventTextToDelete);

      break;
    case 8:
      System.out.print("Digte um texto para procurar no nome e descrição do curso: ");
      String courseTextToRetrieve = scanString.nextLine();

      this.kubbleware.showCourse(courseTextToRetrieve);
      break;
    case 9:
      System.out.print("Digte um texto para procurar no nome e descrição do evento: ");
      String eventTextToRetrieve = scanString.nextLine();

      this.kubbleware.showEvent(eventTextToRetrieve);
      break;

    case 10:
      this.changeToVisitor();
      break;
    case 11:
      System.out.println("Saindo...");
      action = -2;
      break;
    }

    return action;
  }

  public void showMenu() {
    this.border(this.borderLength);

    System.out.printf("%s\n\n", wellcomeMessage);

    int option = 0;
    do {
      if (this.isVisitor) {
        this.showVisitorChoices();

        option = this.getVisitorChoice();

        try {
          this.cleanWindow();
        } catch (Exception e) {
          e.printStackTrace();
        }

        option = this.doVisitorAction(option);
      }

      if (!this.isVisitor) {
        this.showInstructorChoices();

        option = this.getInstructorChoice();

        try {
          this.cleanWindow();
        } catch (Exception e) {
          e.printStackTrace();
        }

        option = this.doInstructorAction(option);
      }

    } while (option != -2);
    this.border(this.borderLength);
  }

  private void changeToInstructor() {
    this.isVisitor = false;

    this.setInstructorData();

  }

  private void changeToVisitor() {
    this.isVisitor = true;

    this.instructor = null;
  }

  private void setInstructorData() {
    System.out.printf("Seu nome: ");
    String name = scanString.nextLine();

    System.out.printf("Sua data de aniversário: ");
    String birth = scanString.nextLine();

    System.out.printf("Seu email: ");
    String email = scanString.nextLine();

    System.out.printf("Sua formação: ");
    String formation = scanString.nextLine();

    this.instructor = new Instructor(name, birth, email, formation);
  }

}
