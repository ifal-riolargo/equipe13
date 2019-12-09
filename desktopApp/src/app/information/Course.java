package app.information;

public class Course extends Information {
    private double workload;
    private char level;
    private String filePath;

    // implement relationship 1-*
    // private Instructor[] instructors;

    /**
     * 
     * @param title
     * @param content
     * @param description
     * @param workload
     * @param level
     */
    public Course(String title, String content, String description, String[] bibliography, double workload, char level,
            String filePath) {
        super(title, content, description, bibliography);

        this.workload = workload;
        this.level = level;
        this.filePath = filePath;
    }

    /**
     * @return the workload
     */
    public double getWorkload() {
        return workload;
    }

    /**
     * @param workload the workload to set
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
     * @param level the level to set
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
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}