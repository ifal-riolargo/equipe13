package app.information;

import app.person.Teacher;

public class Course extends Information {
    private double workload;
    private char level;
    private String filePath;
    private Teacher[] teachers;

    // implement relationship 1-*
    // private Instructor[] instructors;

    /**
     * 
     * @param title
     * @param content
     * @param description
     * @param bibliography
     * @param workload
     * @param level
     * @param filePath
     * @param teachers
     */
    public Course(String title, String content, String description,
            String[] bibliography, double workload, char level, String filePath,
            Teacher[] teachers) {
        super(title, content, description, bibliography);

        this.workload = workload;
        this.level = level;
        this.filePath = filePath;
        this.teachers = teachers;
    }

    /**
     * @return the workload
     */
    public double getWorkload() {
        return workload;
    }

    /**
     * @param workload
     *                     the workload to set
     */
    public void setWorkload(double workload) {
        this.workload = workload;
    }

    /**
     * @return the level
     */
    public char getLevel() {
        return level;
    }

    /**
     * @param level
     *                  the level to set
     */
    public void setLevel(char level) {
        this.level = level;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath
     *                     the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return the teachers
     */
    public Teacher[] getTeachers() {
        return teachers;
    }

    /**
     * @param teachers
     *                     the teachers to set
     */
    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void listTeachers() {
        for (Teacher teacher : this.teachers) {
            System.out.println(teacher.getName());
        }
    }

}