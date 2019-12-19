package app.event;

import app.person.Teacher;

public class Event {
    private String subject = "";
    private String description = "";
    private String startDate = "";
    private String endDate = "";
    private String startTime = "";
    private String endTime = "";
    private String address = "";
    private Teacher[] speakers;

    /**
     * 
     * @param subject
     * @param description
     * @param startDate
     * @param endDate
     * @param startTime
     * @param endTime
     * @param address
     * @param speakers
     */

    public Event(String subject, String description, String startDate,
            String endDate, String startTime, String endTime, String address,
            Teacher[] speakers) {

        this.subject = subject;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.address = address;
        this.speakers = speakers;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject
     *                    the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *                        the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     *                      the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     *                    the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     *                      the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     *                    the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @param address
     *                    the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the speakers
     */
    public Teacher[] getSpeakers() {
        return speakers;
    }

    /**
     * @param speakers
     *                     the speakers to set
     */
    public void setSpeakers(Teacher[] speakers) {
        this.speakers = speakers;
    }
}