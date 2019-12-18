package app.information;

import app.person.Teacher;

public class Article extends Information {
    private String abstrakt = ""; // article abstract
    private Teacher[] authors;

    /**
     * 
     * @param title
     * @param content
     * @param description
     * @param bibliography
     * @param abstrakt
     * @param authors
     */
    public Article(String title, String content, String description,
            String[] bibliography, String abstrakt, Teacher[] authors) {
        super(title, content, description, bibliography);

        this.abstrakt = abstrakt;
        this.authors = authors;
    }

    /**
     * @return the abstrakt
     */
    public String getAbstrakt() {
        return abstrakt;
    }

    /**
     * @param abstrakt
     *                     the abstrakt to set
     */
    public void setAbstrakt(String abstrakt) {
        this.abstrakt = abstrakt;
    }
}