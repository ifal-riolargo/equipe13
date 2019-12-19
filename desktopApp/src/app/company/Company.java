package app.company;

import app.information.Course;

public class Company {
	private String name = "";
	private String cnpj = "";
	private String address = "";
	private String contact = "";
	private String about = "";
	private Course[] courses;

	/**
	 * 
	 * @param name
	 * @param cnpj
	 * @param address
	 * @param contact
	 * @param amountCourses
	 * @param courses
	 */
	public Company(String name, String cnpj, String address, String contact,
			int amountCourses, Course[] courses, String about) {
		this.name = name;
		this.cnpj = cnpj;
		this.address = address;
		this.contact = contact;
		this.courses = courses;
		this.about = about;
	}

	/**
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * 
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * 
	 * @param contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * 
	 * @return the courses
	 */
	public Course[] getCourses() {
		return courses;
	}

	/**
	 * 
	 * @param courses
	 */
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	/**
	 * 
	 * @return the about
	 */
	public String getAbout() {
		return this.about;
	}

	/**
	 * 
	 * @param about
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	// Courses [C]RUD

	/**
	 * 
	 * @param text
	 * @return course or null
	 */
	public Course retrieveCourse(String text) {
		for (Course course : this.courses) {
			if (course.getTitle().indexOf(text) != -1
					|| course.getDescription().indexOf(text) != -1)
				return course;
		}

		return null;
	}

	/**
	 * 
	 * @param text
	 * @param newTitle
	 * @param newDescription
	 * @return boolean
	 */
	public boolean updateCourse(String text, String newTitle,
			String newDescription) {

		Course course = this.retrieveCourse(text);
		if (course == null)
			return false;

		int updates = 0;

		if (newTitle != "") {
			course.setTitle(newTitle);
			updates++;
		}

		if (newDescription != "") {
			course.setDescription(newDescription);
			updates++;
		}

		return updates != 0;
	}

	/**
	 * 
	 * @param text
	 */
	public void deleteCourse(String text) {
		for (int i = 0; i < courses.length - 1; i++) {
			if (courses[i] == null)
				break;
			if (courses[i].getTitle() == text
					|| courses[i].getDescription() == text) {
				for (int j = i; j < courses.length - 1; j++) {
					courses[j] = courses[j + 1];
				}
			}
		}
		courses[courses.length - 1] = null;
	}

	/**
	 * 
	 * @return void
	 */
	public void listCourses() {
		for (Course course : this.courses) {
			if (course == null) {
				break;
			}

			System.out.println(course.getTitle());
		}
	}

}
