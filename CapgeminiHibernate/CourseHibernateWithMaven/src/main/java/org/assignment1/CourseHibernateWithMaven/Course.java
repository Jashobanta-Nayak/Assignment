package org.assignment1.CourseHibernateWithMaven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Course_details")
public class Course {
	
	/// CourseID, CourseName, CoursePrice, courseDuration
	@Id
	private int courseID;
	private String courseName;
	private int coursePrice;
	private String courseDuration;
	
	// parameterized constructor
	public Course(int courseID, String courseName, int coursePrice, String courseDuration) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.courseDuration = courseDuration;
	}
	// zero-parameterized constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Setter & getter methods
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", coursePrice=" + coursePrice
				+ ", courseDuration=" + courseDuration + "]";
	}
	

	
	
}
