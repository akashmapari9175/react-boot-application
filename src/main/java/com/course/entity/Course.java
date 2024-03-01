package com.course.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseTitle;
    private String courseDescription;
    
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getcourseDescription() {
		return courseDescription;
	}
	public void setDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
    

}
