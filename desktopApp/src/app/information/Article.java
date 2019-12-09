package app.information;

public class Article extends Information {
    private String abstrakt; // article abstract

    // implement relationship 1-*
    // private Instructor[] authors;

    public Article(String title, String content, String description,
            String[] bibliography, String abstrakt) {
        super(title, content, description, bibliography);

        this.abstrakt = abstrakt;
    }

    /**
     * @return the abstrakt
     */
    public String getAbstrakt() {
        return abstrakt;
    }

    /**
     * @param abstrakt the abstrakt to set
     */
    public void setAbstrakt(String abstrakt) {
        this.abstrakt = abstrakt;
    }
}