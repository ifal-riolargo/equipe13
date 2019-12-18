package test;

import app.information.Course;

import app.person.Teacher;

public class CourseTest {
    public static void main(String[] args) {
        String[] bibliography = { "teste", "teste2" };
        Teacher[] professores = new Teacher[2];
        professores[0] = new Teacher("josafa", "333", "2002-08-02",
                "asdad@gmail.com", bibliography);
        professores[1] = new Teacher("Jay", "333", "2002-08-02",
                "asdad@zxcxzc.com", bibliography);
        Course course = new Course("Java avançado", "conteudo(video)",
                "curso topado de top slk", bibliography, 400, 'A',
                "caminho/do/video.mp4", professores);

        course.setTitle("Novo titulo do curso");
        course.setContent("Video novo upado");
        course.setDescription("Essa descrição fica bem melhor");
        course.setWorkload(800);
        course.setLevel('C');
        course.setFilePath("Essa/caminho/eh/mais/intuitivo");

        System.out.println(course.getTitle());
        System.out.println(course.getContent());
        System.out.println(course.getDescription());
        System.out.println(course.getWorkload());
        System.out.println(course.getLevel());
        System.out.println(course.getFilePath());

        course.listTeachers();

        course.listBiblography();

    }
}