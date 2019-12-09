package test;

import app.information.Course;

public class CourseTest {
    public static void main(String[] args) {
        String[] bibliography = { "teste", "teste2" };
        Course course = new Course("Java avançado", "conteudo(video)", "curso topado de top slk", bibliography, 400,
                'A', "caminho/do/video.mp4");

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

        course.listBiblography();

    }
}