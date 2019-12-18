package app.information;

public abstract class Information {
    private String title;
    private String content;
    private String description;
    private String[] bibliography;

    /**
     * 
     * @param title
     * @param content
     * @param description
     * @param bibliography
     */
    public Information(String title, String content, String description, String[] bibliography) {
        this.title = title;
        this.content = content;
        this.description = description;
        this.bibliography = bibliography;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the bibliography
     */
    public String[] getBibliography() {
        return bibliography;
    }

    /**
     * @param bibliography the bibliography to set
     */
    public void setBibliography(String[] bibliography) {
        this.bibliography = bibliography;
    }

    public void listBiblography() {
        for (String reference : this.bibliography) {
            System.out.println(reference);

        }
    }

}